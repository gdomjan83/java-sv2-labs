package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish ponty = new Fish("tavi", "barna");
        Fish harcsa = new Fish("tavi", "fekete");

        aquarium.addFish(ponty);    //NullPointerException keletkezik, mivel a null referenciát tartalmazó listán kíváunk metódust meghívni.
        aquarium.addFish(harcsa);

        System.out.println(aquarium.getNumberOfFish());
    }

}
