package CaseStudies.BookMyShow.Payment;

import CaseStudies.BookMyShow.Booking.Booking;
import CaseStudies.BookMyShow.Enum.SeatStatus;

public class UPIPayment implements PaymentStrategy {
    @Override
    public Booking makePayment(Booking booking) {
        System.out.println("UPIPayment.makePayment()");
        System.out.println("booking details");
        System.out.println("booking id " + booking.getBookingId());
        System.out.println("theatre " + booking.getTheatreId());
        System.out.println("show " + booking.getShowId());
        System.out.println("seat " + booking.getSeat().getSeatNumber());
        System.out.println("amount " + booking.getSeat().getTicketPrice());

        booking.setPaid(true);
        booking.getSeat().setSeatStatus(SeatStatus.BOOKED);
        return booking;
    }
}
