/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Lua;

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
listadenomes      : Nome | (',' Nome)* ;
listaexp          : (exp ',')* exp ;
exp               : 'nil' | 'false' | 'true' | Numero | Cadeia | '...' | funcao | 
                    expprefixo | construtortabela | exp opbin exp | opunaria exp ;
expprefixo        : var | chamadadefuncao | '(' exp ')' ;
chamadadefuncao   : expprefixo args | expprefixo ':' Nome args ;
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

/*
@members {
   public static String grupo="<<495913>>";
}
*/
