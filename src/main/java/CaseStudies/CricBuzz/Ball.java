package CaseStudies.CricBuzz;

import CaseStudies.CricBuzz.Enum.BallType;
import CaseStudies.CricBuzz.Enum.RunType;

public class Ball {
    int ballNo;
    BallType ballType;
    RunType runType;
    Player playedBy;
    Player bowledBy;

    public Ball(int ballNo, BallType ballType, RunType runType, Player playedBy, Player bowledBy) {
        this.ballNo = ballNo;
        this.ballType = ballType;
        this.runType = runType;
        this.playedBy = playedBy;
        this.bowledBy = bowledBy;
    }

    public BallType getBallType() {
        return ballType;
    }

    public RunType getRunType() {
        return runType;
    }

    public Player getPlayedBy() {
        return playedBy;
    }

    public Player getBowledBy() {
        return bowledBy;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballNo=" + ballNo +
                ", ballType=" + ballType +
                ", runType=" + runType +
                ", playedBy=" + playedBy +
                ", bowledBy=" + bowledBy +
                '}';
    }
}
