package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {
    Labels labels = new Labels();

    @Test
    void testLabels() {
        assertEquals(3, labels.getTableOfNumbers(3)[0][1]);
        assertEquals(4, labels.getTableOfNumbers(3)[1][1]);
        assertEquals(5, labels.getTableOfNumbers(3)[2][1]);
    }
}