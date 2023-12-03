package ls10.lab.model;

public class Airplane {
    private int _maMB;
    private String _Loai;
    private int _tamBay;

    public Airplane () {}
    public Airplane(int maMB, String loai, int tamBay) {
        _maMB = maMB;
        _Loai = loai;
        _tamBay = tamBay;
    }

    public int getMaMB() {
        return _maMB;
    }

    public void setMaMB(int _MaMB) {
        this._maMB = _MaMB;
    }

    public String getLoai() {
        return _Loai;
    }

    public void setLoai(String _Loai) {
        this._Loai = _Loai;
    }

    public int getTamBay() {
        return _tamBay;
    }

    public void setTamBay(int _tamBay) {
        this._tamBay = _tamBay;
    }

    public String toString() {
        return "Danh sách máy bay:{" +
                "Mã máy bay='" + _maMB + '\'' +
                ", Loại máy bay='" + _Loai + '\'' +
                ", Tầm bay='" + _tamBay + '\'' +
                '}';
    }
}
