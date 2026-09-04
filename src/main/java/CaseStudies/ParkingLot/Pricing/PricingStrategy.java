package CaseStudies.ParkingLot.Pricing;

import CaseStudies.ParkingLot.Entity.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}
