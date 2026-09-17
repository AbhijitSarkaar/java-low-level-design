package CaseStudies.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public void setup(int size, int noOfSnakes, int noOfLadders) {
        initializeBoard(size);
        setJumps(size, noOfSnakes, noOfLadders);
    }

    public void initializeBoard(int size) {
        this.cells = new Cell[size][size];
        for(int i = 0; i < this.cells.length; ++i) {
            for(int j = 0; j < this.cells.length; ++j) {
                int cellNumber = (10 * i) + j;
                this.cells[i][j] = new Cell(cellNumber);
            }
        }
    }

    public void setJumps(int size, int noOfSnakes, int noOfLadders) {
        while(noOfSnakes > 0) {
            int start = ThreadLocalRandom.current().nextInt(0, (size * size));
            int end = ThreadLocalRandom.current().nextInt(0, (size * size));
            if(start > end) {
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                cell.setJump(jump);
                noOfSnakes--;
            }
        }

        while(noOfLadders > 0) {
            int start = ThreadLocalRandom.current().nextInt(0, (size * size));
            int end = ThreadLocalRandom.current().nextInt(0, (size * size));
            if(start < end) {
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                cell.setJump(jump);
                noOfLadders--;
            }
        }
    }

    public int getNextPosition(int position) {
        int size = cells.length;
        if(position >= (size * size) - 1) return position;
        Cell cell = getCell(position);
        Jump jump = cell.getJump();
        if(jump != null) {
            return jump.getEnd();
        }
        return position;
    }

    public Cell getCell(int position) {
        int row = position / cells.length;
        int col = position % cells.length;

        return cells[row][col];
    }
}
