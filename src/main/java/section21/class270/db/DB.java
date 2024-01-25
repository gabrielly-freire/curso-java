package section21.class270.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection(){
        if(conn == null){
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty("dburl");
                conn = DriverManager.getConnection(url, properties);
            }catch (SQLException ex){
                throw new DbException(ex.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            }catch (SQLException ex){
                throw new DbException(ex.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("src/main/java/section21/db.properties")) {
            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (IOException ex) {
            throw new DbException(ex.getMessage());
        }
    }

    public static void closeStatement(Statement statement){
        if (statement != null){
            try {
                statement.close();
            }catch (SQLException ex){
                throw new DbException(ex.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());
            }
        }
    }

}
