package caseStudies.movie_ticket_booking_system.service;

import java.util.List;

import caseStudies.movie_ticket_booking_system.dao.BookingDAO;
import caseStudies.movie_ticket_booking_system.exception.BookingNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Booking;

public class BookingService {
	private BookingDAO bookingDAO;

	public BookingService() {
		this.bookingDAO = new BookingDAO();
	}

	public BookingService(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}

	public void addBooking(Booking booking) {
		bookingDAO.addBooking(booking);
	}

	public Booking getBookingById(int bookingId) throws BookingNotFoundException {
		Booking booking = bookingDAO.getBookingById(bookingId);
		if (booking == null) {
			throw new BookingNotFoundException("Booking with ID : " + bookingId + " not found.");
		}
		return booking;
	}

	// Get all bookings for a specific user
	public List<Booking> getBookingsByUserId(int userId) throws BookingNotFoundException {
		List<Booking> bookings = bookingDAO.getBookingsByUserId(userId);
		if (bookings.isEmpty()) {
			throw new BookingNotFoundException("No booking found for User ID : " + userId);
		}

		return bookings;
	}

	public List<Booking> getAllBookings() {
		return bookingDAO.getAllBookings();
	}

	// delete a booking
	public boolean deleteBooking(int bookingId) throws BookingNotFoundException {
		Booking booking = bookingDAO.getBookingById(bookingId);
		if (booking == null) {
			throw new BookingNotFoundException("Booking not found with ID : " + bookingId + " . Cannot delete.");
		}
		return bookingDAO.deleteBooking(bookingId);

	}

	// Delete all bookings for a specific user
	public boolean deleteBookingsByUserId(int userId) throws BookingNotFoundException {
		boolean removed = bookingDAO.deleteBookingsByUserId(userId);
		if (!removed) {
			throw new BookingNotFoundException("No bookings found for User ID : " + userId);
		}
		return removed;
	}

	public boolean updateBooking(int bookingId, Booking updatedBooking) throws BookingNotFoundException {
		Booking existing = bookingDAO.getBookingById(bookingId);
		if (existing == null) {
			throw new BookingNotFoundException("Booking not found.Cannot update.");
		}

		// ensure id stays same (avoid caller mistakes)
		updatedBooking.setBookingId(bookingId);
		boolean updated = bookingDAO.updateBooking(updatedBooking);
		if (!updated) {
			System.out.println("Update failed.");
		}
		return updated;
	}

}
