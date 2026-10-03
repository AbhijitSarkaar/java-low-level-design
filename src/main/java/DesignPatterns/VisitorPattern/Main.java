package DesignPatterns.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();

        RoomMaintenanceVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);
        doubleRoom.accept(roomMaintenanceVisitor);
        deluxeRoom.accept(roomMaintenanceVisitor);

        RoomPricingVisitor roomPricingVisitor = new RoomPricingVisitor();
        roomPricingVisitor.visit(singleRoom);
        roomPricingVisitor.visit(doubleRoom);
        roomPricingVisitor.visit(deluxeRoom);

        System.out.println(singleRoom.getRoomPrice());
        System.out.println(doubleRoom.getRoomPrice());
        System.out.println(deluxeRoom.getRoomPrice());
    }
}
