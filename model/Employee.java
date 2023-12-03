package ls10.lab.model;

public class Employee {
    private String _maNV;
    private String _ten;
    private int _luong;

    public Employee(String _maNV, String _ten, int _luong) {
        this._maNV = _maNV;
        this._ten = _ten;
        this._luong = _luong;
    }

    public String getMaNV() {
        return _maNV;
    }

    public void setMaNV(String _maNV) {
        this._maNV = _maNV;
    }

    public String getTen() {
        return _ten;
    }

    public void setTen(String _ten) {
        this._ten = _ten;
    }

    public int getLuong() {
        return _luong;
    }

    public void setLuong(int _luong) {
        this._luong = _luong;
    }

    public String toString() {
        return "Danh sách nhân viên :{" +
                "Mã Nhân Viên='" + _maNV + '\'' +
                ", Tên Nhân Viên='" + _ten + '\'' +
                ", Lương='" + _luong + '\'' +
                '}';
    }
}
