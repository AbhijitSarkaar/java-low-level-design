package CaseStudies.ParkingLot.ParkingArea;

import CaseStudies.ParkingLot.Entity.Ticket;
import CaseStudies.ParkingLot.Payment.Payment;
import CaseStudies.ParkingLot.Pricing.CostComputation;

public class ExitGate {

    private CostComputation costComputation;

    public ExitGate(CostComputation costComputation) {
        this.costComputation = costComputation;
    }

    public void completeExit(ParkingBuilding parkingBuilding, Ticket ticket, Payment payment) {
        double amount = calculatePrice(ticket);
        boolean success = payment.makePayment(amount);
        if(!success) {
            throw new RuntimeException("Payment failed");
        }
        parkingBuilding.release(ticket);
        System.out.println("ExitGate.completeExit()");
    }

    private double calculatePrice(Ticket ticket) {
        return costComputation.compute(ticket);
    }
}
