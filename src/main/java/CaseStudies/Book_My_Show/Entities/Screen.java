package CaseStudies.Book_My_Show.Entities;

import java.time.LocalDate;
import java.util.*;

public class Screen {
    private final int screenId;
    private final List<Seat> seats;
    private final Map<LocalDate, List<Show>> showsByDate = new HashMap<>();

    public Screen(int screenId, List<Seat> seats) {
        this.screenId = screenId;
        this.seats = seats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addShow(Show show) {
        showsByDate
                .computeIfAbsent(show.getShowDate(), d -> new ArrayList<>())
                .add(show);
    }

    public List<Show> getShows(LocalDate date) {
        return showsByDate.getOrDefault(date, List.of());
    }

    @Override
    public String toString() {
        return "Screen{" +
                "screenId=" + screenId +
                ", seats=" + seats +
                ", showsByDate=" + showsByDate +
                '}';
    }
}
