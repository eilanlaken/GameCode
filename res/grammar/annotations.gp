

/*
// example:

@ordered(by: x * x + getY() ^ 2)
shared class vector {

    global float x;
    global float y;

}

// or alternatively
@ordered(by: getLengthSquared())
shared class vector {

    global float x;
    global float y;

}

@json(to: "toJson", from: "fromJson")
global class Person {

}

// no parameters example:

@noisy // every time a Dog dog is created, println "created: " + dog.
local class Dog {

}
*/


ANNOTATION_DECLARATION:
    ANNOTATION_HEADER { ANNOTATION_BLOCK }

ANNOTATION_HEADER:
    ACCESS_MODIFIER annotation @ identifier
    ACCESS_MODIFIER annotation @ identifier ( COMMA_SEPARATED_IDENTIFIER_LIST )

ANNOTATION_BLOCK:
    