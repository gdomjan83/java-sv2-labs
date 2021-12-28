package interfacedependencyinversion.cuirer;

public class MediumBox implements Box {
    private int price = 2000;

    @Override
    public Size getSize() {
        return Size.M;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
