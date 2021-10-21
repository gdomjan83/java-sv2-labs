package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("subtractTenIfGreaterThanTen");
        System.out.println(introControl.subtractTenIfGreaterThanTen(9));
        System.out.println("describeNumber");
        System.out.println(introControl.describeNumber(10));
        System.out.println("greetingToJoe");
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println("calculateBonus");
        System.out.println(introControl.calculateBonus(2500000));
        System.out.println("calculateConsumption");
        System.out.println(introControl.calculateConsumption(1600, 2500));
        System.out.println("printNumbers");
        introControl.printNumbers(6);;
        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(3, 6);
        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(23, 19);
        System.out.println("printOddNumbers");
        introControl.printOddNumbers(11);
    }
}
