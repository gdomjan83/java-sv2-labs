package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérlek adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Adj meg még egy számot!");
        int number2 = scanner.nextInt();
        int total = number1 + number2;
        System.out.println(number1 + " + " + number2);
        System.out.println(total);

    }
}
