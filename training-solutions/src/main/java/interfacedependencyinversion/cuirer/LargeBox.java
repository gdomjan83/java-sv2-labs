package interfacedependencyinversion.cuirer;

public class LargeBox implements Box {
    private int price = 3000;

    @Override
    public Size getSize() {
        return Size.L;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
