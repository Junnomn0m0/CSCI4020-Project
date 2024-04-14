grammar Expr;

@header {
	package antlr;
	import backend.*;
}

prog: statement+ ;

statement : expr SEMICOLON ;

expr : INT
     | STRING
     | DOUBLE
     | FLOAT
     | BOOLEAN
     | NULL
     | expr PLUS expr
     | ID
     ;

INT : 'int';
STRING : 'string';
DOUBLE : 'double';
FLOAT : 'float';
BOOLEAN : 'boolean';
NULL : 'null';
ID : [a-zA-Z]+ ;
PLUS : '+';
SEMICOLON : ';';
WS : [ \t\r\n]+ -> skip ;