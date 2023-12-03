package dev.tobiasweinlich.sudoku.field;

public class Field {

    private int[][] rawField;

    Field() {}

    Field(final int[][] rawField) {
        this.rawField = rawField;
    }

    void setRawField(final int[][] rawField) {
        this.rawField = rawField;
    }

    int[][] getRawField() {
        return rawField;
    }

}