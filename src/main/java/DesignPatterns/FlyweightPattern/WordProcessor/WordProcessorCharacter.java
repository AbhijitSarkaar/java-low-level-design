package DesignPatterns.FlyweightPattern.WordProcessor;

public class WordProcessorCharacter implements ICharacter {
    private char character;
    private String fontType;
    private int size;
    int row;
    int col;

    public WordProcessorCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    public void display(int row, int col) {
        System.out.println("row " + row);
        System.out.println("col " + col);
    }
}


