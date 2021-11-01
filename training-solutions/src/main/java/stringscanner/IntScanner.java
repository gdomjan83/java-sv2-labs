package stringscanner;

import java.util.Scanner;

public class IntScanner {
    private String ints;

    public IntScanner(String ints) {
        this.ints = ints;
    }

    public String getInts() {
        return ints;
    }

    public StringBuilder convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 100) {
                sb.append(num);
                if (scanner.hasNextInt()) {
                    sb.append(",");
                }
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner("5;3;107;12;123;18;198");
//        IntScanner intScanner = new IntScanner("198");
//        IntScanner intScanner = new IntScanner("5;3;12;18");
//        IntScanner intScanner = new IntScanner("18");
//        IntScanner intScanner = new IntScanner("");

        System.out.println(intScanner.convertInts(intScanner.getInts()));
    }
}
