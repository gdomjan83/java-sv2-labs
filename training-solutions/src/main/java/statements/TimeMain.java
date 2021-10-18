package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg az időpontok adatait!");
        System.out.println("Első időpont (óra):");
        int hour = scanner.nextInt();
        System.out.println("Első időpont (perc):");
        int minute = scanner.nextInt();
        System.out.println("Első időpont (másodperc):");
        int second = scanner.nextInt();

        Time time1 = new Time(hour, minute, second);

        System.out.println("Második időpont (óra):");
        hour = scanner.nextInt();
        System.out.println("Második időpont (perc):");
        minute = scanner.nextInt();
        System.out.println("Második időpont (másodperc):");
        second = scanner.nextInt();

        Time time2 = new Time(hour, minute, second);

        System.out.print("Az első időpont ");
        System.out.println(time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.print("Az második időpont ");
        System.out.println(time2.toString() + " = " + time2.getInSeconds() + " másodperc");
        System.out.print("Az első korábbi, mint a második:  ");
        System.out.println(time1.earlierThan(time2));
    }
}
