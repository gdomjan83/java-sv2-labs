package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {
        int[][] arr = new int[size][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }
        return arr;
    }
}
