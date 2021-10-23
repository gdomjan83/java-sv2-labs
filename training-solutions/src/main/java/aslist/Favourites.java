package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> favourites = new ArrayList<>();
        System.out.println("Mi a kedvenc filmed?");
        favourites.add(sc.nextLine());
        System.out.println("Mi a kedvenc zenéd?");
        favourites.add(sc.nextLine());
        System.out.println("Mi a kedvenc állatod?");
        favourites.add(sc.nextLine());

        System.out.println("Lista mérete: " + favourites.size());
        System.out.println(favourites);

    }
}
