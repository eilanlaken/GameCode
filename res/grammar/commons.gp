
/* classes, collections and interfaces commons. */




NOT_EMPTY_COMMA_SEPARATED_IDENTIFIERS_LIST:
    identifier
    identifier , NOT_EMPTY_COMMA_SEPARATED_IDENTIFIERS_LIST

NOT_EMPTY_COMMA_SEPARATED_BROAD_IDENTIFIERS_LIST:
    BROAD_IDENTIFIER
    BROAD_IDENTIFIER , NOT_EMPTY_COMMA_SEPARATED_BROAD_IDENTIFIERS_LIST

NOT_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST:
    BROAD_TYPE
    BROAD_TYPE , NOT_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST

BROAD_TYPE:
    PRIMITIVE
    ARRAY_TYPE
    identifier
    ARRAY_TYPE
    BROAD_IDENTIFIER

BROAD_IDENTIFIER:
    identifier
    identifier < NOT_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST >

ARRAY_TYPE:
    BROAD_TYPE NON_EMPTY_CONCATENATED_SQUARE_BRACKETS_LIST

NON_EMPTY_CONCATENATED_SQUARE_BRACKETS_LIST:
    []
    [] NON_EMPTY_CONCATENATED_SQUARE_BRACKETS_LIST

NON_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST:
    BROAD_TYPE
    BROAD_TYPE , NON_EMPTY_COMMA_SEPARATED_BROAD_TYPE_LIST

COMMA_SEPARATED_EXPRESSIONS_LIST:
    \0
    EXPRESSION
    EXPRESSION , COMMA_SEPARATED_EXPRESSIONS_LIST