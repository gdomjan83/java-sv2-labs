package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutAccentsTest {

    WithoutAccents withoutAccents = new WithoutAccents();

    @Test
    void testConsonantL() {
        assertEquals('l', withoutAccents.getShortVowel('L'));
    }

    @Test
    void testConsonantm() {
        assertEquals('m', withoutAccents.getShortVowel('m'));
    }

    @Test
    void testShortVowelE() {
        assertEquals('e', withoutAccents.getShortVowel('e'));
    }

    @Test
    void testLongVowelU() {
        assertEquals('u', withoutAccents.getShortVowel('Ú'));
    }
}