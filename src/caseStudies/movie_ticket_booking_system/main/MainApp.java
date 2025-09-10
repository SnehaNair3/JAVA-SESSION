package caseStudies.movie_ticket_booking_system.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import caseStudies.movie_ticket_booking_system.controller.BookingController;
import caseStudies.movie_ticket_booking_system.controller.MovieController;
import caseStudies.movie_ticket_booking_system.controller.SeatController;
import caseStudies.movie_ticket_booking_system.controller.ShowController;
import caseStudies.movie_ticket_booking_system.controller.UserController;
import caseStudies.movie_ticket_booking_system.model.Booking;
import caseStudies.movie_ticket_booking_system.model.Movie;
import caseStudies.movie_ticket_booking_system.model.Show;
import caseStudies.movie_ticket_booking_system.model.User;

public class MainApp {

	private static Scanner scanner = new Scanner(System.in);

	private static UserController userController = new UserController();
	private static MovieController movieController = new MovieController();
	private static ShowController showController = new ShowController();
	private static BookingController bookingController = new BookingController();
	private static SeatController seatController = new SeatController();

	private static User loggedInUser;

	public static void main(String[] args) {
		boolean exit = false;

		while (!exit) {
			System.out.println("🎬 Welcome to Movie Ticket Booking System 🎬");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				signUp();
				break;

			case 2:
				logIn();
				break;

			case 3:
				exit = true;
				System.out.println("Thank you for using Movie Ticket Booking System!");
				break;

			default:
				System.out.println("Invalid choice!");
			}
			if (loggedInUser != null) {
				if (loggedInUser.getRole().equalsIgnoreCase("admin")) {
					showAdminMenu();
				} else {
					showClientMenu();
				}
			}
		}
	}

	private static void signUp() {
		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		System.out.print("Specify your role :  ");
		String role = scanner.nextLine();

		User newUser = new User(username, password, role);
		userController.registerUser(newUser);

	}

	private static void logIn() {
		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		User user = userController.loginUserAndReturn(username, password);
		if (user != null) {
			loggedInUser = user;
		} else {
			System.out.println("Login failed.");
		}
	}

	private static void showAdminMenu() {
		boolean back = false;
		while (!back) {
			System.out.println("\n=== Admin Menu ===");
			System.out.println("1. Add Movie");
			System.out.println("2. View Movies");
			System.out.println("3. Add Show");
			System.out.println("4. View Shows");
			System.out.println("5. Logout");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter movie ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); // consume leftover newline

				System.out.print("Enter movie title: ");
				String title = scanner.nextLine();

				System.out.print("Enter genre: ");
				String genre = scanner.nextLine();

				System.out.print("Enter duration (in minutes): ");
				int duration = scanner.nextInt();
				scanner.nextLine(); // consume leftover newline

				Movie movie = new Movie(id, title, genre, duration);
				movieController.addMovie(movie);
				break;

			case 2:
				movieController.getAllMovies();
				break;

			case 3:
				System.out.print("Enter Show ID: ");
				int showId = scanner.nextInt();
				scanner.nextLine(); // consume newline

				System.out.print("Enter Movie Name: ");
				String movieName = scanner.nextLine();

				System.out.print("Enter Movie Id: ");
				int movieId = scanner.nextInt();
				scanner.nextLine();

				// Create Movie object with just the name
//				Movie showMovie = new Movie();
//				showMovie.setTitle(movieName);

				Movie selectedMovie = movieController.getMovieById(movieId); // Fetch full details
				// Show show = new Show(1, selectedMovie, 1, LocalDateTime.now(), 50);

				System.out.print("Enter Screen: ");
				String screen = scanner.nextLine();

				System.out.print("Enter Show Time (yyyy-MM-dd HH:mm): ");
				String dateTimeStr = scanner.nextLine();
				LocalDateTime showTime = LocalDateTime.parse(dateTimeStr,
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

				System.out.print("Enter Total Seats: ");
				int totalSeats = scanner.nextInt();

				System.out.print("Enter Available Seats: ");
				int availableSeats = scanner.nextInt();

				// Create and set Show
				Show show = new Show();
				show.setShowId(showId);
				show.setMovie(selectedMovie);
				show.setScreen(screen);
				show.setShowTime(showTime);
				show.setTotalSeats(totalSeats);
				show.setAvailableSeats(availableSeats);

				showController.addShow(show);
				break;

			case 4:
				showController.getAllShows();
				break;

			case 5:
				loggedInUser = null;
				back = true;
				break;

			default:
				System.out.println("Invalid choice!");

			}
		}
	}

	private static void showClientMenu() {
		boolean back = false;
		while (!back) {
			System.out.println("\n=== Client Menu ===");
			System.out.println("1. View Movies");
			System.out.println("2. View Shows");
			System.out.println("3. Book Ticket");
			System.out.println("4. View My Bookings");
			System.out.println("5. Logout");
			System.out.print("Enter choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				movieController.getAllMovies();
				break;
			case 2:
				showController.getAllShows();
				break;
			case 3:
				System.out.print("Enter Show ID: ");
				int showId = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Enter Movie Name: ");
				String movieName = scanner.nextLine();

				System.out.print("Enter Screen: ");
				String screen = scanner.nextLine();

				System.out.print("Enter number of seats to book: ");
				int seatCount = scanner.nextInt();
				scanner.nextLine();

				List<Integer> seatNumbers = new ArrayList<>();
				for (int i = 0; i < seatCount; i++) {
					System.out.print("Enter seat number " + (i + 1) + ": ");
					seatNumbers.add(scanner.nextInt());
					scanner.nextLine();
				}

				Show existingShow = showController.getShowById(showId);

				if (existingShow == null) {
					System.out.println("Show not found!");
					break;
				}

				// Use existingShow for booking
				Booking booking = new Booking();
				booking.setBookingId((int) (Math.random() * 1000));
				booking.setUserId(loggedInUser.getUserId());
				booking.setShow(existingShow); // <-- use the full show object
				booking.setSeatNumbers(seatNumbers);

				bookingController.addBooking(booking);
				// System.out.println("✅ Booking added successfully : " + booking);
				break;

			case 4:
				bookingController.getBookingsByUserId(loggedInUser.getUserId());
				// userId wont get printed because its not set..
				break;
			case 5:
				loggedInUser = null;
				back = true;
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
