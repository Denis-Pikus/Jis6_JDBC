package pddev.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static pddev.jdbc.example.config.JisDatabaseLocal.*;
public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
        Connection connection = getConnection();
    }
}
