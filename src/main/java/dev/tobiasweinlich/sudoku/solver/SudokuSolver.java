package dev.tobiasweinlich.sudoku.solver;

import dev.tobiasweinlich.sudoku.Sudoku;
import dev.tobiasweinlich.sudoku.SudokuFactory;
import dev.tobiasweinlich.sudoku.field.FieldFactory;

public class SudokuSolver {

    public static boolean check(final Sudoku sudokuToCheck) {
        final var field = SudokuFactory.getField(sudokuToCheck);
        final var rawField = FieldFactory.getRawField(field);

        // Check every row for duplicates
        for (int row = 0; row < 9; row++) {
            final var duplicateInRow = duplicateInRow(rawField, row);
            if (duplicateInRow) {
                return false;
            }
        }

        // Check every column for duplicates
        for (int col = 0; col < 9; col++) {
            final var duplicateInCol = duplicateInCol(rawField, col);
            if (duplicateInCol) {
                return false;
            }
        }

        // Check every block for duplicates
        for (int blockRow = 0; blockRow < 9; blockRow += 3) {
            for (int blockCol = 0; blockCol < 9; blockCol += 3) {
                final var duplicateInBlock = duplicateInBlock(rawField, blockRow, blockCol);
                if (duplicateInBlock) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean duplicateInRow(final int[][] rawField, final int row) {
        for (int col = 0; col < 8; col++) {
            if (rawField[row][col] == 0) {
                continue;
            }
            final var currentNum = rawField[row][col];
            for (int nextCol = col + 1; nextCol < 9; nextCol++) {
                if (rawField[row][nextCol] == currentNum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean duplicateInCol(final int[][] rawField, final int col) {
        for (int row = 0; row < 8; row++) {
            if (rawField[row][col] == 0) {
                continue;
            }
            final var currentNum = rawField[row][col];
            for (int nextRow = col + 1; nextRow < 9; nextRow++) {
                if (rawField[nextRow][col] == currentNum) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean duplicateInBlock(final int[][] rawField, final int blockRow, final int blockCol) {
        for (int row = blockRow; row < blockRow + 3; row++) {
            for (int col = blockCol; col < blockCol + 3; col++) {
                if (rawField[row][col] == 0) {
                    continue;
                }
                final var currentNum = rawField[row][col];
                for (int nextRow =)
            }
        }
    }

}
