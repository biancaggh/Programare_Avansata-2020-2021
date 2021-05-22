package lab9;

import java.util.List;

import static lab9.MovieDAO.findById;

public class Main {
    public static void main(String[] args) {


        Movie movie = findById(1);
        System.out.println(movie);
        List<Movie> movies = MovieDAO.findByTitle("Nocturnal Animals");
        System.out.println(movies);

        SingletonConnection.closeConnection();
    }
}
