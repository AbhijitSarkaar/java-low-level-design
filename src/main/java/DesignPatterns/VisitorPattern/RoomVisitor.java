package DesignPatterns.VisitorPattern;

public interface RoomVisitor {
    void visit(SingleRoom singleRoomObj);

    void visit(DoubleRoom doubleRoomObj);

    void visit(DeluxeRoom deluxeRoomObj);
}
