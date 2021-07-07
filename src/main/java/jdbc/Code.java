package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Code {
    private static Connection conn;
    private static final String DB_URL = "jdbc:mysql://35.240.198.195:33306/t4edu";
    private static final String USER_NAME = "t4edu";
    private static final String PASSWORD = "t4edu@2021";

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
