package Interface;

import Models.TaiKhoan;

/**
 *
 * @author CanhDinh
 */
public class Run {

    public static frmMain QlCafe;
    public static frmLogIn frmlg;
    public static TaiKhoan tk;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        lg();
    }

    public static void lg() {
        frmlg = new frmLogIn();
        frmlg.setVisible(true);
    }

    public static void QLCF() {
        QlCafe = new frmMain();
        QlCafe.setVisible(true);
    }

}
