package CaseStudies.BookMyShow.Booking;

import CaseStudies.BookMyShow.Payment.PaymentStrategy;
import CaseStudies.BookMyShow.Seat.Seat;

import java.util.UUID;

public class Booking {
    UUID bookingId;
    Seat seat;
    UUID theatreId;
    UUID showId;
    boolean isPaid;

    public Booking(UUID theatreId, UUID showId, Seat seat) {
        this.seat = seat;
        this.theatreId = theatreId;
        this.showId = showId;
        this.bookingId = UUID.randomUUID();
        this.isPaid = false;
    }

    public Seat getSeat() {
        return seat;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public UUID getShowId() {
        return showId;
    }

    public UUID getTheatreId() {
        return theatreId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Booking bookTicket(PaymentStrategy paymentStrategy) {
        Booking booking = paymentStrategy.makePayment(this);
        return booking.isPaid() ? booking : null;
    }
}
