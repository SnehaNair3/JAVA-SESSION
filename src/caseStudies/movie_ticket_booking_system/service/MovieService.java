package caseStudies.movie_ticket_booking_system.service;

import java.util.List;

import caseStudies.movie_ticket_booking_system.dao.MovieDAO;
import caseStudies.movie_ticket_booking_system.exception.MovieNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Movie;

public class MovieService {
	private MovieDAO movieDAO;
	

	public MovieService() {
		this.movieDAO=new MovieDAO();
	}

	public MovieService(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}

	// Add a movie (only if it doesn't already exist)
	public boolean addMovie(Movie movie) {
		Movie existing = movieDAO.getMovieById(movie.getMovieId());
		if (existing != null) {
			System.out.println("Movie with ID : " + movie.getMovieId() + " already exists.");
			return false;
		}
		movieDAO.addMovie(movie);
		return true;
	}

	// Get all movies
	public List<Movie> getAllMovies() {
		return movieDAO.getAllMovies();
	}

	// Get a specific movie by ID
	public Movie getMovieById(int id) throws MovieNotFoundException {
		Movie movie = movieDAO.getMovieById(id);
		if (movie == null) {
			throw new MovieNotFoundException("Movie not found with ID : " + id);
		}
		return movie;
	}

	// Delete a movie
	public boolean deleteMovie(int movieId) throws MovieNotFoundException {
		Movie movie = movieDAO.getMovieById(movieId);
		if (movie == null) {
			throw new MovieNotFoundException("Movie not found with ID : " + movieId);
		}
		return movieDAO.deleteMovie(movieId);
	}

}
