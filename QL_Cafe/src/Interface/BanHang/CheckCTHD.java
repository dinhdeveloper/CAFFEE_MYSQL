/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BanHang;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dinh
 */
public class CheckCTHD extends javax.swing.JPanel {

    /**
     * Creates new form CheckCTHD
     */
    public CheckCTHD() {
        initComponents();
    }

    DefaultTableModel model = new DefaultTableModel();
    private Collection data(){
        ArrayList<Field> arr = new ArrayList<>();
        for(int i=0;i<model.getRowCount();i++){
            
        }
        return arr;
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
