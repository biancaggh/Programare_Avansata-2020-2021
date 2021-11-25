package lab8_optional;

import java.sql.SQLException;
import java.util.List;

public class TestIt {
        public static void Test1() throws SQLException {
            Cinematography cinematography = Cinematography.getInstance("PA", "STUDENT2", "STUDENT2");
            cinematography.initializeDatabase();

            MovieDAO.create(1,"Nocturnal Animals");
            MovieDAO.create(2,"Captain Fantastic");
            MovieDAO.create(3,"Scarface");
            MovieDAO.create(4,"Wonder Woman");
            MovieDAO.create(5,"Me before you");


            List<Movie> movie1 = MovieDAO.findByTitle("Nocturnal Animals");
            List<Movie> movie2 = MovieDAO.findByTitle("Captain Fantastic");
            List<Movie> movie3 = MovieDAO.findByTitle("Scarface");
            List<Movie> movie4 = MovieDAO.findByTitle("Wonder Woman");
            List<Movie> movie5 = MovieDAO.findByTitle("Me before you");

            assert false;

            GenreDAO.create(01,"Romance");
            GenreDAO.create(02,"Action");
            GenreDAO.create(03,"Drama");

            List<Genre> genre1 = GenreDAO.findByName("Romance");
            List<Genre> genre2 = GenreDAO.findByName("Action");
            List<Genre> genre3 = GenreDAO.findByName("Drama");


            assert genre1.size() == 1 && genre2.size() == 2 && genre3.size() == 1;

            cinematography.deinitializeConnection();
        }


}
