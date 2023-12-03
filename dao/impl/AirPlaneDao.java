package ls10.lab.dao.impl;

import ls10.lab.dao.impl.Interface.Dao;
import ls10.lab.model.Airplane;
import ls10.lab.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AirPlaneDao implements Dao<Airplane> {

    public AirPlaneDao() {
    }

    //Do it later
    @Override
    public int insert(Airplane data) {
        return 0;
    }
    @Override
    public List<Airplane> getAll() {
        List<Airplane> mayBays = new ArrayList<>();
        String sql = "SELECT * FROM maybay";

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Airplane mayBay = new Airplane(
                        resultSet.getInt("MaMB"),
                        resultSet.getString("Loai"),
                        resultSet.getInt("TamBay")
                );
                mayBays.add(mayBay);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mayBays;
    }
}

