package CaseStudies.CarRental.Reservation;

import CaseStudies.CarRental.Enum.ReservationStatus;
import CaseStudies.CarRental.Enum.ReservationType;

import java.time.LocalDate;
import java.util.UUID;

public class Reservation {

    UUID reservationId;
    UUID vehicleId;
    UUID userId;
    LocalDate bookedFrom;
    LocalDate bookedTo;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public Reservation(UUID vehicleId, UUID userId, LocalDate bookedFrom, LocalDate bookedTo, ReservationType reservationType) {
        this.vehicleId = vehicleId;
        this.userId = userId;
        this.bookedFrom = bookedFrom;
        this.bookedTo = bookedTo;
        this.reservationType = reservationType;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        this.reservationId = UUID.randomUUID();
    }

    public UUID getReservationId() {
        return reservationId;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public LocalDate getBookedTo() {
        return bookedTo;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
