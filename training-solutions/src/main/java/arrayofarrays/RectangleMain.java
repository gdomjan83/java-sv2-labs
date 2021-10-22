package arrayofarrays;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        ArrayOfArrays arrPrinter = new ArrayOfArrays();

        arrPrinter.printArrayOfArrays(rectangle.rectangularMatrix(4));
    }
}
