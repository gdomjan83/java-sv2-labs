package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthDay {
    private List<String> data = new ArrayList<>();

    public List<String> getData() {
        return data;
    }

    public void addData(String name, String date) {
        String line = name + ", " + date;
        data.add(line);
    }

    public void writeFile(Path path) {
        try {
            Files.write(path, data);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file.", ioe);
        }
    }

    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();
        Scanner sc = new Scanner(System.in);

        System.out.println("Adatok rögzítése. A rögzítés bejezéséhez rögzítsd az X karaktert.");
        boolean running = true;
        String name;
        String bDay;

        while (running) {
            System.out.println("Név:");
            name = sc.nextLine();
            System.out.println("Születésnap:");
            bDay = sc.nextLine();

            if ("x".equalsIgnoreCase(name) || "x".equalsIgnoreCase((bDay))) {
                running = false;
            } else {
                birthDay.addData(name, bDay);
            }
        }
        birthDay.writeFile(Paths.get("src/main/resources/data.txt"));
        System.out.println("Rögzítés vége.");
    }
}
