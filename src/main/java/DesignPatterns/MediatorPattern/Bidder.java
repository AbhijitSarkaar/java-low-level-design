package DesignPatterns.MediatorPattern;

public class Bidder implements Colleague {

    AuctionMediator auctionMediator;
    String name;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.notifyBid(this, amount);
    }

    @Override
    public void receiveNotification(Colleague colleague, int amount) {
        System.out.println("received message for " + name);
        System.out.println(colleague.getName() + " has placed bid for amount " + amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
