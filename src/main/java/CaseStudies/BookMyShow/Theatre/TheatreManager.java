package CaseStudies.BookMyShow.Theatre;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TheatreManager {
    List<Theatre> theatres;

    public TheatreManager() {
        this.theatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }

    public Theatre getTheatre() {
        return theatres.get(ThreadLocalRandom.current().nextInt(0, theatres.size()));
    }
}
