package dev.tobiasweinlich.sudoku.solver.field;

import org.junit.jupiter.api;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class FieldFactoryTest {

    @Test
    void shouldReturnInstanceOfField() {
        assertInstanceOf(Field.class, FieldFactory.getInstance());
    }

}