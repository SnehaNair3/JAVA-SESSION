package caseStudies.movie_ticket_booking_system.controller;

import java.util.List;

import caseStudies.library_book_management_validation.BookService;
import caseStudies.movie_ticket_booking_system.exception.BookingNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Booking;
import caseStudies.movie_ticket_booking_system.service.BookingService;

public class BookingController {
	private BookingService bookingService;

	public BookingController() {
		this.bookingService = new BookingService();
	}

	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	// Add booking
	public void addBooking(Booking booking) {
		bookingService.addBooking(booking);
		System.out.println("✅ Booking added successfully : " + booking);
	}

	// Get all bookings
	public void getAllBookings() {
		List<Booking> bookings = bookingService.getAllBookings();
		if (bookings.isEmpty()) {
			System.out.println("No bookings found.");
		} else {
			bookings.forEach(System.out::println);
		}

	}

	// Get booking by ID
	public void getBookingById(int id) {
		try {
			Booking booking = bookingService.getBookingById(id);
			System.out.println("Booking found : " + booking);
		} catch (BookingNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}

	}

	// Get bookings by user ID
	public void getBookingsByUserId(int userId) {
		try {
			List<Booking> bookings = bookingService.getBookingsByUserId(userId);
			System.out.println("Bookings found  : " + bookings);
		} catch (BookingNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	// Update booking
	public void updateBooking(int bookingId, Booking updatedBooking) {
		try {
			boolean updated = bookingService.updateBooking(bookingId, updatedBooking);
			if (updated) {
				System.out.println("Booking updated successfully.");
			} else {
				System.out.println("❌ Failed to update.");
			}
		} catch (BookingNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	// Delete booking by ID
	public void deleteBooking(int id) {
		try {
			boolean deleted = bookingService.deleteBooking(id);
			if (deleted) {
				System.out.println("✅ Booking Deleted successfully for ID :  " + id);
			} else {
				System.out.println("❌ Failed to delete booking for ID : " + id);
			}
		} catch (BookingNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

	// Delete bookings by user ID
	public void deleteBookingsByUserId(int userId) {
		try {
			boolean deleted = bookingService.deleteBookingsByUserId(userId);
			if (deleted) {
				System.out.println(" ✅ Successfully deleted all the bookings of User ID : " + userId);
			} else {
				System.out.println("❌ Failed to delete bookings of user ID : " + userId);
			}
		} catch (BookingNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

}
