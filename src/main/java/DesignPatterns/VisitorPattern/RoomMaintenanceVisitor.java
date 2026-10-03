package DesignPatterns.VisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("maintenance of single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("maintenance of double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("maintenance of deluxe room");
    }
}
