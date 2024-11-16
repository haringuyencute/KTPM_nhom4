/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.PhieuNhap;
import controller.Mycontroller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.List;

/**
 *
 * @author phamt
 */
public class QLPN_Sua extends javax.swing.JFrame {

     private static Mycontroller controller = new Mycontroller();
    private static List<PhieuNhap> list = controller.readDataFromFile("src/file/pnhap.txt");
    private static int index;
    
    public QLPN_Sua() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaNhap = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        txtSoLuongNhap = new javax.swing.JTextField();
        txtGiaNhap = new javax.swing.JTextField();
        txtTenNCC = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        btnSuaPhieu = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SỬA PHIẾU NHẬP");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Số lượng nhập:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên nhân viên: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Giá nhập:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tên nhà cung cấp:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mã nhập:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Ngày nhập:");

        txtMaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhapActionPerformed(evt);
            }
        });

        txtSoLuongNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongNhapActionPerformed(evt);
            }
        });

        btnSuaPhieu.setBackground(new java.awt.Color(102, 255, 102));
        btnSuaPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSuaPhieu.setText("SỬA");
        btnSuaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhieuActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(102, 255, 102));
        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReturn.setText("QUAY LẠI TRANG CHỦ");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuongNhap))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenNV))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(304, 304, 304))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(btnReturn)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhapActionPerformed

    private void txtSoLuongNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongNhapActionPerformed

    private void btnSuaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhieuActionPerformed
        // TODO add your handling code here:

        String ma = txtMaNhap.getText();
        String ngayString = txtNgayNhap.getText();
        String soluong = txtSoLuongNhap.getText();
        String gia = txtGiaNhap.getText();
        String tenncc = txtTenNCC.getText();
        String tennv = txtTenNV.getText();

        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       /*Date ngay = null;
        try {
            ngay = dateFormat.parse(ngayString);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        PhieuNhap pn = new PhieuNhap(ma, ngayString, soluong, gia, tenncc, tennv);
        try {
            if (ma.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Không được để trống mã nhập", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong mã nhập");
            } else if (ngayString.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Không được để trống ngày nhập", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong ngày nhập");
            } else if (soluong.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống giá nhập", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi trong số lượng nhập");
            } else if (gia.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không được để trống số lượng nhập", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi trong giá nhập");
            } else if (tenncc.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Không được để trống tên nhà cung cấp", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong tên nhà cung cấp");
            } else if (tennv.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Không được để trống tên nhân viên", "Lỗi", JOptionPane.OK_OPTION);
                throw new Exception("Loi trong tên nhân viên");
            } else {
                list.set(index, pn);
                controller.writeToFile(list, "src/file/pnhap.txt");
                new QuanLyPhieuNhap().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaPhieuActionPerformed

    public void displayDetails(int position, String ma,String ngayString, String soluong, String gia, String tenncc, String tennv){
        txtMaNhap.setText(ma);
        txtNgayNhap.setText(ngayString);
        txtSoLuongNhap.setText(soluong);
        txtGiaNhap.setText(gia);
        txtTenNCC.setText(tenncc);
        txtTenNV.setText(tennv);
        index = position;
    }
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
         new QuanLyPhieuNhap().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(QLPN_Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPN_Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPN_Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPN_Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPN_Sua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSuaPhieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMaNhap;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSoLuongNhap;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}