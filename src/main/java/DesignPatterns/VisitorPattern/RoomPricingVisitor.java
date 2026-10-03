package DesignPatterns.VisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("pricing visitor of of single room");
        singleRoomObj.setRoomPrice(1000);
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("pricing visitor of double room");
        doubleRoomObj.setRoomPrice(1000);
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("pricing visitor of deluxe room");
        deluxeRoomObj.setRoomPrice(1000);
    }
}
