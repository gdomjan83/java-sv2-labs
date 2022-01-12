package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {
    private String teamName;
    private GameStatistics gameStatistics;
    private int points;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.gameStatistics = new GameStatistics();
    }

    public String getTeamName() {
        return teamName;
    }

    public TeamStatistics.GameStatistics getGameStatistics() {
        return gameStatistics;
    }


    public int getPlayed() {
        return gameStatistics.played;
    }

    public int getWon() {
        return gameStatistics.won;
    }

    public int getTied() {
        return gameStatistics.tied;
    }

    public int getLost() {
        return gameStatistics.lost;
    }

    public int getGoalsfor() {
        return gameStatistics.goalsFor;
    }

    public int getGoalsAgainst() {
        return gameStatistics.goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        TeamStatistics ts = (TeamStatistics) other;
        return teamName.equals(ts.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        int difference = plusGoalsFor - plusGoalsAgainst;
        if (gameStatistics != null) {
            gameStatistics.played++;
            wonTiedLostPointUpdate(gameStatistics, difference);
            gameStatistics.goalsFor += plusGoalsFor;
            gameStatistics.goalsAgainst += plusGoalsAgainst;
        }
    }

    private void wonTiedLostPointUpdate(GameStatistics gameStatistics, int goalDifference) {
        if (goalDifference > 0) {
            gameStatistics.won++;
            this.points += 3;
        }
        if (goalDifference < 0) {
            gameStatistics.lost++;
        }
        if (goalDifference == 0) {
            gameStatistics.tied++;
            this.points++;
        }
    }

    public class GameStatistics {
        private int played;
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;
    }
}
