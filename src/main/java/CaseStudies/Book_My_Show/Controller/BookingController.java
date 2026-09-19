package CaseStudies.Book_My_Show.Controller;

import CaseStudies.Book_My_Show.Entities.Booking;
import CaseStudies.Book_My_Show.Entities.Show;
import CaseStudies.Book_My_Show.Entities.User;
import CaseStudies.Book_My_Show.Services.BookingService;

import java.util.List;
import java.util.UUID;

public class BookingController {
    BookingService bookingService;

    public BookingController() {
        this.bookingService = new BookingService();
    }

    public Booking createBooking(User user, Show show, List<Integer> seats) {
        return bookingService.book(user, show, seats);
    }

    public Booking getBooking(UUID bookingId) {
        return bookingService.getBooking(bookingId);
    }
}
