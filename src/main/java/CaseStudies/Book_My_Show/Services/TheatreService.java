package CaseStudies.Book_My_Show.Services;

import CaseStudies.Book_My_Show.Entities.Movie;
import CaseStudies.Book_My_Show.Entities.Screen;
import CaseStudies.Book_My_Show.Entities.Show;
import CaseStudies.Book_My_Show.Entities.Theatre;
import CaseStudies.Book_My_Show.Enums.City;

import java.time.LocalDate;
import java.util.*;

public class TheatreService {
    private final Map<City, List<Theatre>> cityTheatres = new HashMap<>();

    public void addTheatre(Theatre theatre) {
        cityTheatres
                .computeIfAbsent(theatre.getCity(), d -> new ArrayList<>())
                .add(theatre);
    }

    public Set<Movie> getMovies(City city, LocalDate date) {
        List<Theatre> theatres = cityTheatres.getOrDefault(city, List.of());
        Set<Movie> movies = new HashSet<>();

        for(Theatre theatre: theatres) {
            for(Screen screen: theatre.getScreens()) {
                for(Show show: screen.getShows(date)) {
                    movies.add(show.getMovie());
                }
            }
        }

        return movies;
    }

    public List<Theatre> getTheatres(City city, Movie movie, LocalDate date) {
        List<Theatre> theatres = cityTheatres.getOrDefault(city, List.of());
        return theatres.stream()
                .filter(t -> {
                    List<Screen> screens = t.getScreens();
                    for(Screen screen: screens) {
                        for(Show show: screen.getShows(date)) {
                            if(movie.getName().equals(show.getMovie().getName())) {
                                return true;
                            }
                        }
                    }
                    return false;
                })
                .toList();
    }

    public List<Show> getShows(Movie movie, LocalDate date, Theatre theatre) {
        List<Screen> screens = theatre.getScreens();
        List<Show> shows = new ArrayList<>();
        for(Screen screen: screens) {
            List<Show> shows1 = screen.getShows(date)
                    .stream()
                    .filter(show -> show.getMovie().equals(movie))
                    .toList();
            shows.addAll(shows1);
        }
        return shows;
    }
}
