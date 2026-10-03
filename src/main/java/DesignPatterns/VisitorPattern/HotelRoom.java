package DesignPatterns.VisitorPattern;

public interface HotelRoom {
    void accept(RoomVisitor roomVisitor);
}
