package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Alma");
        fruit.setWeight(1.2);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("Szőlő");
        grape.setWeight(0.2);
        grape.setType("Fehér");
        System.out.println(grape.getName());
        System.out.println(grape.getType());
        System.out.println(grape.getWeight());

        Apple apple = new Apple();
        apple.setName("Alma");
        apple.setPieces(5);
        apple.setWeight(1.8);
        System.out.println(apple.getName());
        System.out.println(apple.getPieces());
        System.out.println(apple.getWeight());

        GoldenDelicious golden = new GoldenDelicious();
        golden.setName("Golden");
        golden.setPieces(10);
        golden.setWeight(3.2);
        System.out.println(golden.getName());
        System.out.println(golden.getColour());
        System.out.println(golden.getPieces());
        System.out.println(golden.getWeight());

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setPieces(8);
        starking.setWeight(3.1);
        System.out.println(starking.getName());
        System.out.println(starking.getColour());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
    }
}
