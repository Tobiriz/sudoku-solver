package dev.tobiasweinlich.sudoku.solver;

import dev.tobiasweinlich.sudoku.solver.field.Field;

public class SudokuFactory {

    public static Sudoku getInstance() {
        return new Sudoku();
    }

    public static Sudoku getInstance(final Field field) {
        return new Sudoku(field);
    }

    public static Sudoku getInstance(final int[][] rawField) {
        return new Sudoku(new Field(rawField));
    }

    public static Sudoku solve() {
        return new Sudoku();
    }

}