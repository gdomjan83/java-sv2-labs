package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy egész számot!");
        int number = scanner.nextInt();
        String result = (number % 3) == 0 ? "osztható" : "nem osztható";

        System.out.println("A megadott szám " + result + " hárommal.");
    }
}
