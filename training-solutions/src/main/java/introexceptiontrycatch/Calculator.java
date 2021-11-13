package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.println("Adj meg egy egész számot!");
        boolean gotNumber = false;
        while (!gotNumber) {
            try {
                number1 = sc.nextInt();
                gotNumber = true;
            }
            catch (InputMismatchException exc) {
                System.out.println("Ez nem egy szám. Adj meg egy egész számot:");
                sc.nextLine();
            }
        }

        System.out.println("Adj meg még egy egész számot!");
        gotNumber = false;
        while (!gotNumber) {
            try {
                number2 = sc.nextInt();
                gotNumber = true;
            }
            catch (InputMismatchException exc) {
                System.out.println("Ez nem egy szám. Adj meg egy egész számot:");
                sc.nextLine();
            }
        }
        sc.nextLine();

        System.out.println("Milyen műveletet kívánsz elvégezni velük?");
        String operator = sc.nextLine();

        switch (operator) {
            case "+":
                System.out.print("Az eredmény: ");
                System.out.print(number1 + number2);
                break;
            case "-":
                System.out.print("Az eredmény: ");
                System.out.print(number1 - number2);
                break;
            case "*":
                System.out.print("Az eredmény: ");
                System.out.print(number1 * number2);
                break;
            case "/":
                try {
                    System.out.print("Az eredmény: ");
                    System.out.print(number1 / number2);
                }
                catch (ArithmeticException exc) {
                    System.out.println("A második szám 0, mellyel nem lehet osztani.");
                }
                break;
            default:
                System.out.println("Nem adtál meg érvényes műveletet.");
                break;
        }
    }
}
