

PAGE:
    PAGE_DECLARATION
    PAGE_CODE

PAGE_CODE:
    \0
    READ_BLOCK
    PAGE_DECLARATIONS

READ_BLOCK:
    \0
    READ_STATEMENT
    READ_STATEMENT READ_BLOCK

READ_STATEMENT:
    read NOT_EMPTY_DOT_SEPARATED_IDENTIFIERS_LIST ;


NOT_EMPTY_DOT_SEPARATED_IDENTIFIERS_LIST:
    identifier
    identifier . NOT_EMPTY_DOT_SEPARATED_IDENTIFIERS_LIST

PAGE_DECLARATIONS:
    \0
    ANNOTATION_DECLARATION PAGE_DECLARATIONS
    CLASS_DECLARATION PAGE_DECLARATIONS
    COLLECTION_DECLARATION PAGE_DECLARATIONS
    INTERFACE_DECLARATION PAGE_DECLARATIONS
    FUNCTION_DECLARATION PAGE_DECLARATIONS
    VARIABLE_DECLARATION PAGE_DECLARATIONS