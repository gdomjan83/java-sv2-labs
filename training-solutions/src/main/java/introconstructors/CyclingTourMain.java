package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {
        CyclingTour tour = new CyclingTour("Veszprém-Balaton túra", LocalDate.of(2021, 8, 25));

        System.out.println(tour.getDescripton());
        System.out.println(tour.getStartTime());
        System.out.println(tour.getNumberOfPeople());
        System.out.println(tour.getKms());

        tour.registerPerson(5);
        tour.ride(30);

        System.out.println(tour.getDescripton());
        System.out.println(tour.getStartTime());
        System.out.println(tour.getNumberOfPeople());
        System.out.println(tour.getKms());
    }
}
