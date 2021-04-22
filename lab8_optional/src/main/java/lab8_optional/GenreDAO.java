package lab8_optional;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO {
    public static void create(int ID, String name) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement genreInsertionStatement = cinema.getStatement("INSERT INTO GENRE(ID, name) VALUES(?, ?)");
        genreInsertionStatement.setInt(1, ID);
        genreInsertionStatement.setString(2, name);
        genreInsertionStatement.execute();
        genreInsertionStatement.close();
    }

    public static List<Genre> findByName(String name) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement getGenreStatement = cinema.getStatement("SELECT ID  FROM GENRE WHERE name = ?");
        getGenreStatement.setString(1, name);

        ResultSet genreRows = getGenreStatement.executeQuery();

        List<Genre> genre = new ArrayList<>();
        while (genreRows.next())
            genre.add(new Genre(genreRows.getInt(1), name));
        genreRows.close();
        getGenreStatement.close();

        return genre;
    }

    public static List<Genre> findByID(int ID) throws SQLException {
        Cinematography cinema = Cinematography.getInstance();
        PreparedStatement getGenreStatement =cinema.getStatement("SELECT name FROM GENRE WHERE ID = ?");
        getGenreStatement.setInt(1, ID);

        ResultSet genreRows = getGenreStatement.executeQuery();

        List<Genre> genre = new ArrayList<>();
        while (genreRows.next())
            genre.add(new Genre(ID, genreRows.getString(1)));
        genreRows.close();
        getGenreStatement.close();

        return genre;
    }
}
