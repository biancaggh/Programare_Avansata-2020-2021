package lab8_optional;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Cinematography {
    private Cinematography(Database database) {
        this.database = database;
        Cinematography.singletonInstance = this;
    }

    private Database database;

    private static Cinematography singletonInstance;

    public void initializeDatabase() throws SQLException {
        this.database.initializeConnection();

        this.database.setAutoCommit(false);

        Statement databaseInitializationStatement = this.database.getStatement();
        for (var databaseInitializationQueryPart: Cinematography.databaseInitializationQueryParts)
            databaseInitializationStatement.addBatch(databaseInitializationQueryPart);
        databaseInitializationStatement.executeBatch();
        databaseInitializationStatement.close();

        this.database.setAutoCommit(true);
    }

    public void initializeConnection() throws SQLException {
        this.database.initializeConnection();

        PreparedStatement useSchemaStatement = (PreparedStatement) this.database.getStatement(Cinematography.useSchemaQuery);
        useSchemaStatement.execute();
        useSchemaStatement.close();
    }

    public void deinitializeConnection() throws SQLException {
        this.database.deinitializeConnection();
    }

    public PreparedStatement getStatement(String query) throws SQLException {
        return this.database.getStatement(query);
    }

    public Statement getStatement() throws SQLException {
        return this.database.getStatement();
    }

    public void setAutoCommit(boolean autoCommitValue) throws SQLException {
        this.database.setAutoCommit(autoCommitValue);
    }

    public static Cinematography getInstance(String dbServer, String dbUsername, String dbPassword) {
        if (Cinematography.singletonInstance == null) {
            Database database = Database.getDatabase(dbServer, dbUsername, dbPassword);
            Cinematography.singletonInstance = new Cinematography(database);
        }
        return Cinematography.singletonInstance;
    }

    public static Cinematography getInstance() {
        return Cinematography.singletonInstance;
    }

    private static String[] databaseInitializationQueryParts = {
            "DROP SCHEMA IF EXISTS Movies",
            "CREATE SCHEMA Movies",
            "USE Movies",

            "drop table if exists MOVIE",
            "create table MOVIE("+
            "ID             NUMBER        not null constraint MOVIE_PK primary key,"+
            "Title        VARCHAR2(128) not null,"+
            "Release_date DATE          not null,"+
            "Duration     NUMBER        not null,"+
            "Score        DECIMAL        not null"+
             ")",
            "DROP TABLE IF EXISTS GENRE",
            "CREATE TABLE GENRE(" +
                    "ID 			INT			NOT NULL PRIMARY KEY AUTO_INCREMENT," +
                    "Name 			VARCHAR(128) 	NOT NULL," +
                    ")",

            "DROP TABLE IF EXISTS Cinemateca",
            "CREATE TABLE Cinemateca(" +
                    "Movies_ID 	INT     NOT NULL ," +
                    "Genre_ID 	INT 	NOT NULL," +
                    ")",
            "DROP TABLE IF EXISTS ACTORS",
            "create table ACTORS("+
            "NAME        VARCHAR2(128) not null,"+
            "LAST_NAME   VARCHAR2(128) not null,"+
            "AGE         NUMBER,"+
            "NATIONALITY VARCHAR2(128),"+
            "MOVIE_ID    NUMBER"+
            ")"
    };

    private static String useSchemaQuery = "USE MusicAlbums";
}
