package CaseStudies.CricBuzz;

public class BowlingScoreCard {
    int totalBallsDelivered;
    int totalOversDelivered;
    int totalRunsGiven;
    int noOfNoBallsGiven;
    int noOfWideBallsGiven;

    public BowlingScoreCard() {
        this.totalBallsDelivered = 0;
        this.totalOversDelivered = 0;
        this.totalRunsGiven = 0;
        this.noOfNoBallsGiven = 0;
        this.noOfWideBallsGiven = 0;
    }

    public int getTotalBallsDelivered() {
        return totalBallsDelivered;
    }

    public void setTotalBallsDelivered(int totalBallsDelivered) {
        this.totalBallsDelivered = totalBallsDelivered;
    }

    public int getTotalOversDelivered() {
        return totalOversDelivered;
    }

    public void setTotalOversDelivered(int totalOversDelivered) {
        this.totalOversDelivered = totalOversDelivered;
    }

    public int getTotalRunsGiven() {
        return totalRunsGiven;
    }

    public void setTotalRunsGiven(int totalRunsGiven) {
        this.totalRunsGiven = totalRunsGiven;
    }

    public int getNoOfNoBallsGiven() {
        return noOfNoBallsGiven;
    }

    public void setNoOfNoBallsGiven(int noOfNoBallsGiven) {
        this.noOfNoBallsGiven = noOfNoBallsGiven;
    }

    public int getNoOfWideBallsGiven() {
        return noOfWideBallsGiven;
    }

    public void setNoOfWideBallsGiven(int noOfWideBallsGiven) {
        this.noOfWideBallsGiven = noOfWideBallsGiven;
    }

    @Override
    public String toString() {
        return "BowlingScoreCard{" +
                "totalBallsDelivered=" + totalBallsDelivered +
                ", totalOversDelivered=" + totalOversDelivered +
                ", totalRunsGiven=" + totalRunsGiven +
                ", noOfNoBallsGiven=" + noOfNoBallsGiven +
                ", noOfWideBallsGiven=" + noOfWideBallsGiven +
                '}';
    }
}
