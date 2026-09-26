package DesignPatterns.FlyweightPattern.Robot;

public class Robot {
    int coordinateX;
    int coordinateY;

    String type;
    Sprites body;

    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }
}
