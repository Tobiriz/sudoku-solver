package dev.tobiasweinlich.sudoku.field;

public class Field {

    private int[][] rawField;

    public Field() {}

    public Field(final int[][] rawField) {
        this.rawField = rawField;
    }

    public void setRawField(final int[][] rawField) {
        this.rawField = rawField;
    }

    public int[][] getRawField() {
        return rawField;
    }

}