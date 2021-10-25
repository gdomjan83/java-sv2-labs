package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog kutya1 = new Dog("Pufi", 12, "tricolor");
        dogs.add(kutya1);
        Dog kutya2 = new Dog("Zuzmó", 2, "fekete");
        dogs.add(kutya2);
        Dog kutya3 = new Dog("Zsálya", 3, "barna");
        dogs.add(kutya3);

        System.out.println(dogs);

        Dog kutya4 = dogs.get(1);
        kutya4.setColour("fehér");

        System.out.println(dogs);

        Dog kutya5 = new Dog("Yoda", 10, "világosbarna");
        System.out.println(kutya5);

        kutya5 = dogs.get(1);
        System.out.println(kutya5);

        dogs.add(kutya5);
        System.out.println(dogs);

        Dog kutya6 = kutya4;
        kutya6.setColour("vörös");
        System.out.println(dogs);

        List<Dog> dogList2 = dogs;

        Dog kutya7 = kutya4;
        kutya7.setColour("tarka");
        System.out.println(dogList2);

        kutya2.setColour("pink");
        System.out.println(dogList2);

        kutya2 = null;
        System.out.println(dogList2);

        Dog kutya8 = dogs.get(1);
        kutya8 = null;
        System.out.println(dogList2);

        Dog kutya9 = dogs.get(1);
        kutya9.setColour("lila");
        System.out.println(dogList2);
    }
}
