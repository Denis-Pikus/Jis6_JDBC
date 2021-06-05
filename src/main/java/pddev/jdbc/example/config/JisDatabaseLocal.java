package pddev.jdbc.example.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JisDatabaseLocal {

    public static Connection getConnection(){
        Properties properties = new Properties();
        Connection conn = null;
        try (InputStream in = new FileInputStream("src/main/resources/jis6.properties")){
            properties.load(in);
            Class.forName(properties.getProperty("DRIVER"));
            conn = DriverManager.getConnection(properties.getProperty("URL"),
                    properties.getProperty("USER"), properties.getProperty("PASSWORD"));
        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static Properties getProperties() {
        try(InputStream in = new FileInputStream("src/main/resources/jis6.properties")){
            Properties properties = new Properties();
            properties.load(in);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
