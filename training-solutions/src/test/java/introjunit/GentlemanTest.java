package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GentlemanTest {
    @Test
    public void Test() {
        Gentleman gentleman = new Gentleman();

        String welcome = gentleman.sayHello("Jackie");

        assertEquals("Hello Jackie!", welcome);
    }
}
