package dev.tobiasweinlich.sudoku;

import dev.tobiasweinlich.sudoku.field.Field;
import dev.tobiasweinlich.sudoku.field.FieldFactory;

public class SudokuFactory {

    public static Sudoku getInstance() {
        return new Sudoku();
    }

    public static Sudoku getInstance(final Field field) {
        return new Sudoku(field);
    }

    public static Sudoku getInstance(final int[][] rawField) {
        return new Sudoku(FieldFactory.getInstance(rawField));
    }

    public static Sudoku solve() {
        return new Sudoku();
    }

}