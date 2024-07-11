/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.PhongHoc;
import Service.PhongHocService;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRAN THAI SON
 */
public class PhongHocView extends javax.swing.JFrame {

    PhongHocService phs = new PhongHocService();
    DefaultTableModel model = new DefaultTableModel();
    public ArrayList<PhongHoc> lstPH = phs.getAllPhongHoc();
    int index;

    public PhongHocView() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblPhongHoc.getModel();
        fillToTable();
        if (tblPhongHoc.getRowCount() > 0) {
            index = 0;
            showDeTail();
        }
    }

    private void fillToTable() throws SQLException {
        lstPH = phs.getAllPhongHoc();
        model.setRowCount(0);
        for (PhongHoc ph : lstPH) {
            model.addRow(new Object[]{
                ph.getMaPhong(),
                ph.getTenPhong(),
                ph.getTang(),
                ph.getSoSV(),
                ph.isTrangThai() ? "1" : "0"
            });
        }
    }

    private void showDeTail() {
        PhongHoc ph = lstPH.get(index);
        txtMaPhong.setText(ph.getMaPhong());
        txtTenPhong.setText(ph.getTenPhong());
        txtTang.setText(ph.getTang() + "");
        txtSoSV.setText(ph.getSoSV() + "");
        //cboTrangThai.setSelectedItem(ph.isTrangThai() ? "Bận" : "Không Bận");
        cboTrangThai.setSelectedIndex(ph.isTrangThai()? 0 : 1);
        tblPhongHoc.setRowSelectionInterval(index, index);
    }

    private void clearForm() {
        txtMaPhong.setText("");
        txtTenPhong.setText("");
        txtTang.setText("");
        txtSoSV.setText("");
    }

    private PhongHoc getPhongHocFromInput() {
        PhongHoc ph = new PhongHoc();
        ph.setMaPhong(txtMaPhong.getText());
        ph.setTenPhong(txtTenPhong.getText());
        ph.setTang(Integer.parseInt(txtTang.getText()));
        ph.setSoSV(Integer.parseInt(txtSoSV.getText()));
        ph.setTrangThai(cboTrangThai.getSelectedIndex() == 0 ? true : false);
        return ph;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoSV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        txtTenPhong = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhongHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("QUẢN LÝ PHÒNG HỌC");

        jLabel2.setText("Mã Phòng");

        jLabel3.setText("Tên Phòng");

        jLabel5.setText("Tầng");

        jLabel6.setText("Số SV");

        jLabel7.setText("Trạng Thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bận", "Không Bận" }));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblPhongHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Tầng", "Số SV", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhongHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhongHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaPhong)
                                    .addComponent(txtTenPhong)
                                    .addComponent(txtTang)
                                    .addComponent(txtSoSV)
                                    .addComponent(cboTrangThai, 0, 190, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear)
                                    .addComponent(btnThem)
                                    .addComponent(btnSua)
                                    .addComponent(btnXoa)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnSua, btnThem, btnXoa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnSua, btnThem, btnXoa});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (txtMaPhong.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Mã phòng không được để trống");
            txtMaPhong.requestFocus();
            return;
        }
        if (txtTenPhong.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tên phòng không được để trống");
            txtTenPhong.requestFocus();
            return;
        }
        if (txtTang.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tầng không được để trống");
            txtTang.requestFocus();
            return;
        }
        if (txtSoSV.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Số sinh viên không được để trống");
            txtSoSV.requestFocus();
            return;
        }

        try {
            int soSV = Integer.parseInt(txtSoSV.getText());
            if (soSV < 0) {
                JOptionPane.showMessageDialog(this, "Số Sinh Viên phải lớn hơn 0");
                txtSoSV.requestFocus();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số Sinh Viên phải là số");
            txtSoSV.requestFocus();
            return;
        }

        try {
            int tang = Integer.parseInt(txtTang.getText());
            if (tang < 1 || 10 < tang) {
                JOptionPane.showMessageDialog(this, "Tầng từ 1- 10");
                txtTang.requestFocus();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tầng phải là số");
            txtSoSV.requestFocus();
            return;
        }

        PhongHoc ph = getPhongHocFromInput();
        try {
            if (phs.addPhongHoc(ph) != null) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
            fillToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblPhongHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongHocMouseClicked
        index = tblPhongHoc.getSelectedRow();
        showDeTail();
    }//GEN-LAST:event_tblPhongHocMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (hoi != JOptionPane.YES_OPTION) {
            return;
        }
        String Ma = txtMaPhong.getText();
        try {
            if (phs.deletePhongHoc(Ma) != null) {
                JOptionPane.showMessageDialog(this, "Xóa Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa Thất Bại");
            }
            fillToTable();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (txtMaPhong.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Mã phòng không được để trống");
            txtMaPhong.requestFocus();
            return;
        }
        if (txtTenPhong.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tên phòng không được để trống");
            txtTenPhong.requestFocus();
            return;
        }
        if (txtTang.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Tầng không được để trống");
            txtTang.requestFocus();
            return;
        }
        if (txtSoSV.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Số sinh viên không được để trống");
            txtSoSV.requestFocus();
            return;
        }

        try {
            int soSV = Integer.parseInt(txtSoSV.getText());
            if (soSV < 0) {
                JOptionPane.showMessageDialog(this, "Số Sinh Viên phải lớn hơn 0");
                txtSoSV.requestFocus();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số Sinh Viên phải là số");
            txtSoSV.requestFocus();
            return;
        }

        try {
            int tang = Integer.parseInt(txtTang.getText());
            if (tang < 1 || 10 < tang) {
                JOptionPane.showMessageDialog(this, "Tầng từ 1- 10");
                txtTang.requestFocus();
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tầng phải là số");
            txtSoSV.requestFocus();
            return;
        }

        PhongHoc ph = getPhongHocFromInput();
        try {
            if (phs.updatePhongHoc(ph) != null) {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
            fillToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhongHocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhongHocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhongHocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhongHocView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PhongHocView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PhongHocView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhongHoc;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtSoSV;
    private javax.swing.JTextField txtTang;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables

}
