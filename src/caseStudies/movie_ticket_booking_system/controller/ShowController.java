package caseStudies.movie_ticket_booking_system.controller;

import java.util.List;

import caseStudies.movie_ticket_booking_system.exception.ShowNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Show;
import caseStudies.movie_ticket_booking_system.service.ShowService;

public class ShowController {
	private ShowService showService;

	public ShowController() {
		this.showService = new ShowService();
	}

	public ShowController(ShowService showService) {
		this.showService = showService;
	}

	// Add new show
	public void addShow(Show show) {
		showService.addShow(show);
		System.out.println("✅ Show added successfully : " + show);
	}

	// Get all shows
	public void getAllShows() {
		List<Show> shows = showService.getAllShows();
		if (shows.isEmpty()) {
			System.out.println("❌ No shows available.");
		} else {
			shows.forEach(System.out::println);
		}
	}

	// Get show by ID
	public Show getShowById(int id) {
		try {
			Show show = showService.getShowById(id);
			System.out.println("Show found with ID : " + show);
			return show;
		} catch (ShowNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
		return null;

	}

	// Delete show
	public void deleteShow(int id) {
		try {
			boolean deleted = showService.deleteShow(id);
			if (deleted) {
				System.out.println("✅ Show deleted successfully with ID : " + id);
			} else {
				System.out.println("❌ Cannot delete show with ID : " + id);
			}
		} catch (ShowNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

}
