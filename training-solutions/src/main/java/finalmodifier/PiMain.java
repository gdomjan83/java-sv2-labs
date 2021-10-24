package finalmodifier;

import java.util.Scanner;

public class PiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CircleCalculator circle = new CircleCalculator();
        System.out.println("Adja meg a kör átmérőjét:");
        double r = scanner.nextDouble();
        System.out.println("A kör kerülete: " + circle.calculatePerimeter(r));
        System.out.println("A kör területe: " + circle.calculateArea(r));
        System.out.println();

        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println("Adja meg a henger átmérőjét:");
        r = scanner.nextDouble();
        System.out.println("Adja meg a henger magasságát:");
        double h = scanner.nextDouble();
        System.out.println("A henger térfogata: " + cylinder.calculateVolume(r, h));
        System.out.println("A hanger felülete: " + cylinder.calculateSurfaceArea(r, h));
        System.out.println();

        CylinderCalculatorBasedOnCircle otherCylinder = new CylinderCalculatorBasedOnCircle();
        System.out.println("Adja meg a másik henger átmérőjét:");
        r = scanner.nextDouble();
        System.out.println("Adja meg a másik henger magasságát:");
        h = scanner.nextDouble();
        System.out.println("A henger térfogata: " + otherCylinder.calculateVolume(r, h));
        System.out.println("A hanger felülete: " + otherCylinder.calculateSurfaceArea(r, h));
        System.out.println();

        System.out.println("PI: " + CircleCalculator.PI);
    }
}
