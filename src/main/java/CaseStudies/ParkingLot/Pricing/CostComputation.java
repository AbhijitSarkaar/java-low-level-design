package CaseStudies.ParkingLot.Pricing;

import CaseStudies.ParkingLot.Entity.Ticket;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double compute(Ticket ticket) {
        return this.pricingStrategy.calculate(ticket);
    }
}
