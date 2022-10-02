public class Details {
    private String movieName;
    private String movieDate;
    private String movieTime;
    private String movieVenue;

    public Details(){
    }

    public Details(String movieName,String movieDate,String movieTime,String movieVenue) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieVenue = movieVenue;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieVenue(String movieVenue) {
        this.movieVenue = movieVenue;
    }

    public String getMovieVenue() {
        return movieVenue;
    }

    @Override
    public String toString() {
        return "( " +
                "Movie: '" + getMovieName() + '\'' +
                ", Date: '" + getMovieDate() + '\'' +
                ", Time: '" + getMovieTime() + '\'' +
                ", Venue: '" + getMovieVenue() + '\'' +
                ')';
    }
}
