package CaseStudies.SnakeAndLadder;

public class Cell {
    int cellNumber;
    Jump jump;

    public Cell(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setJump(Jump jump) {
        this.jump = jump;
    }

    public Jump getJump() {
        return jump;
    }
}
