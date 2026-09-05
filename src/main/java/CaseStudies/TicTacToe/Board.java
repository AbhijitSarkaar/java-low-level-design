package CaseStudies.TicTacToe;

import java.util.ArrayList;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public boolean isFreeCellExists() {
        for(int i = 0; i < size; ++i) {
            for(int j = 0; j < size; ++j) {
                if(board[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

}
