package entity;

import java.util.Date;

/**
 *
 * @author Dinh
 */
public class ThongKe {
    private int MaCTHD,SoLuong,MaBan,TongTien;
    String NguoiBan,TenMon,DVT;
    Date GioDen;

    public ThongKe() {
    }

    public ThongKe(int MaCTHD, int SoLuong, int MaBan, int TongTien, String NguoiBan, String TenMon, String DVT, Date GioDen) {
        this.MaCTHD = MaCTHD;
        this.SoLuong = SoLuong;
        this.MaBan = MaBan;
        this.TongTien = TongTien;
        this.NguoiBan = NguoiBan;
        this.TenMon = TenMon;
        this.DVT = DVT;
        this.GioDen = GioDen;
    }

    public int getMaCTHD() {
        return MaCTHD;
    }

    public void setMaCTHD(int MaCTHD) {
        this.MaCTHD = MaCTHD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getNguoiBan() {
        return NguoiBan;
    }

    public void setNguoiBan(String NguoiBan) {
        this.NguoiBan = NguoiBan;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public Date getGioDen() {
        return GioDen;
    }

    public void setGioDen(Date GioDen) {
        this.GioDen = GioDen;
    }
    
    
}
