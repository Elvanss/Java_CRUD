package ls10.lab.dao.impl;

import ls10.lab.dao.impl.Interface.Dao;
import ls10.lab.model.Certificate;
import ls10.lab.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CertificateDao implements Dao<Certificate> {

    @Override
    public int insert(Certificate data) {
        return 0;
    }

    @Override
    public List<Certificate> getAll() {
        List<Certificate> certifications = new ArrayList<>();
        String sql = "SELECT * FROM CERTIFICATE";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Certificate certification = new Certificate(
                        rs.getString("MaNV"),
                        rs.getString("MaMB")
                );
                certifications.add(certification);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return certifications;
    }

}
