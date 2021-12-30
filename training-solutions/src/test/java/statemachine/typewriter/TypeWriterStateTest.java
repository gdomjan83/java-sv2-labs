package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {
    @Test
    void testChangeState() {
        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.changeState());
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.changeState());
    }
}