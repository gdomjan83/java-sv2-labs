package interfacedependencyinversion.cuirer;

public class ExtraLargeBox implements Box {
    private int price = 5000;

    @Override
    public Size getSize() {
        return Size.XL;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
