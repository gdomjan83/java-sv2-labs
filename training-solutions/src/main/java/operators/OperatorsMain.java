package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.turnBinary(17));
        System.out.println(operators.isEven(4));
        System.out.println(operators.getResultOfDevision(25, 4));
        System.out.println(operators.isNull("ez nulla"));
        System.out.println(operators.isEmpty("valami"));
    }
}
