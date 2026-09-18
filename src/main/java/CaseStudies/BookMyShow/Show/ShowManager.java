package CaseStudies.BookMyShow.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowManager {
    List<Show> shows;

    public ShowManager() {
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public Show getShow() {
        for(Show show: shows) {
            if(!show.seatManager.allSeatsBooked()) {
                return show;
            }
        }
        return null;
    }
}
