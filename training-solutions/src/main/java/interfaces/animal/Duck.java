package interfaces.animal;

public class Duck implements Animal{
    private String name = "Duck";
    private int numberOfLegs = 2;

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
