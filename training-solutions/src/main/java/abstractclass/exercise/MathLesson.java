package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise adder = new Adder();
        System.out.println(adder.getSolution(5, 3)); //8

        MathExercise subtracter = new Subtracter();
        System.out.println(subtracter.getSolution(10, 1)); //9

        MathExercise multiplier = new Multipier();
        System.out.println(multiplier.getSolution( 2, 2)); //4

        MathExercise divisor = new Divisor();
        System.out.println(divisor.getSolution(56, 8)); //7
    }
}
