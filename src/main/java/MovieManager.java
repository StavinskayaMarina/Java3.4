public class MovieManager {

    private String[] movies = new String[0];
    private int movieLimit;

    public MovieManager() {
        this.movieLimit = 5;
    }

    public MovieManager(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < movieLimit) {
            resultLength = movies.length;
        } else {
            resultLength = movieLimit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}
