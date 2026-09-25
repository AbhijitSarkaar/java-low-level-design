package CaseStudies.CricBuzz;

import java.util.List;
import java.util.Queue;
import java.util.UUID;

public class Team {
    public String teamName;
    Queue<Player> p11;
    PlayerBattingController playerBattingController;
    PlayerBowlingController playerBowlingController;

    public Team(String teamName, Queue<Player> players, List<Player> bowlers) {
        this.teamName = teamName;
        this.p11 = players;
        playerBattingController = new PlayerBattingController(players);
        playerBowlingController = new PlayerBowlingController(bowlers);
    }

    public void chooseNextBatsman() {
        try {
            playerBattingController.getNextPlayer();
        } catch (Exception e) {}
    }

    public String getTeamName() {
        return teamName;
    }

    public Player getStriker() {
        return playerBattingController.getStriker();
    }

    public Player getNonStriker() {
        return playerBattingController.getNonStriker();
    }

    public void setStriker(Player player) {
        playerBattingController.setStriker(player);
    }

    public void setNonStriker(Player player) {
        playerBattingController.setNonStriker(player);
    }

    public Player getBowler() {
        return playerBowlingController.getNextBowler();
    }

    public Queue<Player> getPlayers() {
        return p11;
    }

    public void handleWicketFall() {
        playerBattingController.handleWicketFall();
    }

    public String getPlayerName(UUID playerId) {
        for(Player player: p11) {
            if(player.getPlayerId().equals(playerId)) return player.getName();
        }
        return null;
    }

}
