package com.maple.compiler.lexical;

public class Location {

    final protected int row;
    final protected int col;

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return row + ":" + col;
    }

}
