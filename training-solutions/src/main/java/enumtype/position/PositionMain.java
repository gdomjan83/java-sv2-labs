package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        for (Position c: Position.values()) {
            System.out.println(c + " " + c.getSalary() + " " + c.getBenefit());
        }
    }
}
