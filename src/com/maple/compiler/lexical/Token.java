package com.maple.compiler.lexical;

public class Token {

    protected TokenType tokenType;
    protected String text;
    protected int startIndexInFile;
    protected int endIndexInFile;

    protected Location begin;
    protected Location end;

    public Token(final TokenType tokenType, final String text, int startIndexInFile, int endIndexInFile) {
        this.tokenType = tokenType;
        this.text = text;
        this.startIndexInFile = startIndexInFile;
        this.endIndexInFile = endIndexInFile;
    }

    // later
    public Token(final TokenType tokenType, final String text, Location begin, Location end) {
        this.tokenType = tokenType;
        this.text = text;
        this.begin = begin;
        this.end = end;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    @Override
    public String toString() {
        if (begin != null && end != null) {
            return "<" + tokenType + " , " + "'" + text + "' | " + begin + "..." + end + ">";
        } else {
            return "<" + tokenType + " , " + "" + text + " | " + startIndexInFile + "..." + endIndexInFile + ">";
        }
    }

}
