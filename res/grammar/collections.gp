
COLLECTION_DECLARATION:
    COLLECTION_HEADER { COLLECTION_CODE }

COLLECTION_HEADER:
    ACCESS_MODIFIER collection identifier

COLLECTION_CODE:


COLLECTION_MEMBERS_DECLARATION_ZONE:
    COMMA_SEPARATED_COLLECTION_MEMBERS_DECLARATION_LIST ;




/*

// collection declaration code example:

global collection Cards {

    aceOfSpades(13, Suit.Spades),


    global constant int rank;
    global constant Suit suit;
    global constant Color color; // computed

    // only a single constructor
    global Cards(int rank, Suit suit) {

    }



}



*/