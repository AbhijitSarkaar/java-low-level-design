package CaseStudies.Book_My_Show.Entities;

import java.util.List;
import java.util.UUID;

public class Booking {
    UUID bookingId;
    User user;
    Show show;
    List<Integer> seats;
    Payment payment;

    public Booking(User user, Show show, List<Integer> seats, Payment payment) {
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
        this.bookingId = UUID.randomUUID();
    }

    public UUID getBookingId() {
        return bookingId;
    }
}
