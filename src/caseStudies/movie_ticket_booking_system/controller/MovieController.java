package caseStudies.movie_ticket_booking_system.controller;

import java.util.List;

import caseStudies.movie_ticket_booking_system.exception.MovieNotFoundException;
import caseStudies.movie_ticket_booking_system.model.Movie;
import caseStudies.movie_ticket_booking_system.service.MovieService;

public class MovieController {
	private MovieService movieService;

	
	public MovieController() {
		this.movieService=new MovieService();
	}

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	// Add new movie
	public void addMovie(Movie movie) {
		movieService.addMovie(movie);
		System.out.println("✅ Movie added successfully : " + movie.getTitle());
	}

	// List all movies
	public void getAllMovies() {
		List<Movie> movies = movieService.getAllMovies();
		if (movies.isEmpty()) {
			System.out.println("❌ No movies found.");
		} else {
			movies.forEach(System.out::println);
		}
	}

	// Get movie by ID
	public Movie getMovieById(int id) {
		try {
			Movie movie = movieService.getMovieById(id);
			System.out.println("Movie found : " + movie);
			return movie;
		} catch (MovieNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
		return null;

	}

	// Delete movie by ID
	public void deleteMovie(int id) {
		try {
			boolean deleted = movieService.deleteMovie(id);
			if (deleted) {
				System.out.println("✅ Movie deleted successfully with ID :  " + id);
			} else {
				System.out.println("❌ Cannot delete movie.");
			}
		} catch (MovieNotFoundException e) {
			System.out.println("❌ " + e.getMessage());
		}
	}

}
