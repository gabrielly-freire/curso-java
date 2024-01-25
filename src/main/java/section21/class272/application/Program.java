package section21.class272.application;

import section21.class270.db.DbException;
import section21.class272.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? " +
                    "WHERE (DepartmentId = ?)");

            preparedStatement.setDouble(1, 200.0);
            preparedStatement.setInt(2, 2);

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
