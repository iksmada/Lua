/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="495913, 495719, 558311";
}

/* NOME pode qualquer cadeia de letras, digitos e sublinhados que nao inicie com um digito e nao seja uma palavra reservada. */
NOME              
    :   ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
    ;
/* PALAVRAS RESERVADAS sao palavras-chave usadas pela linguagem Lua e, portanto, nao podem ser utilizadas como nomes. */
PALAVRASRESERVADAS
    :   'and' | 'break' | 'do' | 'else' | 'elseif' | 'end' | 'false' | 'for' 
    |   'function' | 'goto' | 'if' | 'in' | 'local' | 'nil' | 'not' | 'or' 
    |   'repeat' | 'return' | 'then' | 'true' | 'until' | 'while'
    ;
/* NUMERO define o formato dos numeros aceitos pela linguagem Lua. */
NUMERO            
    :   ('0'..'9')+ ('.' ('0'..'9')*)?
    ;
/* CADEIA define as cadeiras de caracteres, que podem ser delimitadas por aspas simples ou aspas duplas. */
CADEIA 
    :   '"'  ~( '\n' | '\t' | '\r' )* '"'
    |   '\'' ~( '\n' | '\t' | '\r' )* '\''
    ;
/* WS faz o tratamento de espaços em branco (whitespaces). */
WS              
    :   [ \t\r\n]+ -> skip 
    ;
/* COMENTARIO inicia com hifen duplo. */
COMENTARIO      
    :   '--' ~[\r\n]* '\r'? '\n' -> skip
    ;
/* SEPARADOR DE CAMPOS deve ser virugla ou ponto-e-virgula*/
SEPARADORDECAMPOS 
    :   ',' | ';' 
    ;
/* Operadores binarios */
opbin
    :   '+' | '-' | '*' | '/' | '^' | '%' | '..' 
    |   '<' | '<=' | '>' | '>=' | '==' | '~=' 
    |   'and' | 'or' 
    ;
/* Operadores unarios */
opunaria          
    : '-' | 'not' | '#' 
    ;

/* 
As demais regras, com excecao de "expprefixo", foram baseadas na gramatica da Lua contida no manual da linguagem, efetuando apenas as traducoes necessarias para a sintaxe do ANTLR e inserindo as acoes semanticas para gerar a tabela de simbolos. No caso de "expprefixo", alem dos ajustes sintaticos, foram feitas modificacoes na regra a fim de remover a recursividade a esquerda. 
*/

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

/*
Inicialmente tinha-se uma recursao indireta a esquerda envolvendo as seguintes regras:
    expprefixo      : var | chamadadefuncao | '(' exp ')' ;
    var             : NOME | expprefixo '['' exp ']' | expprefixo '.' NOME ;
    chamadadefuncao : expprefixo args | expprefixo ':' NOME args ;

Para eliminar a recursao, primeiramente foram expandidas as producoes de "var" e "chamadadefuncao" dentro da regra "expprefixo", obtendo:
    expprefixo
        : NOME | expprefixo '['' exp ']' | expprefixo '.' NOME  *//* var *//*
        | expprefixo args | expprefixo ':' NOME args            *//* chamadadefuncao *//*
        | '(' exp ')' ;

Em seguida, foi utilizado o seguinte algoritmo para remocao de recursao direta a esquerda:
    Seja a gramática:
        A -> Aa | b
    Modificar a gramática da seguinte forma:
        A  -> bA' | b
        A' -> aA' | a

No caso da gramática da linguagem Lua,
    A = expprefixo, 
    A' = expprefixoTail, 
    b = (NOME | '(' exp ')'),
    a = ('['' exp ']' | '.' NOME | args | ':' NOME args)

Fazendo os devidos ajustes para geracao da tabela de simbolos, obtivemos as seguintes regras "expprefixo" e "expprefixoTail".
*/

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
    |   '[' exp ']' expprefixoTail 
    |   ':' NOME args expprefixoTail 
    ;
