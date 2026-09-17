package CaseStudies.SnakeAndLadder;

public class Player {
    String playerName;
    int currentPosition;

    public Player(String playerName) {
        this.playerName = playerName;
        this.currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
