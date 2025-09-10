package caseStudies.movie_ticket_booking_system.dao;

import java.util.ArrayList;
import java.util.List;

import caseStudies.movie_ticket_booking_system.model.Movie;

public class MovieDAO {
	List<Movie> movies = new ArrayList<Movie>();

	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public List<Movie> getAllMovies() {
		return movies;
	}

	public Movie getMovieById(int id) {
		for (Movie movie : movies) {
			if (movie.getMovieId() == id) {
				return movie;
			}
		}
		return null;
	}

	public boolean deleteMovie(int id) {
		return movies.removeIf(movie -> movie.getMovieId() == id);
	}
}
