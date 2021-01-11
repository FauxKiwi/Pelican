parser grammar PelicanParser;

options { tokenVocab = PelicanLexer; }

translation_unit
    : declaration_seq? EOF
    ;

// Expressions

expression
    : basic_expression
    | assignment_expression
    | invocation_expression
    | sequence_expression
    ;

basic_expression
    : OPEN_PAREN expression CLOSE_PAREN
    | literal_expression
    | lambda_expression
    | variable
    | THIS
    ;

literal_expression
    : integer_literal //#int_literal
    | REAL_LITERAL //#real_literal
    | CHARACTER_LITERAL //#char_literal
    | REGULAR_STRING //#string_literal
    | (TRUE_ | FALSE_) //#bool_literal
    | NULL //#null_literal
    ;

integer_literal
    : INTEGER_LITERAL //#int_literal
    | HEX_INTEGER_LITERAL //#int_literal
    | BIN_INTEGER_LITERAL
    ;

lambda_expression
    : (label_name COLON)? (destructed_var_name | OPEN_PAREN CLOSE_PAREN) BIG_ARROW OPEN_BRACE statement CLOSE_BRACE
    ;

postfix_expression
    : basic_expression (OP_INC | OP_DEC)*
    | invocation_expression
    | indexing_expression
    ;

invocation_expression
    : basic_expression OPEN_PAREN arg_list? CLOSE_PAREN
    | function_invocation_statement
    ;

indexing_expression
    : basic_expression OPEN_BRACKET expression* CLOSE_BRACKET
    ;

prefix_expression
    : (OP_INC | OP_DEC | PLUS | MINUS | BANG | TILDE | STAR | AMP | NEW)* postfix_expression
    | sizeof_expression
    ;

sizeof_expression
    : SIZEOF (postfix_expression | OPEN_PAREN type CLOSE_PAREN)
    ;

product_expression
    : prefix_expression ((STAR | SLASH | PERCENT) prefix_expression)*
    ;

sum_expression
    : product_expression ((PLUS | MINUS) product_expression)*
    ;

shift_expression
    : sum_expression ((LT LT | GT GT) sum_expression)*
    ;

compare_expression
    : shift_expression ((LT | GT | OP_LTE | OP_GTE) shift_expression)*
    ;

equality_expression
    : compare_expression ((OP_EQ  OP_NE) compare_expression)*
    ;

identity_expression
    : equality_expression ((OP_IDENTITY | OP_NIDENTITY) equality_expression)*
    ;

bit_and_expression
    : identity_expression (AMP identity_expression)*
    ;

bit_xor_expression
    : bit_and_expression (CARET bit_and_expression)*
    ;

bit_or_expression
    : bit_xor_expression (OR bit_xor_expression)*
    ;

logical_and_expression
    : bit_or_expression (AMP AMP bit_or_expression)*
    ;

logical_or_expression
    : logical_and_expression (OR OR logical_and_expression)*
    ;

coalescing_expression
    : logical_or_expression (OP_COALESCING expression)?
    ;

assignment_expression
    : coalescing_expression (
        ( ASSIGN
        | OP_PLUS_ASSIGN
        | OP_MINUS_ASSIGN
        | OP_TIMES_ASSIGN
        | OP_DIV_ASSIGN
        | OP_REM_ASSIGN
        | OP_AND_ASSIGN
        | OP_XOR_ASSIGN
        | OP_OR_ASSIGN
        | OP_SHL_ASSIGN
        | OP_SHR_ASSIGN
        | OP_COALESCING_ASSIGN
        )
      coalescing_expression)?
    ;

conditional_expression
    : assignment_expression (QUESTION expression COLON expression)?
    ;

sequence_expression
    : conditional_expression (COMMA expression)?
    ;

variable: name=ID;

arg_list: argument (COMMA arg_list)?;

argument
    : OP_SPREAD argument
    | expression
    | var_name ASSIGN expression
    ;

// Statements

statement_seq: statement+;

statement
    : labeled_statement
    | control_flow_statement SEMI
    | conditional_statement
    | loop_statement
    | function_invocation_statement SEMI
    | expression_statement SEMI
    | compound_statement
    | declaration
    ;

function_invocation_statement
    : function_name actual_template_types? OPEN_PAREN arg_list? CLOSE_PAREN
    ;

expression_statement
    : expression
    ;

compound_statement
    : OPEN_BRACE statement_seq? CLOSE_BRACE
    ;

control_flow_statement
    : (BREAK | CONTINUE | GOTO | RETURN) expression? (COLON label_name)?
    ;

labeled_statement
    : label_name COLON statement
    ;

label_name: name=ID;

conditional_statement
    : if_statement
    | switch_statement
    ;

if_statement
    : IF OPEN_PAREN condition CLOSE_PAREN statement (ELSE statement)?
    ;

switch_statement
    : SWITCH OPEN_PAREN condition CLOSE_PAREN OPEN_BRACE switch_body CLOSE_BRACE
    ;

switch_body
    : (switch_case BIG_ARROW statement)*
    ;

switch_case
    : expression
    ;

loop_statement
    : while_statement
    | do_while_statement SEMI
    | for_statement
    | foreach_statement
    ;

while_statement
    : WHILE OPEN_PAREN condition CLOSE_PAREN statement
    ;

do_while_statement
    : DO statement WHILE OPEN_PAREN expression CLOSE_PAREN
    ;

for_statement
    : FOR OPEN_PAREN condition? SEMI expression? SEMI for_every_statement? CLOSE_PAREN statement
    ;

