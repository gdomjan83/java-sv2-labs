package nestedclasses.soccer;

import defaultconstructor.chess.Team;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return new ArrayList<>(leagueTable);
    }

    public void addGame(GameResult result) {
        TeamStatistics home = new TeamStatistics(result.teamHome);
        TeamStatistics guest = new TeamStatistics(result.teamGuest);
        addNewTeam(home, guest);
        home = leagueTable.get(leagueTable.indexOf(home));
        guest = leagueTable.get(leagueTable.indexOf(guest));
        home.played(result.goalHome, result.goalGuest);
        guest.played(result.goalGuest, result.goalHome);
    }

    private void addNewTeam(TeamStatistics home, TeamStatistics guest) {
        if (!leagueTable.contains(home)) {
            leagueTable.add(home);
        }
        if (!leagueTable.contains(guest)) {
            leagueTable.add(guest);
        }
    }

    public static class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
