package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Code {
    private static Connection conn;
    private static final String DB_URL = "jdbc:mysql://199.34.17.167:3306/stock";
    private static final String USER_NAME = "dev";
    private static final String PASSWORD = "tuyen1998";

    public static void getConnection(String dbURL, String userName,
                                     String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("Connection successfully!");
        } catch (Exception ex) {
            System.out.println("Connection failure!");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getConnection(DB_URL, USER_NAME, PASSWORD);
    }
}
