package interfacedependencyinversion.cuirer;

public class SmallBox implements Box {
    private int price = 1000;

    @Override
    public Size getSize() {
        return Size.S;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
