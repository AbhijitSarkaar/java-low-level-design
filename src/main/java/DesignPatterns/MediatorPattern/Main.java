package DesignPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder("bidder1", auctionMediator);
        Colleague bidder2 = new Bidder("bidder2", auctionMediator);
        Colleague bidder3 = new Bidder("bidder3", auctionMediator);

        bidder1.placeBid(10);
    }
}
