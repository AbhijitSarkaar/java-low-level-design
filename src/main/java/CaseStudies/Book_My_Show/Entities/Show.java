package CaseStudies.Book_My_Show.Entities;


import CaseStudies.Book_My_Show.Enums.SeatStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class Show {

    private final Movie movie;
    private final LocalDate showDate;
    private final LocalTime startTime;

    private final Map<Integer, SeatStatus> seatStatusMap = new HashMap<>();
    private final Map<Integer, ReentrantLock> seatLocks = new HashMap<>();

    public Show(Movie movie, Screen screen, LocalDate showDate, LocalTime startTime) {

        this.movie = movie;
        this.showDate = showDate;
        this.startTime = startTime;

        for(Seat seat: screen.getSeats()) {
            seatStatusMap.put(seat.getSeatId(), SeatStatus.AVAILABLE);
            seatLocks.put(seat.getSeatId(), new ReentrantLock());
        }
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void confirmSeats(List<Integer> seats) {
        for(Integer seatId: seats) {
            seatStatusMap.put(seatId, SeatStatus.BOOKED);
        }
    }

    public void releaseSeats(List<Integer> seats) {
        for(Integer seatId: seats) {
            seatStatusMap.put(seatId, SeatStatus.AVAILABLE);
        }
    }

    public boolean lockSeats(List<Integer> seatIds) {
        List<Integer> sorted = new ArrayList<>(seatIds);
        Collections.sort(sorted);
        List<ReentrantLock> acquiredLocks = new ArrayList<>();

        try {
            for(int seatId: sorted) {
                ReentrantLock lock = seatLocks.get(seatId);
                lock.lock();
                acquiredLocks.add(lock);
            }
            for(int seatId: sorted) {
                if(seatStatusMap.get(seatId) != SeatStatus.AVAILABLE) {
                    return false;
                }
            }
            for(int seatId: sorted) {
                seatStatusMap.put(seatId, SeatStatus.LOCKED);
            }
        } finally {
            for(ReentrantLock lock: acquiredLocks) {
                lock.unlock();
            }
        }
        return true;
    }
}
