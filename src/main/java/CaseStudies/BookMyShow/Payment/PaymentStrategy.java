package CaseStudies.BookMyShow.Payment;

import CaseStudies.BookMyShow.Booking.Booking;

public interface PaymentStrategy {
    Booking makePayment(Booking booking);
}
