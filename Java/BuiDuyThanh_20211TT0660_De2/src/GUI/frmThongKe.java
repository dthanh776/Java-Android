/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAL.DAL_ThongKe;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.*;

/**
 *
 * @author dthan
 */
public class frmThongKe extends javax.swing.JInternalFrame {

    private DAL_ThongKe dal_ThongKe = new DAL_ThongKe();

    /**
     * Creates new form frmThongKe
     */
    public frmThongKe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbbthongke = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thống kê");

        cbbthongke.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbthongke.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thông tin chi tiết của từng phiếu", "Số lượng và tổng tiền của dịch vụ sửa chuột", "Số lượng sử dụng của từng dịch vụ" }));
        cbbthongke.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbthongkeItemStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shutdown_24px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.setToolTipText("");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tblThongKe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblThongKe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(cbbthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnThoat)
                .addGap(98, 98, 98))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbthongkeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbthongkeItemStateChanged
        // TODO add your handling code here:
        int index = cbbthongke.getSelectedIndex();
        if (index == 0) {
            try {
                ResultSet rs = null;
                try {
                    rs = dal_ThongKe.chiTietPhieu();
                } catch (Exception ex) {
                    Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
                model.setColumnCount(0);
                model.addColumn("Số phiếu");
                model.addColumn("Mã dịch vụ");
                model.addColumn("Tên dịch vụ");
                model.addColumn("Số lượng");
                model.addColumn("Đơn giá");
                model.addColumn("Thành tiền");
                model.setRowCount(0);
                tblThongKe.setModel(model);
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (index == 1) {
            try {
                ResultSet rs = null;
                try {
                    rs = dal_ThongKe.chiTietChuot();
                } catch (Exception ex) {
                    Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
                model.setColumnCount(0);
                model.addColumn("Tên dịch vụ");
                model.addColumn("Tổng số lượng");
                model.addColumn("Đơn giá");
                model.addColumn("Thành tiền");
                model.setRowCount(0);
                tblThongKe.setModel(model);
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (index == 2) {
            try {
                ResultSet rs = null;
                try {
                    rs = dal_ThongKe.chiTietSoLuong();
                } catch (Exception ex) {
                    Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel model = (DefaultTableModel) tblThongKe.getModel();
                model.setColumnCount(0);
                model.addColumn("Tên dịch vụ");
                model.addColumn("Số lượng sử dụng");
                model.setRowCount(0);
                tblThongKe.setModel(model);
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString(3), rs.getString(4)});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cbbthongkeItemStateChanged

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbbthongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThongKe;
    // End of variables declaration//GEN-END:variables
}
