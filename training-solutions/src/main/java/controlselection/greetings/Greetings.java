package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public String Greeting(int hour, int minute) {
        LocalTime time = LocalTime.of(hour, minute);
        if ((time.isAfter(LocalTime.of(20, 0))) || (time.isBefore(LocalTime.of(5, 1)))) {
            return "Jó éjt!";
        } else if (time.isAfter(LocalTime.of(18, 30))) {
            return "Jó estét!";
        } else if (time.isAfter((LocalTime.of(8, 59)))) {
            return "Jó napot!";
        } else {
            return "Jó reggelt!";
        }
    }
}
