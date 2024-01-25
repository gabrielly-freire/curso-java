package section21.class273.application;

import section21.class270.db.DbException;
import section21.class273.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("DELETE FROM department WHERE Id = ?");

            preparedStatement.setInt(1, 5);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! rows affected: " + rowsAffected);
        }catch (SQLException ex){
            throw new DbException(ex.getMessage());
        }finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
