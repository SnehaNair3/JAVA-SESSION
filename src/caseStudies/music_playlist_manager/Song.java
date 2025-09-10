package caseStudies.music_playlist_manager;

public class Song {
	private int id;
	private String title;
	private String artist;
	private int duration;

	public Song(int id, String title, String artist, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	public Song() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}

}
