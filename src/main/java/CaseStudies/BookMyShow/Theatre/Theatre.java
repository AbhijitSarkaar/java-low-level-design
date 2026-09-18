package CaseStudies.BookMyShow.Theatre;

import CaseStudies.BookMyShow.Show.Show;
import CaseStudies.BookMyShow.Show.ShowManager;

import java.util.UUID;

public class Theatre {
    UUID theatreId;
    UUID cityId;
    ShowManager showManager;

    public Theatre(UUID cityId) {
        this.cityId = cityId;
        this.showManager = new ShowManager();
        this.theatreId = UUID.randomUUID();
        setupShows();
    }

    void setupShows() {
        showManager.addShow(new Show(theatreId));
        showManager.addShow(new Show(theatreId));
    }

    public Show getShow() {
        return showManager.getShow();
    }

}