for_every_statement
    : expression
    ;

foreach_statement
    : FOREACH OPEN_PAREN var_name COLON condition CLOSE_PAREN statement
    ;

condition
    : simple_var_declaration
    | expression
    ;

// Declarations

declaration_seq: declaration+;

declaration
    : function_declaration
    | abstract_function_declaration SEMI
    | var_declaration SEMI
    | container_declaration
    | enum_declaration
    | interface_declaration
    ;

function_declaration
    : template_specifier? type_modifiers type_specifier function_name OPEN_PAREN function_parameter_list? CLOSE_PAREN function_body
    ;

abstract_function_declaration
    : template_specifier? type_modifiers type_specifier function_name OPEN_PAREN function_parameter_list? CLOSE_PAREN
    ;

function_name: name=ID;

function_parameter_list
    : VARARG? function_parameter (COMMA function_parameter_list)?
    ;

function_parameter
    : type_specifier function_parameter_name
    | type_specifier function_parameter_name ASSIGN default_value=expression
    ;

function_parameter_name: name=ID;

function_body
    : compound_statement //#compound_function
    | ASSIGN expression SEMI //#expression_function
    ;

var_declaration
    : type_modifiers (VAR | type_specifier) var_name (ASSIGN var_initializer)? (COMMA var_name (ASSIGN var_initializer)?)*
    ;

simple_var_declaration
    : (VAR | type_specifier) var_name ASSIGN var_initializer
    ;

var_name
    : name=ID
    | destructed_var_name
    ;

destructed_var_name
    : OPEN_PAREN destructed_var_name_list CLOSE_PAREN
    ;

destructed_var_name_list
    : var_name (COMMA destructed_var_name_list)?
    ;

var_initializer
    : expression
    | OPEN_BRACE initializer_list CLOSE_BRACE
    ;

initializer_list
    : expression (COMMA initializer_list)?
    ;

    // Containers

container_declaration
    : container_head OPEN_BRACE container_body CLOSE_BRACE container_implementation? SEMI?
    | container_head (container_implementation | SEMI)
    ;

container_head
    : template_specifier? visibility_modifier? (STRUCT | UNION) container_name
    ;

container_name: name=ID;

container_body
    : container_field_list? (SEMI container_method_list)?
    | container_method_list
    ;

container_field_list
    : container_field (COMMA container_field_list)?
    ;

container_field
    : type_specifier var_name (ASSIGN expression)?
    ;

container_method_list
    : function_declaration+
    ;

container_implementation
    : COLON interface_name (COMMA interface_name)* (OPEN_BRACE container_method_list? CLOSE_BRACE)?
    ;

    // Enums

enum_declaration
    : visibility_modifier? ENUM enum_name (OPEN_BRACE enum_entry_list? SEMI? CLOSE_BRACE SEMI? | SEMI)
    ;

enum_name: name=ID;

enum_entry_list
    : enum_entry (COMMA enum_entry_list)?
    ;

enum_entry
    : var_name (ASSIGN integer_literal)?
    ;

    // Interfaces

interface_declaration
    : template_specifier? visibility_modifier? INTERFACE interface_name (OPEN_BRACE interface_method_list? CLOSE_BRACE SEMI? | SEMI)
    ;

interface_method_list
    : (abstract_function_declaration SEMI)+
    ;

interface_name: name=ID;

// Types

type_specifier
    : type pointer?
    ;

type_modifiers
    : visibility_modifier? extern? const_? static_?
    ;

type
    : type OPEN_BRACKET integer_literal? CLOSE_BRACKET
    | tupel_type
    | builtin_type
    | templated_type actual_template_types?
    ;

tupel_type
    : OPEN_PAREN tupel_type_list CLOSE_PAREN
    ;

tupel_type_list
    : type (COMMA tupel_type_list)?
    ;

templated_type
    : container_type
    | type_name
    ;

type_name: name=ID;

visibility_modifier
    : PUBLIC //#public_visibility
    | PRIVATE //#private_visibility
    | PROTECTED //#protected_visibility
    | INTERNAL //#internal_visibility
    ;

extern: EXTERN;

const_: CONST;

static_: STATIC;

builtin_type
    : VOID //#void_type
    | BOOL //#bool_type
    | BYTE //#byte_type
    | SBYTE //#signed_byte_type
    | SHORT //#short_type
    | USHORT //#unsigned_short_type
    | INT //#int_type
    | UINT //#unsigned_int_type
    | LONG //#long_type
    | ULONG //#unsigned_long_type
    | FLOAT //#float_type
    | DOUBLE //#double_type
    | CHAR //#char_type
    | FUNCTION LT type (OPEN_PAREN actual_template_type_list? CLOSE_PAREN)? GT//actual_template_types
    ;

container_type
    : (STRUCT | UNION) OPEN_BRACE container_field_list CLOSE_BRACE
    ;

pointer
    : STAR+ //#ptr
    | AMP //#ref
    ;

// Templates

template_specifier
    : LT template_type_list? GT
    ;

template_type_list: VARARG? template_type (COMMA template_type_list)?;

template_type
    : template_kind template_name
    ;

template_kind
    : TYPENAME? //#typename_kind
    | CLASS //#class_kind
    | builtin_type //#type_kind
    ;

template_name: name=ID;

actual_template_types
    : LT (actual_template_type_list | QUESTION)? GT
    ;

actual_template_type_list
    : type (COMMA actual_template_type_list)?
    ;