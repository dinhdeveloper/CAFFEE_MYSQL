package Interface.ThongKe;

import java.util.Date;

/**
 *
 * @author Dinh
 */
public class ThongKeReport {
private int mahoadon,giamgia,maban,tongtien,tienmon;
    private String tenmon,nguoiban;
    Date gioden;

    public ThongKeReport() {
    }

    public ThongKeReport(int mahoadon, int giamgia, int maban, int tongtien, int tienmon, String tenmon, String nguoiban, Date gioden) {
        this.mahoadon = mahoadon;
        this.giamgia = giamgia;
        this.maban = maban;
        this.tongtien = tongtien;
        this.tienmon = tienmon;
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

    public int getTienmon() {
        return tienmon;
    }

    public void setTienmon(int tienmon) {
        this.tienmon = tienmon;
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
