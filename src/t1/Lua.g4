/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="495913, 495719, 558311";
}

/*ref: https://github.com/antlr/antlr4/blob/master/doc/lexer-rules.md#lexer-rule-elements
        https://github.com/antlr/antlr4/blob/master/doc/parser-rules.md#rule-elements
Nomes (tambem chamados de identificadores) em Lua podem ser qualquer cadeia de letras, digitos, e sublinhados, que nao iniciam com um digito. Identificadores sao usados para nomear variaveis, campos de tabelas, e rotulos.*/

NOME              
    :   ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
    ;
/*Palavras reservadas são as funções utilizadas pela Linguagem LUA*/
PALAVRASRESERVADAS
    :   'and' | 'break' | 'do' | 'else' | 'elseif' | 'end' | 'false' | 'for' 
    |   'function' | 'goto' | 'if' | 'in' | 'local' | 'nil' | 'not' | 'or' 
    |   'repeat' | 'return' | 'then' | 'true' | 'until' | 'while'
    ;
/*Numeros define o formato dos numeros aceitos pela Linguagem Lua*/
NUMERO            
    :   ('0'..'9')+ ('.' ('0'..'9')*)?
    ;
/*Por convenção as strings podem ser do formato definido abaixo, com tabulações, pula linha(\n), ou seja, uma mesma string pode conter uma parte em uma linha e outra parte na linha seguinte.
Também é possível que a string inicie com aspas duplas e colchetes e termine da mesma maneira. Números e letras também podem ser escritos de acordo com a tabela ASCII*/
CADEIA 
    :   '"' ~( '\n' | '\t' | '\r' )* '"'
    |   '\''~( '\n' | '\t' | '\r' )* '\''
    ;
WS              
    :   [ \t\r\n]+ -> skip 
    ;
/*De acordo com a linguagem Lua, comentários devem ser iniciados com um hífen duplo*/
COMENTARIO      
    :   '--' ~[\r\n]* '\r'? '\n' -> skip
    ;
/*Separadores de campos devem ser vírgula ou ponto e vírgula*/
SEPARADORDECAMPOS 
    :   ',' | ';' 
    ;
/*São todos os operadores binários definidos pela linguagem Lua*/
opbin
    :   '+' | '-' | '*' | '/' | '^' | '%' | '..' 
    |   '<' | '<=' | '>' | '>=' | '==' | '~=' 
    |   'and' | 'or' 
    ;
/*Operadores unários da linguagem*/
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
/*Inicialmente tinha-se o seguinte trecho de codigo:
    expprefixo        : var | chamadadefuncao | '(' exp ')' ;
Para eliminar a recursão indireta a esquerda foi utilizado o seguinte algoritmo:
Seja a gramática:
    A --> Ba | Aa | c
    B --> Bb | Ab | d

Primeiro removemos a recursão imediata de A:
    A --> B a Atail | c Atail
    Atail --> a Atail | e

Segundo eliminamos a recursão indireta de B --> Ab:
    B --> B b | B a Atail b | c Atail b | d

E por último removemos a recursão imediata de B:
    B --> c Atail b Btail | d Btail
    Btail --> b Btail | a Atail b Btail | e

Que no caso do nosso código gerou as regras de expprefixoTail
    
*/
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
