package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for (Continent c: Continent.values()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("PACIFIC_OCEAN"));
        System.out.println(Ocean.valueOf("ATLANTIC_OCEAN"));
        System.out.println(Ocean.valueOf("INDIAN_OCEAN"));

        for (int i = 0; i < Football.values().length; i++) {
            System.out.println(Football.values()[i].name());
        }
    }
}
