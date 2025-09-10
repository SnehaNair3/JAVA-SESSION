package caseStudies.movie_ticket_booking_system.model;

import java.util.List;

/*This will store info like booking ID, user name, show, and how many seats were booked.*/
public class Booking {
	private int bookingId;
	private int userId; // link to User
	private Show show;
	private List<Integer> seatNumbers;

	public Booking(int bookingId, int userId, Show show, List<Integer> seatNumbers) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.show = show;
		this.seatNumbers = seatNumbers;
	}

	public Booking() {
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public List<Integer> getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(List<Integer> seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", show=" + show + ", seatNumbers="
				+ seatNumbers + "]";
	}

}
