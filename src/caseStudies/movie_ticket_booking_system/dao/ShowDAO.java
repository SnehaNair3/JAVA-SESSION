package caseStudies.movie_ticket_booking_system.dao;

import java.util.ArrayList;
import java.util.List;

import caseStudies.movie_ticket_booking_system.model.Show;

public class ShowDAO {
	List<Show> shows = new ArrayList<Show>();

	public ShowDAO() {
		super();
	}

	public void addShow(Show show) {
		shows.add(show);
	}

	public List<Show> getAllShows() {
		return shows;
	}

	public Show getShowById(int id) {
		for (Show show : shows) {
			if (show.getShowId() == id) {
				return show;
			}
		}
		return null;
	}

	public boolean deleteShow(int id) {
		return shows.removeIf(show -> show.getShowId() == id);
	}
}

//A Show represents a specific screening of a movie at a given time and date.
