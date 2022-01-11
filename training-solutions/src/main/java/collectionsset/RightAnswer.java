package collectionsset;

import java.util.Objects;

public class RightAnswer {
    private String playerName;

    public RightAnswer(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RightAnswer rightAnswer = (RightAnswer) o;
        return playerName.equals(rightAnswer.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName);
    }
}
