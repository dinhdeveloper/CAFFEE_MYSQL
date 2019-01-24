package Interface.BanHang;

import java.util.Date;

/**
 *
 * @author Dinh
 */
public class Field {
    private int mahoadon,giamgia,maban,tongtien,soluong,macthd,matk;
    private String tenmon,nguoiban;
    Date gioden;

    public Field() {
    }

    public Field(int mahoadon, int giamgia, int maban, int tongtien, int soluong, int macthd, int matk, String tenmon, String nguoiban, Date gioden) {
        this.mahoadon = mahoadon;
        this.giamgia = giamgia;
        this.maban = maban;
        this.tongtien = tongtien;
        this.soluong = soluong;
        this.macthd = macthd;
        this.matk = matk;
        this.tenmon = tenmon;
        this.nguoiban = nguoiban;
        this.gioden = gioden;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(int giamgia) {
        this.giamgia = giamgia;
    }

    public int getMaban() {
        return maban;
    }

    public void setMaban(int maban) {
        this.maban = maban;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getMacthd() {
        return macthd;
    }

    public void setMacthd(int macthd) {
        this.macthd = macthd;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getNguoiban() {
        return nguoiban;
    }

    public void setNguoiban(String nguoiban) {
        this.nguoiban = nguoiban;
    }

    public Date getGioden() {
        return gioden;
    }

    public void setGioden(Date gioden) {
        this.gioden = gioden;
    }
    
}
