

CLASS_DECLARATION:
    CLASS_HEADER CLASS_BLOCK

CLASS_HEADER:
    ACCESS_MODIFIER ABSTRACTION class BROAD_TYPE EXTENSION IMPLEMENTATION

ABSTRACTION:
    \0
    imaginary

EXTENSION:
    \0
    is BROAD_TYPE

IMPLEMENTATION:
    \0
    implements NON_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST

NON_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST:
    BROAD_TYPE
    BROAD_TYPE , NON_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST

CLASS_BLOCK:
    { CLASS_CODE }

CLASS_CODE:
    \0
    CLASS_MEMBER_VARIABLE_DECLARATION CLASS_BLOCK
    CONSTRUCTOR CLASS_BLOCK
    CLASS_MEMBER_FUNCTION_DECLARATION CLASS_BLOCK


