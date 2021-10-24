package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public List<String> people = Arrays.asList("Keller Tamás", "Zaránd Alina", "Aporfiné Andrea", "Domján Gábor",
            "Gajdics Rita", "Simon Georgina", "Balla Beáta", "Zima Andrea", "Árkovits Natália", "Smidla Judit");

    Random rnd = new Random();
    int firstDraw = rnd.nextInt(1, 6);
    int secondDraw = rnd.nextInt(6, 11);

    public static void main(String[] args) {
        RandomDraw draw = new RandomDraw();
        System.out.println("1. nyertes: " + draw.people.get(draw.firstDraw - 1));
        System.out.println("2. nyertes: " + draw.people.get(draw.secondDraw - 1));
    }
}
