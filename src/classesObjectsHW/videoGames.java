package classesObjectsHW;

public class videoGames {

	private String name;
	private int releaseYear;
	private String genre;
	boolean shipped;
	
	public videoGames() {}
	
	public videoGames(String name, int releaseYear, String genre) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.genre = genre;
	}
	
	public videoGames(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRelease(int year) {
		this.releaseYear = year;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getName( ) {
		return name;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public boolean getShippedStatus() {
		return shipped;
	}
	
	public String poorRep() {
		return "WARNING: This game is rated 'Highly Negative'";
	}
	
	public static void main(String[] args) {
		videoGames placeholder = new videoGames("placeholder", 2023, "Adventure");
		System.out.println(placeholder.poorRep());
		System.out.println("Name: " + placeholder.name);
		System.out.println("Release Year: " + placeholder.releaseYear);
		System.out.println("Genre: " + placeholder.genre);
	}

}
