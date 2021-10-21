package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int numberOfBoats = 3;
        int remainingPlaces = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Csónakok:\n1. csónak (2 hely)\n2. csónak (3 hely)\n3. csónak (5 hely)");
        System.out.println();
        System.out.println("Hányan bérelnétek ki a csónakot?");
        int people = sc.nextInt();

        if (people > 3) {
            System.out.println("Elvitt csónak: 3. csónak (5 hely).");
            people -= 5;
            remainingPlaces -= 5;
            numberOfBoats--;
        }
        if (people > 2) {
            System.out.println("Elvitt csónak: 2. csónak (3 hely).");
            people -= 3;
            remainingPlaces -= 3;
            numberOfBoats--;
        }
        if (people > 0) {
            System.out.println("Elvitt csónak: 1. csónak (2 hely).");
            people -= 2;
            remainingPlaces -= 2;
            numberOfBoats--;
        }

        if (people > 0) {
            System.out.println("Sajnos a parton maradt " + people + " fő.");
        } else {
            System.out.println("Fennmaradt férőhely: " + remainingPlaces + " hely.");
            System.out.println("Fennmaradt csónak: " + numberOfBoats + " csónak.");
        }
    }
}
