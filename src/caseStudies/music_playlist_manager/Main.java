package caseStudies.music_playlist_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import caseStudies.music_playlist_manager.exceptions.InvalidArtistException;
import caseStudies.music_playlist_manager.exceptions.InvalidDurationException;
import caseStudies.music_playlist_manager.exceptions.InvalidSongIdException;
import caseStudies.music_playlist_manager.exceptions.InvalidTitleException;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SongService songService = new SongService();
		int choice = -1;

		do {
			System.out.println("\n🎵🎵 Music Player Menu 🎵🎵");
			System.out.println("1. Add Song");
			System.out.println("2. View All Songs");
			System.out.println("3. Search by Title");
			System.out.println("4. Search by Artist");
			System.out.println("5. Delete Song by ID");
			System.out.println("6. Sort by Duration");
			System.out.println("7. Total Song Count");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline
			} else {
				System.out.println("Invalid input.Choice must be an integer.");
				scanner.next();
				continue;
			}

			switch (choice) {
			case 1:
				try {
					// ID
					System.out.print("Enter Song ID: ");
					if (!scanner.hasNextInt()) {
					    scanner.next(); // flush the invalid token
					    throw new InvalidSongIdException("ID must be an integer.");
					}
					int id = scanner.nextInt();
					scanner.nextLine();

					// Title
					System.out.print("Enter Song Title: ");
					String title = scanner.nextLine();
					if (title.trim().isEmpty() || title.matches("\\d+")) {
						throw new InvalidTitleException("Title must be an non-empty string.");
					}

					// Artist
					System.out.println("Enter artist name: ");
					String artist = scanner.nextLine();
					if (artist.trim().isEmpty() || artist.matches("\\d+")) {
						throw new InvalidArtistException("Artist must be a non-empty string.");
					}

					// Duration
					System.out.print("Enter Duration (in seconds): ");
					if (!scanner.hasNextInt()) {
						scanner.next();
						throw new InvalidDurationException("Duration must be an integer.");
					}
					int duration = scanner.nextInt();
					scanner.nextLine();

					// Create and add song
					Song song = new Song(id, title, artist, duration);
					songService.validateAndAddSong(song);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				songService.displayAllSongs();
				break;

			case 3:
				System.out.print("Enter Title to Search: ");
				String searchTitle = scanner.nextLine();
				Song foundTitle = songService.searchSongByTitle(searchTitle);
				System.out.println((foundTitle != null) ? foundTitle : "Song not found.");
				break;

			case 4:
				System.out.print("Enter Artist to Search: ");
				String searchArtist = scanner.nextLine();
				List<Song> songs = songService.searchSongsByArtist(searchArtist);
				if (songs.isEmpty()) {
					System.out.println("No songs found by that artist.");
				} else {
					songs.forEach(System.out::println);
				}
				break;

			case 5:
				System.out.print("Enter Song ID to Delete: ");
				if (scanner.hasNextInt()) {
					int delId = scanner.nextInt();
					boolean deleted = songService.deleteSongById(delId);
					System.out.println(deleted ? "Song deleted successfully." : "Song ID not found");
				} else {
					System.out.println("Invalid ID input.");
					scanner.next();
				}
				break;

			case 6:
				songService.sortSongsByDuration();
				System.out.println("Songs sorted by duration: ");
				songService.displayAllSongs();
				break;

			case 7:
				System.out.println("Total songs :  " + songService.getTotalSongs());
				break;

			case 8:
				System.out.println("Exiting ...........");
				break;

			default:
				System.out.println("Invalid choice..Please enter a valid choice between 1 to 8.");
			}
		} while (choice != 8);
		scanner.close();
	}
}

/*
 * \\d → This is a regular expression (regex) that matches a digit (0–9). One
 * backslash is used to escape the other because Java strings need \\ to
 * represent a single \. + → Means "one or more" repetitions.
 */
/*
 * This line is used to check if the title is made up of only digits, like
 * "123", "45", etc.
 */
