package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        return Math.sqrt(Math.pow(getSide(), 2) + Math.pow(getSide(), 2));
    }

    default double getPerimeter() {
        return getNumberOfSides() * getSide();
    }

    default double getArea() {
        return Math.pow(getSide(), 2);
    }

    double getSide();
}
