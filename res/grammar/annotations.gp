


ANNOTATION_DECLARATION:
    ANNOTATION_HEADER { ANNOTATION_BLOCK }

ANNOTATION_HEADER:
    ACCESS_MODIFIER annotation @ identifier applies_to class
    ACCESS_MODIFIER annotation @ identifier applies_to function

ANNOTATION_BLOCK:
    ANNOTATION_PARAMS ANNOTATION_TAGS

ANNOTATION_PARAMS:
    \0
    COMMA_SEPARATED_ANNOTATION_PARAMS_LIST ;

COMMA_SEPARATED_ANNOTATIONS_PARAMS_LIST:
    ANNOTATION_PARAM
    ANNOTATION_PARAM , COMMA_SEPARATED_ANNOTATIONS_PARAM_LIST

ANNOTATION_PARAM:
    identifier
    identifier default string_literal









ANNOTATION_USAGE:
    @ identifier
    @ identifier ( ANNOTATION_ARGS_INIT )


// TODO: ANNOTATIONS_ARG_INIT
ANNOTATIONS_ARG_INIT:
    

























