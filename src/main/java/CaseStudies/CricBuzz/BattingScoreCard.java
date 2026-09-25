package CaseStudies.CricBuzz;

public class BattingScoreCard {
    int totalRun;
    int totalBallsPlayed;
    int noOfFours;
    int noOfSixes;

    public BattingScoreCard() {
        this.totalRun = 0;
        this.totalBallsPlayed = 0;
        this.noOfFours = 0;
        this.noOfSixes = 0;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public void setTotalRun(int totalRun) {
        this.totalRun = totalRun;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getNoOfFours() {
        return noOfFours;
    }

    public void setNoOfFours(int noOfFours) {
        this.noOfFours = noOfFours;
    }

    public int getNoOfSixes() {
        return noOfSixes;
    }

    public void setNoOfSixes(int noOfSixes) {
        this.noOfSixes = noOfSixes;
    }

    @Override
    public String toString() {
        return "BattingScoreCard{" +
                "totalRun=" + totalRun +
                ", totalBallsPlayed=" + totalBallsPlayed +
                ", noOfFours=" + noOfFours +
                ", noOfSixes=" + noOfSixes +
                '}';
    }
}
