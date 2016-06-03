/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="495913, 495719";
}

/*ref: https://github.com/antlr/antlr4/blob/master/doc/lexer-rules.md#lexer-rule-elements
        https://github.com/antlr/antlr4/blob/master/doc/parser-rules.md#rule-elements
Nomes (tambem chamados de identificadores) em Lua podem ser qualquer cadeia de letras, digitos, e sublinhados, que nao iniciam com um digito. Identificadores sao usados para nomear variaveis, campos de tabelas, e rotulos.*/

NOME              
    :   ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
    ;
/*PALAVRASRESERVADAS
    :   'and' | 'break' | 'do' | 'else' | 'elseif' | 'end' | 'false' | 'for' 
    |   'function' | 'goto' | 'if' | 'in' | 'local' | 'nil' | 'not' | 'or' 
    |   'repeat' | 'return' | 'then' | 'true' | 'until' | 'while'
    ;*/
NUMERO            
    :   ('0'..'9')+ ('.' ('0'..'9')*)?
    ;
CADEIA 
    :   '"' ~( '\n' | '\t' | '\r' )* '"'
    |   '\''~( '\n' | '\t' | '\r' )* '\''
    ;
WS              
    :   [ \t\r\n]+ -> skip 
    ;
COMENTARIO      
    :   '--' ~[\r\n]* '\r'? '\n' -> skip
    ;
SEPARADORDECAMPOS 
    :   ',' | ';' 
    ;
opbin
    :   '+' | '-' | '*' | '/' | '^' | '%' | '..' 
    |   '<' | '<=' | '>' | '>=' | '==' | '~=' 
    |   'and' | 'or' 
    ;
opunaria          
    : '-' | 'not' | '#' 
    ;
programa
    :   trecho 
    ;
trecho            
    :   (comando (';')?)* (ultimocomando (';')?)? 
    ;
bloco             
    :   trecho 
    ;
comando           
    :   listavar '=' listaexp 
    |   chamadadefuncao 
    |   'do' bloco 'end' 
    |   'while' exp 'do' bloco 'end' 
    |   'repeat' bloco 'until' exp 
    |   'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' 
    |   'for' NOME '=' exp ',' exp (',' exp)? 'do' bloco 'end' 
    |   'for' listadenomes 'in' listaexp 'do' bloco 'end' 
    |   'function' nomedafuncao { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); } corpodafuncao 
    |   'local' 'function' NOME corpodafuncao 
    |   'local' listadenomes ('=' listaexp)? 
    ;
ultimocomando     
    :   'return' (listaexp)? | 'break' 
    ;
nomedafuncao      
    :   NOME ('.' NOME)* (':' NOME)?   
    ;
listavar          
    :   var (',' var)* 
    ;
var               
    :   NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } 
    |   expprefixo '[' exp ']' 
    |   expprefixo '.' NOME 
    ;
chamadadefuncao   
    :   NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO); } args 
    |   expprefixo ':' NOME args 
    ;
expprefixo        
    :   NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } 
    |   '(' exp ')' 
    |   NOME expprefixoTail
    |   '(' exp ')' expprefixoTail 
    |   nomedafuncao args { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text,Tipo.FUNCAO); }
    ;
expprefixoTail    
    :   '[' exp ']' 
    |   '.' NOME //{ TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO); } 
    //|   args 
    //|   ':' NOME args 
    |   '[' exp ']' expprefixoTail 
    //|   '.' NOME expprefixoTail 
    //|   args expprefixoTail 
    |   ':' NOME args expprefixoTail 
    ;
listadenomes      
    :   NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } (',' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); } )* 
    ;
listaexp          
    :   (exp ',')* exp 
    ;
exp               
    :   'nil' | 'false' | 'true' | NUMERO | CADEIA | '...' | funcao 
    |   expprefixo | construtortabela | exp opbin exp | opunaria exp 
    ;
args              
    :   '(' (listaexp)? ')' | construtortabela | CADEIA 
    ;
funcao            
    :   'function' corpodafuncao 
    ;
corpodafuncao     
    :   '(' (listapar)? ')' bloco 'end' 
    ;
listapar          
    :   listadenomes (',' '...')? | '...' 
    ;
construtortabela  
    :   '{' (listadecampos)? '}' 
    ;
listadecampos     
    :   campo (SEPARADORDECAMPOS campo)* (SEPARADORDECAMPOS)? 
    ;
campo
    :   '[' exp ']' '=' exp | NOME '=' exp | exp 
    ;