package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testCase() {
        Gentleman gentleman = new Gentleman();

        String result = gentleman.sayHello(null);

        assertEquals("Hello Anonymus", result);
    }
}
