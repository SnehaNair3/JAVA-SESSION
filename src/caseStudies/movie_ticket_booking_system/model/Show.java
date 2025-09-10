package caseStudies.movie_ticket_booking_system.model;

import java.time.LocalDateTime;

public class Show {
	private int showId;
	private Movie movie;
	private String screen;
	private LocalDateTime showTime;
	private int totalSeats;
	private int availableSeats;

	public Show(int showId, Movie movie, String screen, LocalDateTime showTime, int totalSeats, int availableSeats) {
		super();
		this.showId = showId;
		this.movie = movie;
		this.screen = screen;
		this.showTime = showTime;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats; // initially all seats available
	}

	public Show() {
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", movie=" + movie + ", screen=" + screen + ", showTime=" + showTime
				+ ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats + "]";
	}

	

}
