package operators;

public class Operators {
    public String turnBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getResultOfDevision(int number, int divisor) {
        return number + " / " + divisor + " = " + (number / divisor) + ", maradék: " + (number % divisor);
    }

    public String isNull(String s) {
        return s == null ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty(String s) {
        return (s == null) || s.equals("");
    }
}
