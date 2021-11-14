package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public List<String> readFile(String filePath) throws IOException {
        List<String> allCars = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
        return allCars;
    }

    public String getDailySchedule(List<String> allCars) {
        StringBuilder sb = new StringBuilder();

        sb.append(LocalDate.now() + ", ");

        for (String actual : allCars) {
            if (actual.startsWith("2")) {
                sb.append(actual + " ");
            }
        }
        return new String(sb);
    }
}
