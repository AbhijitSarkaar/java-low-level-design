package CaseStudies.CricBuzz;

import CaseStudies.CricBuzz.Enum.BallType;
import CaseStudies.CricBuzz.Enum.RunType;

import java.util.ArrayList;
import java.util.List;

public class Over {
    int overNumber;
    List<Ball> balls;

    public Over(int overNumber) {
        this.overNumber = overNumber;
        balls = new ArrayList<>();
    }
    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public void play(Observable observable, Player playedBy, Player bowler) {
        for(int i = 1; i <= 6; ++i) {
            BallType ballType = getBallType();
            RunType run = getRun();
            Ball ball = new Ball(i, ballType, run, playedBy, bowler);
            addBall(ball);
            ballDelivery(ball, observable);
        }
    }

    public void ballDelivery(Ball ball, Observable observable) {
        observable.setCurrentBallInfo(ball);
    }

    public RunType getRun() {
        double random = Math.random();
        if(random < 0.1) return RunType.SIX;
        else if(random < 0.2) return RunType.FOUR;
        return RunType.ONE;
    }

    public BallType getBallType() {
        double random = Math.random();
        if(random < 0.1) return BallType.NOBALL;
        else if(random < 0.2) return BallType.WIDEBALL;
        return BallType.NORMAL;
    }
}
