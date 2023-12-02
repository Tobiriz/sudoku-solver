package dev.tobiasweinlich.sudoku.solver;

import field.Field;

public final class Sudoku {

    private Field field;
    
    protected Sudoku() {}

    protected Sudoku(final Field field) {
        this.field = field;
    }

}
