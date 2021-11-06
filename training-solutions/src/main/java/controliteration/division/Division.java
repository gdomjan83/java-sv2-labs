package controliteration.division;


public class Division {
    private int number;
    private int divider;

    public Division(int number, int divider) {
        this.number = number;
        this.divider = divider;
    }

    public String generateResultWithFor() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < number; i++) {
            if (i % divider == 0) {
                result.append(i);
                result.append(", ");
            }
        }
        return result.toString();
    }

    public String generateResultWithWhile() {
        StringBuilder result = new StringBuilder();
        int i = 1;
        while (i < number) {
            if (i % divider == 0) {
                result.append(i);
                result.append(", ");
            }
            i++;
        }
        return result.toString();
    }
}
