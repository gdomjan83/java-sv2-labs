package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {
    public static void main(String[] args) {
        Operations operations = new Operations();

        try {
            String schedule = operations.getDailySchedule(operations.readFile("src/main/resources/underground.txt"));
            System.out.println(schedule);
        }
        catch (IOException ioe) {
            System.out.println("File not found.");
        }
    }
}
