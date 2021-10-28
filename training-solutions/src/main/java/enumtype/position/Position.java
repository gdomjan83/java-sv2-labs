package enumtype.position;

public enum Position {
    TAKARÍTÓ(20000, "semmi"), ÜGYINTÉZŐ(50000, "erzsébet utalvány"),
    ADMINISZTRÁTOR(45000, "kondibérlet"), OSZTÁLYVEZETŐ(75000, "útiköltség térítés"),
    IGAZGATÓ(120000, "év végi bónusz");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
