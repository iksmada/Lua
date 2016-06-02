/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

@members {
   public static String grupo="495913";
}

/*Nomes (também chamados de identificadores) em Lua podem ser qualquer cadeia de letras, dígitos, e sublinhados, que não iniciam com um dígito. Identificadores são usados para nomear variáveis, campos de tabelas, e rótulos.*/
Nome              :('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
Palavrasreservadas:('and'|'break'|'do'|'else'|'elseif'|'end'|'false'|'for'|'function'|'goto'|'if'|
                      'in'|'local'|'nil'|'not'|'or'|'repeat'|'return'|'then'|'true'|'until'|'while');
Numero            :('0'..'9')+ ('.' ('0'..'9')*)?;
//Cadeias literais podem ser delimitadas por aspas simples ou duplas balanceadas
Cadeia            :'"'~('\n'|'\t' | '\r' ) '"'|
                   '\''~('\n'|'\t' | '\r' ) '\'';
WS                : [ \t\r\n]+ -> skip ;

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
expprefixo        : (chamadadefuncao | '(' exp ')' | Nome ) empprefixoTail;
empprefixoTail    : ('[' exp ']'|'.' Nome) empprefixoTail|;
chamadadefuncao   : ( '(' exp ')' | Nome ) chamadaTail;
chamadaTail       : empprefixoTail (':' Nome)? args chamadaTail;
/*chamadadefuncao   : ('(' exp ')'|var) chamdadedefuncaoTail;
chamdadedefuncaoTail:(':' Nome)? args chamdadedefuncaoTail;*/
listadenomes      : Nome | (',' Nome)* ;
listaexp          : (exp ',')* exp ;
exp               : 'nil' | 'false' | 'true' | Numero | Cadeia | '...' | funcao | 
                    expprefixo | construtortabela | exp opbin exp | opunaria exp ;
args              : '(' (listaexp)? ')' | construtortabela | Cadeia ;
funcao            : 'function' corpodafuncao ;
corpodafuncao     : '(' (listapar)? ')' bloco 'end' ;
listapar          : listadenomes (',' '...')? | '...' ;
construtortabela  : '{' (listadecampos)? '}' ;
listadecampos     : campo (separadordecampos campo)* (separadordecampos)? ;
campo             : '[' exp ']' '=' exp | Nome '=' exp | exp ;
separadordecampos : ',' | ';' ;
opbin             : '+' | '-' | '*' | '/' | '^' | '%' | '..' | 
                    '<' | '<=' | '>' | '>=' | '==' | '~=' | 
                    'and' | 'or' ;
opunaria          : '-' | 'not' | '#' ;

