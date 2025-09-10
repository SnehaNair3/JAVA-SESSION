package caseStudies.movie_ticket_booking_system.service;

import java.util.List;

import caseStudies.movie_ticket_booking_system.dao.ShowDAO;
import caseStudies.movie_ticket_booking_system.exception.ShowNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Show;

public class ShowService {
	private ShowDAO showDAO;

	public ShowService(ShowDAO showDAO) {
		this.showDAO = showDAO;
	}

	public ShowService() {
		this.showDAO = new ShowDAO();
	}

	// Add a show (only if it doesn't already exist)
	public boolean addShow(Show show) {
		Show existing = showDAO.getShowById(show.getShowId());
		if (existing != null) {
			System.out.println("Show with ID : " + show.getShowId() + " already exists.");
			return false;
		}

		showDAO.addShow(show);
		return true;
	}

	// Get all shows
	public List<Show> getAllShows() {
		return showDAO.getAllShows();
	}

	// Get a specific show by ID
	public Show getShowById(int id) throws ShowNotFoundException {
		Show show = showDAO.getShowById(id);
		if (show == null) {
			throw new ShowNotFoundException("Show not found with ID : " + id);
		}
		return show;
	}

	// Delete a show
	public boolean deleteShow(int id) throws ShowNotFoundException {
		Show show = showDAO.getShowById(id);
		if (show == null) {
			throw new ShowNotFoundException("Show not found with ID : " + id);

		}
		return showDAO.deleteShow(id);

	}

}
