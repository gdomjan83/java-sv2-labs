package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Add meg az " + (i + 1) + ". számot:");
            int num = sc.nextInt();
            total += num;
        }
        System.out.println("Összeg: " + total);
    }
}
