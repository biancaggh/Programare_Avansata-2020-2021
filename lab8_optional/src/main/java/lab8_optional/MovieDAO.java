package lab8_optional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
    public static void create(int ID, String Title) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement movieInsertionStatement = cinema.getStatement("INSERT INTO MOVIES(ID, Title) VALUES(?, ?)");
        movieInsertionStatement.setInt(1,ID);
        movieInsertionStatement.setString(2, Title);
        movieInsertionStatement.execute();
        movieInsertionStatement.close();
    }

    public static List<Movie> findByTitle(String Title) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement getMovieStatement = cinema.getStatement("SELECT ID, Release_date, Duration, Score  FROM MOVIES WHERE Title = ?");
        getMovieStatement.setString(1, Title);

        ResultSet movieRows = getMovieStatement.executeQuery();

        List<Movie> movies = new ArrayList<>();
        while (movieRows.next())
            movies.add(new Movie(movieRows.getInt(1), Title, movieRows.getDate(2),movieRows.getString(3),movieRows.getDouble(4)));
        movieRows.close();
        getMovieStatement.close();

        return movies;
    }

    public static List<Movie> findByID(int ID) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement getMovieStatement =cinema.getStatement("SELECT Title, Release_date, Duration, Score FROM MOVIES WHERE ID = ?");
        getMovieStatement.setInt(1, ID);

        ResultSet moviesRows = getMovieStatement.executeQuery();

        List<Movie> movies = new ArrayList<>();
        while (moviesRows.next())
            movies.add(new Movie(ID, moviesRows.getString(1), moviesRows.getDate(2),moviesRows.getString(3),moviesRows.getDouble(4)));
        moviesRows.close();
        getMovieStatement.close();

        return movies;
    }
}

