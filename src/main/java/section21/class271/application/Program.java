package section21.class271.application;

import section21.class271.db.DB;
import section21.class271.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();
            // inserindo e recuperando o id (uso da sobrecarga)
            preparedStatement = connection.prepareStatement("INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentID) VALUES"
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, "Maria");
            preparedStatement.setString(2, "maria@email.com");
            preparedStatement.setDate(3, new java.sql.Date(simpleDateFormat.parse("10/01/2000").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 1);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    System.out.println("Done! id = " + id);
                }
            }else {
                System.out.println("No rows affected!");
            }
        } catch (SQLException ex){
            throw new DbException(ex.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
