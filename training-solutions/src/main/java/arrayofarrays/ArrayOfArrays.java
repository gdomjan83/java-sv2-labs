package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a) {
        for (int[] item: a) {
            for (int i = 0; i < item.length; i++) {
                System.out.print(item[i] + " ");
            }
            System.out.println();
        }
    }
}
