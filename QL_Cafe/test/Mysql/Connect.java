package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dinh
 */
public class Connect {
private Connection cn;


public static Connection mySqlConnectt() throws ClassNotFoundException, SQLException {

        String hostName = "localhost:3306/";
        String dbName = "quanlycaffee";
        String userName = "root";
        String password = "";

        Class.forName("com.mysql.jdbc.Driver");
        //jdbc:mysql://localhost:3306/simplehr
        String connectionUrl = "jdbc:mysql://" + hostName + dbName;
        Connection conn = DriverManager.getConnection(connectionUrl + "?useSSL=false", userName, password);

        return conn;
    }

//    public  Connect() {
//        try {
//            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlycaffee?useUnicode=true&characterEncoding=utf8", "root", "");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Kết nối thất bại !");
//        }
//    }
//    public List<CTHD> checkCTHD(){
//        List<CTHD> listProduct = new ArrayList();
//        String sql = "SELECT * from chitiethd";
//        int machitiet = 0;
//        int mahd = 0;
//        int mamons = 0;
//        int sl = 0;
//        int gias = 0;
//        
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                CTHD ct = new CTHD();
//                int macthd = rs.getInt(1);
//                int mahoadon = rs.getInt(2);
//                int mamon = rs.getInt(3);
//                int soluong = rs.getInt(4);
//                int gia = rs.getInt(5);
//                ct.setMaCTHD(macthd);
//                ct.setMaHoaDon(mahoadon);
//                ct.setMaMon(mamon);
//                ct.setSoLuong(soluong);
//                ct.setGia(gia);
//                machitiet = macthd;
//                mahd = mahoadon;
//                mamons = mamon;
//                sl = soluong;
//                gias = gia;
//                listProduct.add(new CTHD(machitiet, mahd, mamons, sl, gias));
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đăng nhập !");
//        }
//        return listProduct;
//    }
}
