package finalmodifier;

import java.util.Scanner;

public class TaxMain {
    public static void main(String[] args) {
        TaxCalculator taxCalc = new TaxCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Adja meg a nettó árat: ");
        double price = sc.nextDouble();
        System.out.println("ÁFA összege: " + taxCalc.tax(price));
        System.out.println("Bruttó összeg: " + taxCalc.priceWithTax(price));
    }
}
