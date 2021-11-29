package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex() {
        return weight / (Math.pow(height, 2));
    }

    public BmiCategory getBody() {
        double index = getBodyMassIndex();
        if (index < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else if (index > 25) {
            return BmiCategory.OVERWEIGHT;
        } else {
            return BmiCategory.NORMAL;
        }
    }

    public boolean isThinnerThan(BodyMass other) {
        return (this.getBodyMassIndex() < other.getBodyMassIndex());
    }
}
