package introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Adj meg egy egész számot!");

        try {
            while ((number = sc.nextInt()) % 2 != 0) {
                System.out.println("Adj meg még egy egész számot!");
            }
        }
        catch (InputMismatchException ime) {
            throw new IllegalArgumentException("This is not a number.", ime);
        }
        finally {
            System.out.println("End of round.");
        }
    }
}
