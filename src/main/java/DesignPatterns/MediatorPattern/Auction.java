package DesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> colleagues;

    public Auction() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void notifyBid(Colleague colleague, int amount) {
        for(Colleague bidder: colleagues) {
            if(!colleague.getName().equals(bidder.getName())) {
                bidder.receiveNotification(colleague, amount);
            }
        }
    }
}
