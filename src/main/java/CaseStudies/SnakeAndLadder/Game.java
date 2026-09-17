package CaseStudies.SnakeAndLadder;

public class Game {
    Board board;
    Dice dice;
    Player playerOne;
    Player playerTwo;
    Player currentPlayer;
    boolean completed;

    public void initialize() {
        this.board = new Board();
        this.board.setup(10, 5,4);
        this.dice = new Dice();
        this.playerOne = new Player("player_one");
        this.playerTwo = new Player("player_two");
        this.completed = false;
    }

    public void start() {
        int turn = 0;
        while(!completed) {
            int diceNumber = dice.fetchNumber();

            if(turn == 0) currentPlayer = playerOne;
            else currentPlayer = playerTwo;

            int position = currentPlayer.getCurrentPosition() + diceNumber;
            int nextPosition = board.getNextPosition(position);
            currentPlayer.setCurrentPosition(nextPosition);
            System.out.println(currentPlayer.playerName + " position " + position + " nextPosition " + nextPosition);
            if(nextPosition >= (board.cells.length * board.cells.length) - 1) {
                System.out.println(currentPlayer.playerName);
                completed = true;
            }

            turn = (turn + 1) % 2;
        }
    }
}
