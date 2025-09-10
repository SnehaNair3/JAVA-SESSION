package caseStudies.movie_ticket_booking_system.dao;

import java.util.ArrayList;
import java.util.List;

import caseStudies.movie_ticket_booking_system.model.Seat;

public class SeatDAO {

	List<Seat> seats = new ArrayList<Seat>();

	public SeatDAO() {
		super();
	}

	public void addSeat(Seat seat) {
		seats.add(seat);
	}

	public List<Seat> getSeatsByShowId(int id) {
		List<Seat> result = new ArrayList<Seat>();
		for (Seat seat : seats) {
			if (seat.getShowId() == id) {
				result.add(seat);
			}
		}
		return result;
	}

	public Seat getSeatById(int id) {
		for (Seat seat : seats) {
			if (seat.getSeatId() == id) {
				return seat;
			}
		}
		return null;
	}

	public List<Seat> getAllSeats() {
		return seats;
	}

	public boolean updateSeatAvailability(int seatId, boolean isAvailable) {
		Seat seat = getSeatById(seatId);
		if (seat != null) {
			seat.setAvailable(isAvailable);
			return true;
		}
		return false;
	}

	public boolean deleteSeat(int seatId) {
		Seat seat = getSeatById(seatId);
		if (seat != null) {
			seats.remove(seat);
			return true;
		}
		return false;
	}
}

//A Seat represents a specific seat in a show (with availability).