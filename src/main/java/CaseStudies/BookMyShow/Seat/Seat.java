package CaseStudies.BookMyShow.Seat;

import CaseStudies.BookMyShow.Enum.SeatStatus;

public class Seat {
    int seatNumber;
    int ticketPrice;
    SeatStatus seatStatus;

    public Seat(int seatNumber, int ticketPrice) {
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
