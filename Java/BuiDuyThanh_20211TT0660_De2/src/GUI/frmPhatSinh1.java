/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import BLL.BLL_PhatSinh;
import DAL.DAL_PhatSinh;
import BLL.BLL_KhacHang;
import ET.ET_PhatSinh;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author dthan
 */
public class frmPhatSinh1 extends javax.swing.JInternalFrame {

    private BLL_PhatSinh bll_phatSinh = new BLL_PhatSinh();
    private BLL_KhacHang bll_khachHang = new BLL_KhacHang();

    /**
     * Creates new form frmPhatSinh1
     */
    public frmPhatSinh1() throws Exception {
        initComponents();
        initComponents();
        hienThi();
        hienThiPhatSinh();
        comboboxMaKhachHang();
        java.util.Date date = new java.util.Date();
        dtpNgayLap.setDate(date);

        AutoCompleteDecorator.decorate(cbbMaKhachHang);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThoat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dtpNgayLap = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbbMaKhachHang = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhatSinh = new javax.swing.JTable();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtSoPhieu = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shutdown_24px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.setToolTipText("");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Số phiếu");

        dtpNgayLap.setDateFormatString("dd/MM/yyyy");
        dtpNgayLap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ngày lập");

        cbbMaKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHÁT SINH");

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

        tblPhatSinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPhatSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số phiếu", "Ngày lập", "Mã khách hàng"
            }
        ));
        tblPhatSinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhatSinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhatSinh);

        btnMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh_24px.png"))); // NOI18N
        btnMoi.setText("MỚI");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_24px.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_24px.png"))); // NOI18N
        btnXoa.setText("XOÁ");
        btnXoa.setToolTipText("");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtSoPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_24px.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.setToolTipText("");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mã khách hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMoi)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(48, 48, 48)
                                .addComponent(btnXoa)
                                .addGap(45, 45, 45)
                                .addComponent(btnSua)
                                .addGap(39, 39, 39)
                                .addComponent(btnThoat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(dtpNgayLap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(dtpNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMoi)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThoat))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblPhatSinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhatSinhMouseClicked
        int row = tblPhatSinh.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPhatSinh.getModel();
        txtSoPhieu.setText(model.getValueAt(row, 0).toString());
        String date = model.getValueAt(row, 1).toString();
        try {
            dtpNgayLap.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(frmKhachHang1.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbbMaKhachHang.setSelectedItem(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblPhatSinhMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        try {
            reset();
        } catch (Exception ex) {
            Logger.getLogger(frmPhatSinh1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        java.sql.Date sqlDate = new java.sql.Date(dtpNgayLap.getDate().getTime());

        ET_PhatSinh et_PhatSinh = new ET_PhatSinh(txtSoPhieu.getText(), sqlDate, cbbMaKhachHang.getSelectedItem().toString());
        if (txtSoPhieu.getText().compareTo("") == 0 || cbbMaKhachHang.getSelectedItem().toString() == "") {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            try {
                if (bll_phatSinh.checkTonTaiPhatSinh(txtSoPhieu.getText())) {
                    JOptionPane.showMessageDialog(null, "Đã tồn tại số phiếu này");
                    reset();
                } else {
                    et_PhatSinh = new ET_PhatSinh(txtSoPhieu.getText(), sqlDate, cbbMaKhachHang.getSelectedItem().toString());
                    if (bll_phatSinh.themPhatSinh(et_PhatSinh)) {
                        JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
                        reset();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                        reset();
                        hienThi();
                        hienThiPhatSinh();
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        java.sql.Date sqlDate = new java.sql.Date(dtpNgayLap.getDate().getTime());
        ET_PhatSinh et_PhatSinh = new ET_PhatSinh(txtSoPhieu.getText(), sqlDate, cbbMaKhachHang.getSelectedItem().toString());

        int row = tblPhatSinh.getSelectedRow();
        if (row >= 0) {
            try {
                if (bll_phatSinh.xoaPhatSinh(et_PhatSinh)) {
                    JOptionPane.showMessageDialog(rootPane, "Xoá không thành công");

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                    try {
                        hienThiPhatSinh();
                        reset();
                    } catch (Exception ex) {
                        Logger.getLogger(frmDichVu1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phát sinh");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        java.sql.Date sqlDate = new java.sql.Date(dtpNgayLap.getDate().getTime());
        ET_PhatSinh et_PhatSinh = new ET_PhatSinh(txtSoPhieu.getText(), sqlDate, cbbMaKhachHang.getSelectedItem().toString());

        if (txtSoPhieu.getText() == "") {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            try {
                bll_phatSinh.suaPhatSinh(et_PhatSinh);
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
                try {
                    hienThiPhatSinh();
                    reset();
                } catch (Exception ex) {
                    Logger.getLogger(frmDichVu1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "Sửa không thành công");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    private void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tblPhatSinh.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Số phiếu");
        model.addColumn("Ngày lập");
        model.addColumn("Mã khách hàng");
        tblPhatSinh.setModel(model);
    }

    // hiển thị danh mục lên table
    private void hienThiPhatSinh() throws Exception {
        DefaultTableModel model = (DefaultTableModel) tblPhatSinh.getModel();
        model.setRowCount(0);
        ResultSet rs = bll_phatSinh.hienThiPhatSinh();
        while (rs.next()) {
            Object[] col = new Object[3];
            for (int i = 1; i <= 3; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        tblPhatSinh.setModel(model);
    }

    public void comboboxMaKhachHang() throws Exception {
        cbbMaKhachHang.removeAllItems();
        ResultSet rs = bll_khachHang.hienThiKhachHang();
        while (rs.next()) {
            cbbMaKhachHang.addItem(rs.getString("MaKH"));
        }
    }

    public void reset() throws Exception {
        txtSoPhieu.setText("");
        dtpNgayLap.setDate(new Date());
        cbbMaKhachHang.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbMaKhachHang;
    private com.toedter.calendar.JDateChooser dtpNgayLap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhatSinh;
    private javax.swing.JTextField txtSoPhieu;
    // End of variables declaration//GEN-END:variables
}
