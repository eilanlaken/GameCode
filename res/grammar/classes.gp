

CLASS_DECLARATION:
    ANNOTATION_USAGE CLASS_HEADER CLASS_BLOCK

CLASS_HEADER:
    ACCESS_MODIFIER ABSTRACTION class identifier EXTENSION IMPLEMENTATION
    ACCESS_MODIFIER ABSTRACTION class BROAD_IDENTIFIER EXTENSION IMPLEMENTATION

ABSTRACTION:
    \0
    imaginary

EXTENSION:
    \0
    is BROAD_IDENTIFIER

IMPLEMENTATION:
    \0
    implements NOT_EMPTY_COMMA_SEPARATED_BROAD_IDENTIFIER_LIST

NOT_EMPTY_COMMA_SEPARATED_BROAD_IDENTIFIER_LIST:
    BROAD_IDENTIFIER
    BROAD_IDENTIFIER , NOT_EMPTY_COMMA_SEPARATED_BROAD_IDENTIFIER_LIST

CLASS_BLOCK:
    { CLASS_CODE }

/* TODO: MEMBER_VARIABLE_DECLARATION */
CLASS_CODE:
    \0
    MEMBER_VARIABLE_DECLARATION CLASS_BLOCK
    CONSTRUCTOR CLASS_BLOCK
    FUNCTION_DECLARATION CLASS_BLOCK

CONSTRUCTOR:
    ACCESS_MODIFIER identifier ( COMMA_SEPARATED_FUNC_DEC_ARG_LIST ) { STATEMENTS }
