package numbers;

public class Percent {
    public double getValue(int value1, int value2) {
        return value2 / 100.0 * value1;
    }

    public double getBase(int value1, int value2) {
        return (double) value1 * 100 / value2;
    }

    public double getPercent(int value1, int value2) {
        return (double) value2 / value1 * 100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();

        System.out.println(percent.getValue(32, 48));   //32-nek a 48%-a = 15,36
        System.out.println(percent.getBase(145, 30));   //A 145 a 483,3333333-nak a 30%-a
        System.out.println(percent.getPercent(62, 90));   //A 90 a 62-nek 145.16129032258064%-a
    }
}
