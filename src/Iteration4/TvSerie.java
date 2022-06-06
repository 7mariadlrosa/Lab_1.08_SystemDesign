package Iteration4;

public class TvSerie extends Video{
    private int episode;
    private int season;

    public TvSerie(double duration, String author, String format, int width, int height, String resolution, String name, int episode, int season) {
        super(duration, author, format, width, height, resolution, name);
        this.episode = episode;
        this.season = season;
    }

    //GETTERS
    public int getEpisode() {

        return episode;
    }

    public int getSeason() {

        return season;
    }
}
