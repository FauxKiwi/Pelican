grammar PelicanPreprocessor;

////////////
// PARSER //
////////////

preprocessing_unit
    : any_list? EOF
    ;

any_list
    : NEW_LINE any_list
    | any (NEW_LINE? any_list)*
    | any (NEW_LINE any_list?)*
    ;

any
    : define_directive NEW_LINE?
    | undef_directive
    | conditional_directive
    | meta_directive NEW_LINE?
    | normal_text
    ;

define_directive
    : DEFINE one_word parenthesed_macro_parameters? macro_body
    ;

undef_directive
    : UNDEF one_word
    ;

conditional_directive
    : condition_directive (if_block=any_list | NEW_LINE)?
    (elif_directive (elif_block=any_list | NEW_LINE)?)*
    (ELSE (else_block=any_list | NEW_LINE)?)?
    ENDIF
    ;

condition_directive
    : (IFDEF | IFNDEF) one_word
    | if_directive
    ;

if_directive
    : IF if_expression
    ;

if_expression
    : OPEN_PAREN if_expression CLOSE_PAREN
    | WORD
    | (not_defined='!defined' | defined='defined') if_expression
    | not='!' if_expression
    | if_expression (equals='==' | not_equals='!=') if_expression
    ;

elif_directive
    : ELIF one_word
    ;

meta_directive
    : (WARN | ERROR | PRAGMA) WORD*
    ;


parenthesed_macro_parameters
    : OPEN_PAREN macro_parameters? CLOSE_PAREN
    ;

macro_parameters
    : (one_word | ellipsis='...') (COMMA macro_parameters)?
    ;

macro_body
    : (concat_hash | stringize_hash | WORD | OPEN_PAREN | CLOSE_PAREN | COMMA)+
    ;

concat_hash
    : WORD HASH HASH WORD
    ;

stringize_hash
    : HASH WORD
    ;


one_word
    : WORD
    ;

normal_text
    : (WORD | HASH | OPEN_PAREN | CLOSE_PAREN | COMMA)+
    ;

///////////
// LEXER //
///////////

// Symbols

HASH: '#';

OPEN_PAREN: '(';
CLOSE_PAREN: ')';

COMMA: ',';

BACKSLASH: '\\' NewLine -> skip;

// Directives

DEFINE: '#define';
UNDEF: '#undef';
IFDEF: '#ifdef';
IFNDEF: '#ifndef';

IF: '#if';
ELIF: '#elif';
ELSE: '#else';
ENDIF: '#endif';

WARN: '#warn';
ERROR: '#error';

PRAGMA: '#pragma';

// Unaffected

fragment STRING: '"' .*? '"';
fragment LINE_COMMENT: '//' .*? NewLine;
fragment DELIMITED_COMMENT: '/*' .*? '*/';

// Text

fragment Character: ~[\u000D\u000A\u0085\u2028\u2029 ()#,];
fragment NewLine: [\u000D\u000A\u0085\u2028\u2029];
NEW_LINE: NewLine;
SPACE: [ \f\t] -> skip;
WORD: STRING | LINE_COMMENT | DELIMITED_COMMENT | Character+;