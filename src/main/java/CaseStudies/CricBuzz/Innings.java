package CaseStudies.CricBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Innings {
    Team battingTeam;
    Team bowlingTeam;
    int noOfOvers;
    List<Over> overs;
    Observable observable;
    BattingScoreCardController battingScoreCardController;
    BowlingScoreCardController bowlingScoreCardController;

    public Innings(Team battingTeam, Team bowlingTeam, int noOfOvers, Observable observable) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.noOfOvers = noOfOvers;
        this.observable = observable;
        this.overs = new ArrayList<>();
        battingScoreCardController = new BattingScoreCardController();
        bowlingScoreCardController = new BowlingScoreCardController();
    }

    public void startInnings() {

        battingTeam.chooseNextBatsman();
        battingTeam.chooseNextBatsman();

        for(int i = 1; i <= noOfOvers; ++i) {
            Player bowler = bowlingTeam.getBowler();
            if(i % 3 == 0) {
                battingScoreCardController.addScoreCard(
                        battingTeam.getStriker().getPlayerId(),
                        battingTeam.getStriker().getBattingScoreCard()
                );
                battingTeam.handleWicketFall();
                battingTeam.chooseNextBatsman();
            }

            Over over = new Over(i);
            over.play(observable, battingTeam.getStriker(), bowler);
            overs.add(over);

            bowlingScoreCardController.addScoreCard(bowler.getPlayerId(), bowler.getBowlingScoreCard());

            Player temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
        battingScoreCardController.addScoreCard(
                battingTeam.getStriker().getPlayerId(),
                battingTeam.getStriker().getBattingScoreCard()
        );
    }

    public void battingScoreCard() {
        System.out.println("batting team " + battingTeam.getTeamName() + " scorecard");

        battingScoreCardController.battingScoreCards.forEach((playerId, scoreCard) -> {
            System.out.println("player " + battingTeam.getPlayerName(playerId));
            System.out.println(scoreCard.toString());
        });
    }

    public void bowlingScoreCard() {
        System.out.println("bowling team " + bowlingTeam.getTeamName() + " scorecard");

        bowlingScoreCardController.bowlingScoreCards.forEach((playerId, scoreCard) -> {
            System.out.println("player " + bowlingTeam.getPlayerName(playerId));
            System.out.println(scoreCard.toString());
        });
    }

}
