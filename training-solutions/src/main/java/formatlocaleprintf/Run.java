package formatlocaleprintf;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> distance;
    private String name;

    public Run(String name) {
        this.name = name;
        this.distance = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Double> getDistance() {
        return distance;
    }

    public void addRun(Double km) {
        distance.add(km);
    }

    public String printFormattedRunText() {
        int numberOfRun = distance.size();
        double lastRun = distance.get(numberOfRun - 1);
        LocalDate today = LocalDate.now();

        String output = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a %d. futásod. " +
                "Most %.1f km-t futottál. Csak így tovább!", name, today.toString(), numberOfRun, lastRun);

        return output;
    }

    public static void main(String[] args) {
        Run run = new Run("Domján Gábor");

        run.addRun(5.65);
        run.addRun(8.2);
        run.addRun(7.44);

        System.out.println(run.printFormattedRunText());
    }
}
