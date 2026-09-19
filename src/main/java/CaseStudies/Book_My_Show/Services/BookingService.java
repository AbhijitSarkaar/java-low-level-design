package CaseStudies.Book_My_Show.Services;

import CaseStudies.Book_My_Show.Entities.Booking;
import CaseStudies.Book_My_Show.Entities.Payment;
import CaseStudies.Book_My_Show.Entities.Show;
import CaseStudies.Book_My_Show.Entities.User;
import CaseStudies.Book_My_Show.Enums.PaymentStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BookingService {
    Map<UUID, Booking> bookings = new HashMap<>();

    public Booking book(User user, Show show, List<Integer> seats) {
        if(!show.lockSeats(seats)) {
            throw new RuntimeException("Seats unavailable");
        }

        Payment payment = new Payment(PaymentStatus.COMPLETED);

        if(payment.getPaymentStatus() == PaymentStatus.COMPLETED) {
            show.confirmSeats(seats);
            Booking booking = new Booking(user, show, seats, payment);
            bookings.put(booking.getBookingId(), booking);
            return booking;
        } else {
            show.releaseSeats(seats);
            throw new RuntimeException("Payment failed");
        }
    }

    public Booking getBooking(UUID bookingId) {
        return bookings.get(bookingId);
    }
}
