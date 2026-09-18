package CaseStudies.BookMyShow.Seat;

import CaseStudies.BookMyShow.Enum.SeatStatus;

import java.util.ArrayList;
import java.util.List;

public class SeatManager {
    List<Seat> seats;

    public SeatManager() {
        this.seats = new ArrayList<>();
        setup();
    }

    void setup() {
        for(int i = 0; i < 100; ++i) {
            seats.add(new Seat(i + 1, 1000));
        }
    }

    public Seat getSeat() {
        for (Seat seat : seats) {
            if (seat.getSeatStatus().equals(SeatStatus.AVAILABLE)) {
                return seat;
            }
        }
        return null;
    }

    public boolean allSeatsBooked() {
        for(Seat seat: seats) {
            if(seat.getSeatStatus().equals(SeatStatus.AVAILABLE)) {
                return false;
            }
        }
        return true;
    }

    public void bookAllSeats() {
        for(Seat seat: seats) {
            seat.setSeatStatus(SeatStatus.BOOKED);
        }
    }
}
