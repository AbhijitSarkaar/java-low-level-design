package DesignPatterns.MediatorPattern;

public interface AuctionMediator {
    void addBidder(Colleague colleague);

    void notifyBid(Colleague colleague, int amount);
}
