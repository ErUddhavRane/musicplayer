package musicplayer;

public class Song {
	String title;
	double Duration;
	
	public Song(String title, double duration) {
		super();
		this.title = title;
		Duration = duration;
	}
	public Song() {
		
	}
	public String getName() {
		return title;
	}
	public void setName(String name) {
		this.title = title;
	}
	public double getDuration() {
		return Duration;
	}
	public void setDuration(double duration) {
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Song [name=" + title + ", Duration=" + Duration + "]";
	}
	
	
}
