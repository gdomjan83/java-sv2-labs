package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> freezer = new ArrayList<>();
        freezer.add("tej");
        freezer.add("téliszalámi");
        freezer.add("margarin");
        freezer.add("sör");
        freezer.add("paradicsom");
        System.out.println(freezer.toString());
        System.out.println("Hűtő mérete: " + freezer.size());
        freezer.remove("sör");
        freezer.remove("tej");
        System.out.println(freezer.toString());
        System.out.println("Hűtő mérete: " + freezer.size());
    }
}
