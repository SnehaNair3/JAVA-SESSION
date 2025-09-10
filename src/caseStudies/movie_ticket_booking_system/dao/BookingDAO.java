package caseStudies.movie_ticket_booking_system.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import caseStudies.movie_ticket_booking_system.model.Booking;

public class BookingDAO {
	List<Booking> bookings = new ArrayList<Booking>();
	
	

	public BookingDAO() {
		super();
	}

	public void addBooking(Booking booking) {
		bookings.add(booking);
	}

	public List<Booking> getAllBookings() {
		return bookings;
	}

	public Booking getBookingById(int id) {
		for (Booking booking : bookings) {
			if (booking.getBookingId() == id) {
				return booking;
			}
		}
		return null;
	}

	// Get all bookings for a specific user
	public List<Booking> getBookingsByUserId(int userId) {
		return bookings.stream().filter(b -> b.getUserId() == userId).collect(Collectors.toList());
	}

	public boolean updateBooking(Booking updatedBooking) {
		for (int i = 0; i < bookings.size(); i++) {
			if (bookings.get(i).getBookingId() == updatedBooking.getBookingId()) {
				bookings.set(i, updatedBooking);
				return true;
			}
		}
		return false;
	}

	public boolean deleteBooking(int id) {
		return bookings.removeIf(booking -> booking.getBookingId() == id);
	}

	// Delete all bookings for a specific user
	public boolean deleteBookingsByUserId(int userId) {
		return bookings.removeIf(b -> b.getUserId() == userId);
	}
}
//A Booking represents a seat reserved for a user in a particular show.