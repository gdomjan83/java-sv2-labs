package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("ebook reader full of books", "SteamDeck full of games", "pickaxe");
        System.out.println(importantThings);

        importantThings.set(2, "tent");
        System.out.println(importantThings);
    }
}
