package CaseStudies.Book_My_Show;

import CaseStudies.Book_My_Show.Controller.BookingController;
import CaseStudies.Book_My_Show.Controller.TheatreController;
import CaseStudies.Book_My_Show.Entities.*;
import CaseStudies.Book_My_Show.Enums.City;
import CaseStudies.Book_My_Show.Enums.SeatCategory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookMyShowApp {

    private BookingController bookingController;
    private TheatreController theatreController;

    public static void main(String[] args) {
        BookMyShowApp app = new BookMyShowApp();
        app.initialize();
        app.userFlow();
    }

    void initialize() {
        theatreController = new TheatreController();
        bookingController = new BookingController();

        Movie movie1 = new Movie("movie1");
        Movie movie2 = new Movie("movie2");

        Screen screen1 = new Screen(1, createSeats());
        Theatre theatre1City1 = new Theatre(
                "theatre1",
                City.CITY1,
                List.of(screen1)
        );

        Screen screen2 = new Screen(2, createSeats());
        Theatre theatre2City2 = new Theatre(
                "theatre2",
                City.CITY2,
                List.of(screen2)
        );


        theatreController.addTheatre(theatre1City1);
        theatreController.addTheatre(theatre2City2);

        Show show1 = new Show(
                movie1,
                screen1,
                LocalDate.now(),
                LocalTime.of(8, 0)
        );

        Show show2 = new Show(
                movie1,
                screen1,
                LocalDate.now(),
                LocalTime.of(15, 0)
        );

        Show show3 = new Show(
                movie2,
                screen1,
                LocalDate.now(),
                LocalTime.of(18, 0)
        );

        Show show4 = new Show(
                movie1,
                screen2,
                LocalDate.now().plusDays(1),
                LocalTime.of(9, 0)
        );

        screen1.addShow(show1);
        screen1.addShow(show2);
        screen1.addShow(show3);
        screen2.addShow(show4);

    }

    void userFlow() {
        User user1 = new User("user1");
        City selectedCity = City.CITY1;
        LocalDate selectedDate = LocalDate.now();

        Set<Movie> movies = theatreController.getMovies(selectedCity, selectedDate);
        System.out.println("Available movies");
        movies.forEach(m -> System.out.println(m.getName()));

        Movie selectedMovie = movies.iterator().next();
        System.out.println("Selected movie");
        System.out.println(selectedMovie.getName());

        List<Theatre> theatres = theatreController.getTheatres(selectedCity, selectedMovie, selectedDate);
        System.out.println("List of theatres");
        theatres.forEach(t -> System.out.println(t.getName()));

        Theatre selectedTheatre = theatres.get(0);
        System.out.println("Selected theatre");
        System.out.println(selectedTheatre.getName());

        List<Show> shows = theatreController.getShows(selectedMovie, selectedDate, selectedTheatre);
        System.out.println("Available shows");
        shows.forEach(s -> System.out.println(s.getStartTime()));

        Show selectedShow = shows.get(0);
        System.out.println("Selected show time: " + selectedShow.getStartTime());

        List<Integer> selectedSeats = List.of(1,2,3);

        Booking booking = bookingController.createBooking(
                user1,
                selectedShow,
                selectedSeats
        );

        System.out.println("Booking Id " + booking.getBookingId() );

    }

    List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();
        for(int i = 0; i < 100; ++i) {
            seats.add(new Seat(i + 1, SeatCategory.SILVER));
        }
        return seats;
    }
}
