package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToConsonantTest {
    ToConsonant toConsonant = new ToConsonant();

    @Test
    void testConsonantE() {
        assertEquals('f', toConsonant.getConsonant('e'));
    }
    @Test
    void testConsonantD() {
        assertEquals('d', toConsonant.getConsonant('D'));
    }
}