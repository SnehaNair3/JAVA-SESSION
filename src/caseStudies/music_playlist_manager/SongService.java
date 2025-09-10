package caseStudies.music_playlist_manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import caseStudies.library_book_management_validation.exceptions.DuplicateBookIdException;
import caseStudies.music_playlist_manager.exceptions.DuplicateSongIdException;
import caseStudies.music_playlist_manager.exceptions.DuplicateTitleException;
import caseStudies.music_playlist_manager.exceptions.InvalidArtistException;
import caseStudies.music_playlist_manager.exceptions.InvalidDurationException;
import caseStudies.music_playlist_manager.exceptions.InvalidSongIdException;
import caseStudies.music_playlist_manager.exceptions.InvalidTitleException;

public class SongService {
	private List<Song> playlist = new ArrayList<Song>();

	// Add song with validation
	public boolean validateAndAddSong(Song song) throws DuplicateSongIdException, DuplicateTitleException,
			InvalidSongIdException, InvalidTitleException, InvalidArtistException, InvalidDurationException {

		// ID must be positive
		if (song.getId() <= 0) {
			throw new InvalidSongIdException("Song ID must be a positive integer.");
		}

		// Title should not be null/empty
		if (song.getTitle() == null || song.getTitle().trim().isEmpty()) {
			throw new InvalidTitleException("Song title cannot be empty.");
		}

		// Artist cannot be empty
		if (song.getArtist() == null || song.getArtist().trim().isEmpty()) {
			throw new InvalidArtistException("Artist name cannot be empty.");
		}

		// Duration must be positive
		if (song.getDuration() <= 0) {
			throw new InvalidDurationException("Song duration must be greater than 0 seconds.");
		}

		// Check for duplicate ID or title
		for (Song s : playlist) {
			if (s.getId() == song.getId()) {
				throw new DuplicateSongIdException("Song ID already exists.");
			}
			if (s.getTitle().equalsIgnoreCase(song.getTitle())) {
				throw new DuplicateTitleException("Song title already exists.");
			}
		}

		playlist.add(song);
		System.out.println("Song added successfully.");
		return true;

	}

	// Display all songs
	public void displayAllSongs() {
		if (playlist.isEmpty()) {
			System.out.println("No songs in playlist.Playlist is empty.");
		} else {
			for (Song s : playlist) {
				System.out.println(s);
			}
		}
	}

	// Search by title
	public Song searchSongByTitle(String title) {
		for (Song s : playlist) {
			if (s.getTitle().equalsIgnoreCase(title)) {
				return s;
			}
		}
		return null;
	}

	// Search by artist
	public List<Song> searchSongsByArtist(String artist) {
		List<Song> result = new ArrayList<Song>();
		for (Song s : playlist) {
			if (s.getArtist().equalsIgnoreCase(artist)) {
				result.add(s);
			}
		}
		return result;
	}

	// Delete by ID
	public boolean deleteSongById(int id) {
		Iterator<Song> iterator = playlist.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getId() == id) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	// sort songs by duration
	public void sortSongsByDuration() {
		playlist.sort(Comparator.comparingInt(Song::getDuration));
	}

	// Get total number of songs
	public int getTotalSongs() {
		return playlist.size();
	}

}
