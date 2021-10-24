package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> DAYS_OF_WEEK = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

    public static void main(String[] args) {
        DAYS_OF_WEEK.set(1, "Wed");
        System.out.println(DAYS_OF_WEEK);
    }

}
