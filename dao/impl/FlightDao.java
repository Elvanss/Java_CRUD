package ls10.lab.dao.impl;

import ls10.lab.dao.impl.Interface.Dao;
import ls10.lab.util.DBConnection;
import ls10.lab.model.Flight;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightDao implements Dao<Flight> {

    public FlightDao() {}

    @Override
    public int insert(Flight flight) {
        String sql = "INSERT INTO FLIGHT(_maCB, _gaDi, _gaDen, _doDai, _gioDi, _gioDen, _chiPhi, _maMB) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        int rowCount = 0;

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            preparedStatement.setString(1, flight.getMaCB());
            preparedStatement.setString(2, flight.getGaDi());
            preparedStatement.setString(3, flight.getGaDen());
            preparedStatement.setInt(4, flight.getDoDai());
            preparedStatement.setTime(5, flight.getGioDi());
            preparedStatement.setTime(6, flight.getGioDen());
            preparedStatement.setDouble(7, flight.getChiPhi());

            rowCount = preparedStatement.executeUpdate(); // INSERT/ UPDATE/ DELETE
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowCount;
    }

    @Override
    public List<Flight> getAll() {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM FLIGHT";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Flight flight = new Flight(
                        resultSet.getString("MaCB"),
                        resultSet.getString("GaDi"),
                        resultSet.getString("GaDen"),
                        resultSet.getInt("DoDai"),
                        resultSet.getTime("gioDi"),
                        resultSet.getTime("gioDen"),
                        resultSet.getDouble("ChiPhi")
                );
                flights.add(flight);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return flights;
    }

}
