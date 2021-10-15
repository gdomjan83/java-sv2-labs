package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a kedvenc zeneszámod?");
        song.title = scanner.nextLine();
        System.out.println("Ki az előadó?");
        song.band = scanner.nextLine();
        System.out.println("Hány perc hosszú a szám?");
        song.length = scanner.nextInt();

        System.out.print("A kedvenc zenéd: ");
        System.out.print(song.band + " - " + song.title + " (" + song.length + " perc)");


    }
}
