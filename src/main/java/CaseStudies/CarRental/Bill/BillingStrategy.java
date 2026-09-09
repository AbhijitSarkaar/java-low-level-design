package CaseStudies.CarRental.Bill;

import CaseStudies.CarRental.Reservation.Reservation;

public interface BillingStrategy {
    Bill generateBill(Reservation r);
}
