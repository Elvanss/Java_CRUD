package ls10.lab.dao.impl;

import ls10.lab.dao.impl.Interface.Dao;
import ls10.lab.util.DBConnection;
import ls10.lab.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao implements Dao<Employee> {
    public EmployeeDao() {}

    @Override
    public int insert(Employee employee) {
        String sql = "INSERT INTO employee(maNV, Ten, Luong) VALUES (?, ?, ?)";
        int rowCount = 0;


        try (
                //1&2 Regis driver class & get connection
                Connection connection = DBConnection.getConnection();
                // 3. create statement
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, employee.getMaNV());
            preparedStatement.setString(2, employee.getTen());
            preparedStatement.setDouble(3, employee.getLuong());

            // 4 execute query
            rowCount = preparedStatement.executeUpdate(); // INSERT/ UPDATE/ DELETE
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return rowCount;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM EMPLOYEE";

        try (
             Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Employee employee = new Employee(
                        resultSet.getString("MaNV"),
                        resultSet.getString("Ten"),
                        resultSet.getInt("Luong")
                );
                employees.add(employee);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return employees;
    }

}
