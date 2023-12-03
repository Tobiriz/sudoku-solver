package dev.tobiasweinlich.sudoku;

import dev.tobiasweinlich.sudoku.field.Field;

public final class Sudoku {

    private Field field;
    
    Sudoku() {}

    Sudoku(final Field field) {
        this.field = field;
    }

}
