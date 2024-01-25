package section21.class270.application;

import section21.class270.db.DB;
import section21.class270.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from department");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+ ", " + resultSet.getString("name"));
            }
        } catch (SQLException ex){
            throw new DbException(ex.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
            DB.closeConnection();
        }
    }
}
