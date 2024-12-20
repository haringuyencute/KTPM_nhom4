/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author NGUYEN MINH
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
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

        btnQuanLyHangHoa = new javax.swing.JButton();
        btnQuanLyViTri = new javax.swing.JButton();
        btnQuanLyPhieuNhap = new javax.swing.JButton();
        btnQuanLyPhieuXuat = new javax.swing.JButton();
        btnQuanLyNhanVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQuanLyHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnQuanLyHangHoa.setText("Quản Lý Hàng Hóa");
        btnQuanLyHangHoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuanLyHangHoa.setName("btnQuanLyHangHoa"); // NOI18N
        btnQuanLyHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHangHoaActionPerformed(evt);
            }
        });

        btnQuanLyViTri.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnQuanLyViTri.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuanLyViTri.setLabel("Quản Lý Vị Trí Hàng Hóa");
        btnQuanLyViTri.setMaximumSize(new java.awt.Dimension(141, 25));
        btnQuanLyViTri.setMinimumSize(new java.awt.Dimension(141, 25));
        btnQuanLyViTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyViTriActionPerformed(evt);
            }
        });

        btnQuanLyPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnQuanLyPhieuNhap.setText("Quản Lý Phiếu Nhập");
        btnQuanLyPhieuNhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuanLyPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyPhieuNhapActionPerformed(evt);
            }
        });

        btnQuanLyPhieuXuat.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnQuanLyPhieuXuat.setText("Quản Lý Phiếu Xuất");
        btnQuanLyPhieuXuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuanLyPhieuXuat.setMaximumSize(new java.awt.Dimension(141, 25));
        btnQuanLyPhieuXuat.setMinimumSize(new java.awt.Dimension(141, 25));
        btnQuanLyPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyPhieuXuatActionPerformed(evt);
            }
        });

        btnQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnQuanLyNhanVien.setText("Quản Lý Nhân Viên");
        btnQuanLyNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanVienActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MENU QUẢN TRỊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHangHoaActionPerformed
        // TODO add your handling code here:
        QuanLyHangHoa qlhh = new QuanLyHangHoa();
        qlhh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyHangHoaActionPerformed

    private void btnQuanLyViTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyViTriActionPerformed
        // TODO add your handling code here:
        QuanLyViTriHangHoa qlvt = new QuanLyViTriHangHoa();
        qlvt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyViTriActionPerformed

    private void btnQuanLyPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuNhapActionPerformed
        // TODO add your handling code here:
        QuanLyPhieuNhap qlpn = new QuanLyPhieuNhap();
        qlpn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyPhieuNhapActionPerformed

    private void btnQuanLyPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuXuatActionPerformed
        // TODO add your handling code here:
        QuanLyPhieuXuat qlpx = new QuanLyPhieuXuat();
        qlpx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyPhieuXuatActionPerformed

    private void btnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuanLyNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLyHangHoa;
    private javax.swing.JButton btnQuanLyNhanVien;
    private javax.swing.JButton btnQuanLyPhieuNhap;
    private javax.swing.JButton btnQuanLyPhieuXuat;
    private javax.swing.JButton btnQuanLyViTri;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
