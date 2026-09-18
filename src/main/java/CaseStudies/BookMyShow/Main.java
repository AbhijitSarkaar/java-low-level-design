package CaseStudies.BookMyShow;

import CaseStudies.BookMyShow.City.City;
import CaseStudies.BookMyShow.Payment.UPIPayment;
import CaseStudies.BookMyShow.Seat.Seat;
import CaseStudies.BookMyShow.Show.Show;
import CaseStudies.BookMyShow.Theatre.Theatre;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        City city = app.getCity("city1");
        Theatre theatre = city.getTheatre();
        Show show = theatre.getShow();
        Seat seat = show.getSeat();
        show.bookTicket(seat, new UPIPayment());
    }
}
