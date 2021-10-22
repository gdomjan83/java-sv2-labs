package arrayofarrays;

public class Rectangle {
    public int[][] rectangularMatrix(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }
        return arr;
    }
}
