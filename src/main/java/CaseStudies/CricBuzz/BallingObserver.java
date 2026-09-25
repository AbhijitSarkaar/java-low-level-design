package CaseStudies.CricBuzz;

import CaseStudies.CricBuzz.Enum.BallType;

public class BallingObserver implements Observer {
    @Override
    public void update(Ball ball) {
        Player bowledBy = ball.getBowledBy();
        BowlingScoreCard bowlingScoreCard = bowledBy.getBowlingScoreCard();
        bowlingScoreCard.setTotalBallsDelivered(bowlingScoreCard.getTotalBallsDelivered() + 1);
        bowlingScoreCard.setTotalOversDelivered(bowlingScoreCard.getTotalBallsDelivered() / 6);
        bowlingScoreCard.setTotalRunsGiven(bowlingScoreCard.getTotalRunsGiven() + ball.getRunType().getValue());
        if(ball.getBallType() == BallType.NOBALL) {
            bowlingScoreCard.setNoOfNoBallsGiven(bowlingScoreCard.getNoOfNoBallsGiven() + 1);
        }
        if(ball.getBallType() == BallType.WIDEBALL) {
            bowlingScoreCard.setNoOfWideBallsGiven(bowlingScoreCard.noOfWideBallsGiven + 1);
        }
        bowledBy.setBowlingScoreCard(bowlingScoreCard);
    }
}
