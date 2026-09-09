package CaseStudies.CarRental.Product;

import java.time.LocalDate;

public class DateInterval {
    public final LocalDate from;
    public final LocalDate to;

    public DateInterval(LocalDate from, LocalDate to) {
        if(to.isBefore(from)) {
            throw new IllegalArgumentException("End date can not be before start date");
        }
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public boolean overlaps(DateInterval dateInterval) {
        if(this.getFrom().isAfter(dateInterval.getTo())
                || this.getTo().isBefore(dateInterval.getFrom()))
            return false;
        return true;
    }
}
