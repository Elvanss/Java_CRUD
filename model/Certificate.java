package ls10.lab.model;

public class Certificate {
    private String _maNV;
    private String _maMB;

    public Certificate(String _maNV, String _maMB) {
        this._maNV = _maNV;
        this._maMB = _maMB;
    }

    public String getmaNV() {
        return _maNV;
    }

    public void setmaNV(String _maNV) {
        this._maNV = _maNV;
    }

    public String getMaMB() {
        return _maMB;
    }

    public void setMaMB(String _maMB) {
        this._maMB = _maMB;
    }

    public String toString() {
        return "Chứng nhận {" +
                "Mã nhân viên='" + _maNV + '\'' +
                ", Mã máy bay='" + _maMB + '\'' +
                '}';
    }
}
