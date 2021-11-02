package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void Test() {
        Gentleman gentleman = new Gentleman();

        String welcome = gentleman.sayHello(null);

        assertThat(welcome, equalTo("Hello Anonymus!"));
    }
}
