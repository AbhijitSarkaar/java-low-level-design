package CaseStudies.CricBuzz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Team team1 = setupTeam("team1");
        Team team2 = setupTeam("team2");

        Match match = new Match(team1, team2, new T20Match());
        Innings firstInnings = match.getFirstInnings();
        firstInnings.startInnings();
        firstInnings.battingScoreCard();
        System.out.println("---------------------");
        firstInnings.bowlingScoreCard();
    }

    static Team setupTeam(String teamName) {
        Queue<Player> players = new LinkedList<>();
        List<Player> bowlers = new ArrayList<>();
        for(int i = 1; i <= 11; ++i) {
            String playerName = "player" + i;
            Player p = new Player(playerName);
            players.add(p);
            if(i > 7) bowlers.add(p);
        }
        return new Team(teamName, players, bowlers);
    }
}
