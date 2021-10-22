package arrayofarrays;

public class TriangularMain {
    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        ArrayOfArrays arrPrinter = new ArrayOfArrays();

        arrPrinter.printArrayOfArrays(triangular.triangularMatrix(8));
    }
}
