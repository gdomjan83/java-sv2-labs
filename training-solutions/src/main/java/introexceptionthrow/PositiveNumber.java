package introexceptionthrow;

import javax.management.InstanceNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg egy pozitív egész számot!");
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException ime) {
            throw new IllegalArgumentException("Nem számot adtál meg.");
        }

        if (num <= 0) {
            throw new IllegalArgumentException("Nem pozitív szám");
        }
        System.out.println("A megadott szám: " + num);
    }
}
