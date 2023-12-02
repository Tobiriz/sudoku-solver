package dev.tobiasweinlich.sudoku.solver;

import org.junit.jupiter.api.Test;

import dev.tobiasweinlich.sudoku.solver.field.FieldFactory;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class SudokuFactoryTest {

    @Test
    void shouldReturnInstanceOfSudoku() {
        assertInstanceOf(Sudoku.class, SudokuFactory.getInstance());
        final var field = FieldFactory.getInstance();
        assertInstanceOf(Sudoku.class, SudokuFactory.getInstance(field));
        final var rawField = new int[9][9];
        assertInstanceOf(Sudoku.class, SudokuFactory.getInstance(rawField));
    }

}