package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PerformanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Előadó neve:");
        String artist = scanner.nextLine();
        System.out.println("Fellépés dátuma - év:");
        int year = scanner.nextInt();
        System.out.println("Fellépés dátuma - hónap:");
        int month = scanner.nextInt();
        System.out.println("Fellépés dátuma - nap:");
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("Fellépés kezdete - óra:");
        int hour = scanner.nextInt();
        System.out.println("Fellépés kezdete - perc:");
        int minute = scanner.nextInt();
        LocalTime startTime = LocalTime.of(hour, minute);

        System.out.println("Fellépés vége - óra:");
        hour = scanner.nextInt();
        System.out.println("Fellépés vége - perc:");
        minute = scanner.nextInt();
        LocalTime endTime  = LocalTime.of(hour, minute);

        Performance performance = new Performance(artist, date, startTime, endTime);
        System.out.println(performance.getInfo());
    }
}
