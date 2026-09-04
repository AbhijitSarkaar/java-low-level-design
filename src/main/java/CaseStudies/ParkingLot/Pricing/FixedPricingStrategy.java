package CaseStudies.ParkingLot.Pricing;

import CaseStudies.ParkingLot.Entity.Ticket;

public class FixedPricingStrategy implements PricingStrategy {
    @Override
    public double calculate(Ticket ticket) {
        return 0;
    }
}
