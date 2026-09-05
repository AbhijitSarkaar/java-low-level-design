package CaseStudies.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        players = new LinkedList<>();

        // players
        PlayingPiece crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);
        PlayingPiece circlePiece = new PlayingPieceO();
        Player player2 = new Player("Player2", circlePiece);
        players.add(player1);
        players.add(player2);

        // board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {
            Player currentPlayer = players.removeFirst();
            if(!gameBoard.isFreeCellExists()) {
                noWinner = false;
                continue;
            }
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            boolean validMove = gameBoard.addPiece(row, col, currentPlayer.getPlayingPiece());
            if(!validMove) {
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            boolean isWinner = checkForWinner(row, col, currentPlayer.getPlayingPiece());
            if(isWinner) {
                return currentPlayer.getName();
            }
        }
        return "Tie";
    }

    public boolean checkForWinner(int row, int col, PlayingPiece playingPiece) {

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i = 0; i < col; ++i) {
               if(gameBoard.board[row][i] == null || gameBoard.board[row][i] != playingPiece) {
                   rowMatch = false;
                   break;
               }
        }

        for(int i = 0; i < row; ++i) {
            if(gameBoard.board[i][col] == null || gameBoard.board[i][col] != playingPiece) {
                colMatch = false;
                break;
            }
        }

        for(int i = 0, j = 0; i < row && j < col; ++i, j++) {
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j] != playingPiece) {
                diagonalMatch = false;
                break;
            }
        }

        for(int i = row - 1, j = 0; i >= 0 && j < col; --i, j++) {
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j] != playingPiece) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;

    }

}
