lexer grammar PelicanLexer;

channels { COMMENTS_CHANNEL }

// Skip

SINGLE_LINE_DOC_COMMENT: '///' InputCharacter* -> channel(COMMENTS_CHANNEL);
EMPTY_DELIMITED_DOC_COMMENT: '/***/' -> channel(COMMENTS_CHANNEL);
DELIMITED_DOC_COMMENT: '/**' ~'/' .*? '*/' -> channel(COMMENTS_CHANNEL);
SINGLE_LINE_COMMENT: '//' InputCharacter* -> channel(COMMENTS_CHANNEL);
DELIMITED_COMMENT: '/*' .*? '*/' -> channel(COMMENTS_CHANNEL);

WHITESPACES: (Whitespace | NewLine) -> channel(HIDDEN);

// Keywords

BOOL: 'bool';
BREAK: 'break';
BYTE: 'byte';
CHAR: 'char';
CLASS: 'class';
CONTINUE: 'continue';
CONST: 'const';
DO: 'do';
DOUBLE: 'double';
ELSE: 'else';
ENUM: 'enum';
EXTERN: 'extern';
FALSE_: 'false';
FLOAT: 'float';
FOR: 'for';
FOREACH: 'forEach';
FUNCTION: 'function';
GOTO: 'goto';
IF: 'if';
INT: 'int';
INTERFACE: 'interface';
INTERNAL: 'internal';
LONG: 'long';
NEW: 'new';
NULL: 'null';
PRIVATE: 'private';
PROPERTY: 'property';
PROTECTED: 'protected';
PUBLIC: 'public';
RETURN: 'return';
SBYTE: 'sbyte';
SHORT: 'short';
SIZEOF: 'sizeof';
STATIC: 'static';
STRUCT: 'struct';
SWITCH: 'switch';
THIS: 'this';
TRUE_: 'true';
TYPENAME: 'typename';
UINT: 'uint';
ULONG: 'ulong';
UNION: 'union';
USHORT: 'ushort';
VAR: 'var';
VARARG: 'vararg';
VOID: 'void';
WHILE: 'while';

// Identifiers

ID: IdentifierOrKeyword;

// Literals

LITERAL_ACCES: NumberLiteral IntegerTypeSuffix? '.' IdentifierOrKeyword;
INTEGER_LITERAL: NumberLiteral IntegerTypeSuffix?;
HEX_INTEGER_LITERAL: '0' [xX] ('_'* HexDigit)+ IntegerTypeSuffix?;
BIN_INTEGER_LITERAL: '0' [bB] ('_'* [01])+ IntegerTypeSuffix?;
REAL_LITERAL: NumberLiteral? '.' NumberLiteral ExponentPart? [fFdD] | NumberLiteral [fFdD];

CHARACTER_LITERAL: '\'' RegularCharacter '\'';
REGULAR_STRING: '"' (RegularCharacter)* '"';

// Operators and Punctuation

OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_BRACKET: '[';
CLOSE_BRACKET: ']';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
DOT: '.';
COMMA: ',';
COLON: ':';
SEMI: ';';

PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
AMP: '&';
OR: '|';
CARET: '^';
BANG: '!';
TILDE: '~';
ASSIGN: '=';
LT: '<';
GT: '>';
BIG_ARROW: '=>';
QUESTION: '?';
DOUBLE_COLON: '::';

OP_COALESCING: '??';
OP_INC: '++';
OP_DEC: '--';
OP_AND: '&&';
OP_OR: '||';
OP_ARROW: '->';
OP_EQ: '==';
OP_NE: '!=';
OP_IDENTITY: '===';
OP_NIDENTITY: '!==';
OP_LTE: '<=';
OP_GTE: '>=';
OP_PLUS_ASSIGN: '+=';
OP_MINUS_ASSIGN: '-=';
OP_TIMES_ASSIGN: '*=';
OP_DIV_ASSIGN: '/=';
OP_REM_ASSIGN: '%=';
OP_AND_ASSIGN: '&=';
OP_XOR_ASSIGN: '^=';
OP_OR_ASSIGN: '|=';
OP_SHL_ASSIGN: '<<=';
OP_SHR_ASSIGN: '>>=';
OP_COALESCING_ASSIGN: '??=';
OP_RANGE: '..';
OP_SPREAD: '...';

// Fragments

fragment InputCharacter: ~[\r\n\u0085\u2028\u2029];
fragment NewLineCharacter: [\u000D\u000A\u0085\u2028\u2029];

fragment NumberLiteral: [0-9] ('_'* [0-9])*;
fragment HexDigit: [0-9] | [a-f];
fragment IntegerTypeSuffix: [lL]? [uU] | [uU]? [lL]?;
fragment ExponentPart: [eE] ('+' | '-')? NumberLiteral;

fragment RegularCharacter: (~[\\\r\n\u0085\u2028\u2029] | EscapeCharacter);
fragment EscapeCharacter: SimpleEscapeSequence | UnicodeEscapeSequence;
fragment SimpleEscapeSequence: '\\' ('\'' | '"' | [0-9] | [abfnrtv]);
fragment UnicodeEscapeSequence: '\\u' HexDigit HexDigit HexDigit HexDigit;

fragment NewLine: '\r\n' | '\r' | '\n' | '\u0085';
fragment Whitespace: [ \f\t];

fragment IdentifierOrKeyword: IdentifierStartCharacter IdentifierPartCharacter*;
fragment IdentifierStartCharacter: [a-zA-Z] | '_';
fragment IdentifierPartCharacter: [a-zA-Z] | [0-9] | '_';