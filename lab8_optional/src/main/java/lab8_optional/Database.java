package lab8_optional;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

public class Database {
    private Database(String server, String schema, String username, String password, Connection connection) {
        this.server = server;
        this.schema = schema;
        this.username = username;
        this.password = password;
        this.connection = connection;

        Database.databaseList.add(this);
    }

    private String server;
    public String getServer() { return this.server; }

    private String schema;
    public String getSchema() { return this.schema; }

    private String username;
    public String getUsername() { return this.username; }

    private String password;
    public String getPassword() { return this.password; }

    private static Connection connection;

    private static List<Database> databaseList = new ArrayList<>();

    public Connection initializeConnection() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.username);
        connectionProps.put("password", this.password);

        conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT2","STUDENT2");


        //System.out.println("Connected to database");
        return conn;
    }

    public void deinitializeConnection() throws SQLException {
        this.connection.close();
    }

    public PreparedStatement getStatement(String query) throws SQLException {
        return this.connection.prepareStatement(query);
    }

    public Statement getStatement() throws SQLException {
        connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT2","STUDENT2");
        return this.connection.createStatement();
    }

    public void setAutoCommit(boolean autoCommitValue) throws SQLException {
        if (connection==null)
            return;
        this.connection.setAutoCommit(autoCommitValue);
    }

    public static Database getDatabase(String server, String schema, String username, String password) {
        Database.databaseList.removeIf(Objects::isNull);
        for (var database: Database.databaseList)
            if (database.server.equals(server) && database.schema.equals(schema) && database.username.equals(username) && database.password.equals(password))
                return database;
        return new Database(server, schema, username, password, connection);
    }

    public static Database getDatabase(String server, String username, String password) {
        return Database.getDatabase(server, null, username, password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Database)) return false;
        Database database = (Database) o;
        return server.equals(database.server) &&
                Objects.equals(schema, database.schema) &&
                username.equals(database.username) &&
                password.equals(database.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, schema, username, password);
    }
}



