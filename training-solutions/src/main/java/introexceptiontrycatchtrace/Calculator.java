package introexceptiontrycatchtrace;

public class Calculator {
    private int number1;
    private int number2;
    private String operator;

    public Calculator(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public void doMath() {
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
                System.out.print("Az eredmény: ");
                System.out.print(number1 / number2);
                break;
            default:
                System.out.println("Nem adtál meg érvényes műveletet.");
                break;
        }
    }
}
