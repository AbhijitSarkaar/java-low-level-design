package CaseStudies.CricBuzz;

import CaseStudies.CricBuzz.Enum.RunType;

public class BattingObserver implements Observer {

    @Override
    public void update(Ball ball) {
        Player playedBy = ball.getPlayedBy();
        BattingScoreCard battingScoreCard = playedBy.getBattingScoreCard();

        battingScoreCard.setTotalRun(battingScoreCard.getTotalRun() + ball.getRunType().getValue());
        battingScoreCard.setTotalBallsPlayed(battingScoreCard.getTotalBallsPlayed() + 1);
        if(ball.getRunType().getValue() == RunType.FOUR.getValue()) {
            battingScoreCard.setNoOfFours(battingScoreCard.getNoOfFours() + 1);
        }
        if(ball.getRunType().getValue() == RunType.SIX.getValue()) {
            battingScoreCard.setNoOfSixes(battingScoreCard.getNoOfSixes() + 1);
        }

        playedBy.setBattingScoreCard(battingScoreCard);

    }
}
