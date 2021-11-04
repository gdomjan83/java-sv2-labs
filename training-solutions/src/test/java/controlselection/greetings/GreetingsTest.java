package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    Greetings greetings = new Greetings();

    @Test
    void testMorning() {
        assertEquals("Jó reggelt!", greetings.Greeting(5, 1));;
    }

    @Test
    void testDay() {
        assertEquals("Jó napot!", greetings.Greeting(9, 0));
    }

    @Test
    void testEvening() {
        assertEquals("Jó estét!", greetings.Greeting(20, 00));
    }

    @Test
    void testNight() {
        assertEquals("Jó éjt!", greetings.Greeting(20, 1));
    }

}