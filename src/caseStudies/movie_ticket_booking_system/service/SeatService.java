package caseStudies.movie_ticket_booking_system.service;

import java.util.List;

import caseStudies.movie_ticket_booking_system.dao.SeatDAO;
import caseStudies.movie_ticket_booking_system.exception.SeatNotAvailableException;
import caseStudies.movie_ticket_booking_system.model.Seat;

public class SeatService {
	private SeatDAO seatDAO;

	public SeatService() {
		this.seatDAO = new SeatDAO();
	}

	public SeatService(SeatDAO seatDAO) {
		this.seatDAO = seatDAO;
	}

	// Add a seat (only if it doesn't already exist)
	public boolean addSeat(Seat seat) {
		Seat existing = seatDAO.getSeatById(seat.getSeatId());
		if (existing != null) {
			System.out.println("Seat with ID : " + seat.getSeatId() + " already exists.");
			return false;
		}

		seatDAO.addSeat(seat);
		return true;
	}

	// Get all seats
	public List<Seat> getAllSeats() {
		return seatDAO.getAllSeats();
	}

	// Get a specific seat by ID
	public Seat getSeatById(int id) throws SeatNotAvailableException {
		Seat seat = seatDAO.getSeatById(id);
		if (seat == null) {
			throw new SeatNotAvailableException("❌ Seat not available with id : " + id);
		}
		return seat;
	}

	// Get seats by show ID
	public List<Seat> getSeatsByShowId(int showId) {
		return seatDAO.getSeatsByShowId(showId);
	}

	// Update seat availability
	public boolean updateSeatAvailability(int seatId, boolean isAvailable) {
		return seatDAO.updateSeatAvailability(seatId, isAvailable);
	}

	// Delete a seat
	public boolean deleteSeat(int seatId) throws SeatNotAvailableException {
		Seat seat = seatDAO.getSeatById(seatId);
		if (seat == null) {
			throw new SeatNotAvailableException("Seat not found with ID : " + seatId);
		}

		return seatDAO.deleteSeat(seatId);

	}

}
