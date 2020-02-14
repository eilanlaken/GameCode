

TERM:
    LITERAL
    identifier
    COMPOUND

/*
example for a compound term:
pill.x.getArr()[5+b.s][5].getM()
*/
COMPOUND:
    ARRAY_ACCESS
    FUNCTION_CALL
    identifier . COMPOUND
    COMPOUND . COMPOUND

ARRAY_ACCESS:
    COMPOUND [ EXPRESSION ]

FUNCTION_CALL:
    identifier ( ARG_LIST )
    COMPOUND . identifier (ARG_LIST)

ARGS_LIST:
    \0
    EXPRESSION
    EXPRESSION , ARG_LIST


