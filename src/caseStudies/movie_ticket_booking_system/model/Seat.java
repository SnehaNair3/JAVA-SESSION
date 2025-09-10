package caseStudies.movie_ticket_booking_system.model;

/*seat number and a flag to mark whether it’s booked or not.*/
public class Seat {
	private int seatId;
	private boolean isAvailable;
	private int showId;
	//Each seat should belong to a specific show.

	public Seat(int seatId, boolean isAvailable) {
		this.seatId = seatId;
		this.isAvailable = isAvailable;
	}

	public int getSeatId() {
		return seatId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void bookSeat() {
		this.isAvailable = true;
	}

	public void cancelSeat() {
		this.isAvailable = false;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", isAvailable=" + isAvailable + "]";
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
