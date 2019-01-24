/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ThongKe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dinh
 */
public class thongkeRepor extends javax.swing.JPanel {

    /**
     * Creates new form thongkeRepor
     */
    public thongkeRepor() {
        initComponents();
        ShowReport();
    }
    
    private void ShowReport(){
        JpThongKe jtk = new JpThongKe();
        try {
            String sourceName = "C:\\JAVA\\CAFFEE_MYSQL\\QL_Cafe\\src\\Interface\\ThongKe\\bill.jrxml";
            JasperReport report = JasperCompileManager.compileReport(sourceName);
            HashMap para = new HashMap();
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(jtk.data());
            JasperPrint fillReport = JasperFillManager.fillReport(report, para, jcd);
            JasperViewer.viewReport(fillReport,false);
        } catch (JRException ex) {
            Logger.getLogger(thongkeRepor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
