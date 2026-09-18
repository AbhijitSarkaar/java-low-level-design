package CaseStudies.BookMyShow.Booking;

import CaseStudies.BookMyShow.Payment.PaymentStrategy;
import CaseStudies.BookMyShow.Seat.Seat;
import CaseStudies.BookMyShow.Show.Show;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BookingManager {
    Map<UUID, Booking> bookings;

    public BookingManager() {
        this.bookings = new HashMap<>();
    }

    public Booking createBooking(Show show, Seat seat, PaymentStrategy paymentStrategy) {
        Booking booking = new Booking(show.getTheatreId(), show.getShowId(), seat);
        bookings.put(booking.getBookingId(), booking);
        return booking.bookTicket(paymentStrategy);
    }
}
