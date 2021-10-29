package numbers;

import java.util.Scanner;

public class MathOperations {
    private double comparisonDelta = 0.0001;

    public double operation(double value1, double value2, double value3, double value4) {
        return (value1 + (value3 - value4) * value2) / value1;
    }

    public boolean compareValues(double userResult, double calculatedResult){
        return Math.abs(userResult - calculatedResult) < comparisonDelta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.println("Add meg az első értéket:");
        double value1 = sc.nextDouble();
        System.out.println("Add meg az második értéket:");
        double value2 = sc.nextDouble();
        System.out.println("Add meg az harmadik értéket:");
        double value3 = sc.nextDouble();
        System.out.println("Add meg az negyedik értéket:");
        double value4 = sc.nextDouble();

        System.out.println("Add meg a következő művelet eredményét: " +
                "(" + value1 + " + (" + value3 + " - " + value4 + ") * " + value2 + ") / " + value1);
        double result = sc.nextDouble();
        double calculation = math.operation(value1, value2, value3, value4);
        System.out.println(math.compareValues(result, calculation) ?
                "Helyes a válaszod." : "Helytelen választ adtál. A helyes válasz: " + calculation);
    }
}
