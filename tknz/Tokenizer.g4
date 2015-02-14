grammar Tokenizer;

/** Defines one or more automatons. */
s : automaton* ;

automaton        : automatonModifiers* AUTOMATON Identifier state* ;

state            : stateModifier* STATE Identifier transition*;

transition       : setTransition | rangeTransition ;

setTransition    : WITH StringLiteral GOTO Identifier ;

rangeTransition  : FROM StringLiteral TO StringLiteral GOTO Identifier ;

automatonModifiers : IGNORE ;
stateModifier      : START | STOP ;

AUTOMATON : 'automaton' ;
STATE     : 'state' ;
WITH      : 'with' ;
FROM      : 'from' ;
TO        : 'to' ;
GOTO      : 'goto' ;
START     : 'start' ;
STOP      : 'stop' ;

Identifier : [A-Za-z0-9-_]+ ;
IGNORE     : 'ignore' ;

fragment DQUOTE         : '"' ;
fragment SQUOTE         : '\'';
fragment CHAR_L : [-A-Za-z0-9`~!@#$%^&*()_+{}\* ] ;
fragment DQUOTE_STRING : DQUOTE (SQUOTE | CHAR_L)* DQUOTE ;
fragment SQUOTE_STRING : SQUOTE (DQUOTE | CHAR_L)* SQUOTE ;

StringLiteral   : SQUOTE_STRING | DQUOTE_STRING;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\n\r]* -> skip;

// https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4
