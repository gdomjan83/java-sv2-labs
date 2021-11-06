package controliteration.division;

import java.util.Scanner;

public class DivisionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot!");
        int number = sc.nextInt();
        System.out.println("Melyik számmal osztható számokat kérni listázni?");
        int divider = sc.nextInt();

        Division division = new Division(number, divider);

        System.out.println("Eredmény: " + division.generateResultWithFor());

        System.out.println("Adjon meg egy másik pozitív egész számot!");
        number = sc.nextInt();
        System.out.println("Melyik számmal osztható számokat kérni listázni?");
        divider = sc.nextInt();

        Division division2 = new Division(number, divider);

        System.out.println("Eredmény: " + division2.generateResultWithWhile());

    }



}
