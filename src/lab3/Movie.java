package lab3;

public class Movie {
    private static StoredFiles movies = new StoredFiles("Movies.json");
    private String movieName;
    private String tag;
    private String rate;
    private String description;

    public Movie(String movieName, String tag, String rate, String description) {
        this.movieName = movieName;
        this.tag = tag;
        this.rate = rate;
        this.description = description;
    }

    public String getMovieName() {
        return movieName;
    }

    public static StoredFiles getMovies()
    {
        return movies;
    }
}
