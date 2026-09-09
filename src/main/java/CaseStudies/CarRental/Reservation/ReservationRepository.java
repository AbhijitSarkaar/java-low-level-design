package CaseStudies.CarRental.Reservation;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ReservationRepository {
    Map<UUID, Reservation> reservations;

    public ReservationRepository() {
        this.reservations = new HashMap<>();
    }

    public void save(Reservation reservation) {
        reservations.put(reservation.getReservationId(), reservation);
    }

    public Reservation findById(UUID reservationId) {
        return reservations.get(reservationId);
    }

    public void remove(UUID reservationId) {
        reservations.remove(reservationId);
    }
}
