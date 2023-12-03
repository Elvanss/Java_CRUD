package ls10.lab.model;

import java.math.BigDecimal;
import java.sql.Time;

public class Flight {
    private String _maCB;
    private String _gaDi;
    private String _gaDen;
    private int _doDai;
    private Time _gioDi;
    private Time _gioDen;
    private double _chiPhi;

    public Flight(String _maCB, String _gaDi, String _gaDen, int _doDai, Time _gioDi, Time _gioDen, double _chiPhi) {
        this._maCB = _maCB;
        this._gaDi = _gaDi;
        this._gaDen = _gaDen;
        this._doDai = _doDai;
        this._gioDi = _gioDi;
        this._gioDen = _gioDen;
        this._chiPhi = _chiPhi;
    }

    public String getMaCB() {
        return _maCB;
    }

    public void setMaCB(String _maCB) {
        this._maCB = _maCB;
    }

    public String getGaDi() {
        return _gaDi;
    }

    public void setGaDi(String _gaDi) {
        this._gaDi = _gaDi;
    }

    public String getGaDen() {
        return _gaDen;
    }

    public void setGaDen(String _gaDen) {
        this._gaDen = _gaDen;
    }

    public int getDoDai() {
        return _doDai;
    }

    public void setDoDai(int _doDai) {
        this._doDai = _doDai;
    }

    public Time getGioDi() {
        return _gioDi;
    }

    public void setGioDi(Time _gioDi) {
        this._gioDi = _gioDi;
    }

    public Time getGioDen() {
        return _gioDen;
    }

    public void setGioDen(Time _gioDen) {
        this._gioDen = _gioDen;
    }

    public double getChiPhi() {
        return _chiPhi;
    }

    public void setChiPhi(double _chiPhi) {
        this._chiPhi = _chiPhi;
    }

    public String toString() {
        return "Chuyến bay {" +
                "Mã Chuyến Bay='" + _maCB + '\'' +
                ", Ga đi='" + _gaDi + '\'' +
                ", Ga đến=" + _gaDen +
                ", Độ dài=" + _doDai +
                ", Giờ đi=" + _gioDi +
                ", Giờ đến=" + _gioDen +
                ", Chi phí=" + _chiPhi +
                '}';
    }
}
