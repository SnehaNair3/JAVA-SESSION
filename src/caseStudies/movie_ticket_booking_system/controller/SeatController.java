package caseStudies.movie_ticket_booking_system.controller;

import java.util.List;

import caseStudies.movie_ticket_booking_system.exception.SeatNotAvailableException;
import caseStudies.movie_ticket_booking_system.model.Seat;
import caseStudies.movie_ticket_booking_system.service.SeatService;

public class SeatController {
	private SeatService seatService;

	public SeatController() {
		this.seatService = new SeatService();
	}

	public SeatController(SeatService seatService) {
		this.seatService = seatService;
	}

	// Add new seat
	public void addSeat(Seat seat) {
		seatService.addSeat(seat);
		System.out.println("✅ Seat added successfully with ID : " + seat.getSeatId());
	}

	// Get all seats
	public void getAllSeats() {
		List<Seat> seats = seatService.getAllSeats();
		if (seats.isEmpty()) {
			System.out.println("❌ No seats available.");
		} else {
			seats.forEach(System.out::println);
		}
	}

	// Get seat by ID
	public void getSeatById(int id) {
		try {
			Seat seat = seatService.getSeatById(id);
			System.out.println(" Seat found with ID : " + id);
		} catch (SeatNotAvailableException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	// Get seats by show ID
	public void getSeatsByShowId(int showId) {
		List<Seat> seats = seatService.getSeatsByShowId(showId);
		if (seats.isEmpty()) {
			System.out.println("❌ No seats found for show Id : " + showId);
		}
		seats.forEach(System.out::println);
	}

	// Update seat availability
	public void updateSeatAvailability(int seatId, boolean isAvailable) {
		boolean updated = seatService.updateSeatAvailability(seatId, isAvailable);
		if (updated) {
			System.out.println("✅ Seat availability updated for ID: " + seatId);
		} else {
			System.out.println("❌ Seat not found with ID: " + seatId);
		}

	}

	// Delete seat
	public void deleteSeat(int seatId) {
		try {
			boolean deleted = seatService.deleteSeat(seatId);
			if (deleted) {
				System.out.println("✅ Seat deleted successfully with ID : " + seatId);

			} else {
				System.out.println("❌ Failed to delete with seat ID : " + seatId);
			}
		} catch (SeatNotAvailableException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

}
