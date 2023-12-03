package dev.tobiasweinlich.sudoku.field;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FieldFactoryTest {

    @Test
    void shouldReturnInstanceOfField() {
        Assertions.assertInstanceOf(Field.class, FieldFactory.getInstance(), "FieldFactory.getInstance() failed.");

        final int[][] rawField = new int[9][9];
        assertInstanceOf(Field.class, FieldFactory.getInstance(rawField), "FieldFactory.getInstance(int[][] rawField) failed.");
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenProvidedWithIllegalField() {
        final List<int[][]> illegalRawFields = new ArrayList<>();
        illegalRawFields.add(new int[0][0]);
        illegalRawFields.add(new int[10][10]);
        illegalRawFields.add(new int[0][9]);
        illegalRawFields.add(new int[9][0]);
        illegalRawFields.add(new int[9][10]);
        illegalRawFields.add(new int[10][9]);

        for (final var rawField : illegalRawFields) {
            assertThrows(IllegalArgumentException.class, () -> FieldFactory.getInstance(rawField));
        }
    }

}
