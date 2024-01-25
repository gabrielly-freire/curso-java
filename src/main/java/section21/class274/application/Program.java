package section21.class274.application;

import section21.class270.db.DbException;
import section21.class274.db.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DB.getConnection();

            connection.setAutoCommit(false);

            statement = connection.createStatement();
            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//            if (true){
//                throw new SQLException("Fake error");
//            }

            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("Done! rows affected: " + rows1);
            System.out.println("Done! rows affected: " + rows2);
        }catch (SQLException ex){
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + ex.getMessage());
            }catch (SQLException e){
                throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
            }
        }finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
