package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> players = new ArrayList<>(Arrays.asList("Peti", "Gábor", "Andi", null, "Alina"));
    private Random random = new Random();

    public String getWinner() {
        int winner = random.nextInt(0, players.size());
        return players.get(winner).toUpperCase();
    }
}
