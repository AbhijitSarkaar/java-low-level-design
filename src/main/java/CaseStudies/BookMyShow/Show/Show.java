package CaseStudies.BookMyShow.Show;

import CaseStudies.BookMyShow.Booking.Booking;
import CaseStudies.BookMyShow.Booking.BookingManager;
import CaseStudies.BookMyShow.Payment.PaymentStrategy;
import CaseStudies.BookMyShow.Seat.Seat;
import CaseStudies.BookMyShow.Seat.SeatManager;

import java.util.UUID;

public class Show {
    UUID showId;
    UUID theatreId;
    SeatManager seatManager;
    BookingManager bookingManager;

    public Show(UUID theatreId) {
        this.theatreId = theatreId;
        this.showId = UUID.randomUUID();
        this.seatManager = new SeatManager();
        this.bookingManager = new BookingManager();
    }

    public Seat getSeat() {
        return seatManager.getSeat();
    }

    public UUID getShowId() {
        return showId;
    }

    public UUID getTheatreId() {
        return theatreId;
    }

    public Booking bookTicket(Seat seat, PaymentStrategy paymentStrategy) {
        return bookingManager.createBooking(this, seat, paymentStrategy);
    }
}
