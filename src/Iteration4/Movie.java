package Iteration4;

public class Movie extends Video{

    private String cast;

    public Movie(double duration, String author, String format, int width, int height, String resolution, String name, String genre, String cast) {
        super(duration, author, format, width, height, resolution, name, genre);
        this.cast = cast;
    }

    public String getCast() {
        return cast;
    }
}
