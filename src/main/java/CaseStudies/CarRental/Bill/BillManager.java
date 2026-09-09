package CaseStudies.CarRental.Bill;

import CaseStudies.CarRental.Reservation.Reservation;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class BillManager {
    ConcurrentMap<UUID, Bill> bills = new ConcurrentHashMap<>();

    public Bill generateBill(Reservation r, BillingStrategy billingStrategy) {
        Bill bill = billingStrategy.generateBill(r);
        bills.put(bill.getBillId(), bill);
        return bill;
    }
}
