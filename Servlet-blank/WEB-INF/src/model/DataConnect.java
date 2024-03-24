package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    private static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=QUANDEPTRAI";
    private static final String USER = "quandeptrai";
    private static final String PASS = "quandeptrai";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
