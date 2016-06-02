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
Nomes (tamb�m chamados de identificadores) em Lua podem ser qualquer cadeia de letras, d�gitos, e sublinhados, que n�o iniciam com um d�gito. Identificadores s�o usados para nomear vari�veis, campos de tabelas, e r�tulos.*/
Nome              :('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
//Palavrasreservadas:('and'|'break'|'do'|'else'|'elseif'|'end'|'false'|'for'|'function'|'goto'|'if'|'in'|'local'|'nil'|'not'|'or'|'repeat'|'return'|'then'|'true'|'until'|'while');
Numero            :('0'..'9')+ ('.' ('0'..'9')*)?;
//Cadeias literais podem ser delimitadas por aspas simples ou duplas balanceadas
Cadeia            :'"'~('\n'|'\t' | '\r' )* '"'|
                   '\''~('\n'|'\t' | '\r' )* '\'';

Ws              : [ \t\r\n]+ -> skip ;

Comentario      : '--' ~[\r\n]* '\r'? '\n' -> skip;

Separadordecampos : ',' | ';' ;
opbin             : '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
                    '<' | '<=' | '>' | '>=' | '==' | '~=' | 
                    'and' | 'or' ;
opunaria          : '-' | 'not' | '#' ;

programa          : trecho ;
trecho            : (comando (';')?)* (ultimocomando (';')?)? ;
bloco             : trecho ;
comando           : listavar '=' listaexp | 
                    chamadadefuncao | 
                    'do' bloco 'end' | 
                    'while' exp 'do' bloco 'end' | 
                    'repeat' bloco 'until' exp | 
                    'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' | 
                    'for' Nome '=' exp ',' exp (',' exp)? 'do' bloco 'end' | 
                    'for' listadenomes 'in' listaexp 'do' bloco 'end' | 
                    'function' nomedafuncao corpodafuncao | 
                    'local' 'function' Nome corpodafuncao | 
                    'local' listadenomes ('=' listaexp)? ;
ultimocomando     : 'return' (listaexp)? | 'break' ;
nomedafuncao      : Nome ('.' Nome)* (':' Nome)? ;
listavar          : var (',' var)* ;
var               : Nome | expprefixo '[' exp ']' | expprefixo '.' Nome ;
chamadadefuncao   : expprefixo args | expprefixo ':' Nome args ;
expprefixo        : Nome | '(' exp ')' | Nome expprefixoTail | '(' exp ')' expprefixoTail ;
expprefixoTail    : '[' exp ']' | '.' Nome | args | ':' Nome args |
                    '[' exp ']' expprefixoTail | '.' Nome expprefixoTail | args expprefixoTail | ':' Nome args expprefixoTail ;
listadenomes      : Nome (',' Nome)* ;
listaexp          : (exp ',')* exp ;
exp               : 'nil' | 'false' | 'true' | Numero | Cadeia | '...' | funcao | 
                    expprefixo | construtortabela | exp opbin exp | opunaria exp ;
args              : '(' (listaexp)? ')' | construtortabela | Cadeia ;
funcao            : 'function' corpodafuncao ;
corpodafuncao     : '(' (listapar)? ')' bloco 'end' ;
listapar          : listadenomes (',' '...')? | '...' ;
construtortabela  : '{' (listadecampos)? '}' ;
listadecampos     : campo (Separadordecampos campo)* (Separadordecampos)? ;
campo             : '[' exp ']' '=' exp | Nome '=' exp | exp ;

