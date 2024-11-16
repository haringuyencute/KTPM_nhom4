package view;


import controller.Mycontroller;
import controller.controller;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HangHoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NGUYEN MINH
 */
public class QuanLyHangHoa extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyHangHoa
     */
    
    private static DefaultTableModel modelHangHoa;
    private static Mycontroller controller = new Mycontroller();
    private Object btnQuanLyHangHoa;
    
    public QuanLyHangHoa() {
        List<HangHoa> list = controller.readDataFromFile("src/file/hanghoa.txt");
        initComponents();
        setLocationRelativeTo(null);
        modelHangHoa = (DefaultTableModel) tblHangHoa.getModel();
        this.showData(list, modelHangHoa);
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
        txtMaHang = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangHoa = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtMoTa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNSX = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ HÀNG HÓA");

        txtMaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mã hàng:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tên hàng:");

        txtTenHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Đơn giá:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Mô tả: ");

        tblHangHoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblHangHoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Số lượng", "Đơn giá", "Mô tả", "Nhà sản xuất"
            }
        ));
        jScrollPane1.setViewportView(tblHangHoa);

        btnXem.setBackground(new java.awt.Color(51, 255, 255));
        btnXem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXem.setText("Xem");
        btnXem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(51, 255, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 255, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 255, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtMoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng:");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nhà sản xuất: ");

        txtNSX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnTimKiem.setBackground(new java.awt.Color(51, 255, 255));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThoat1.setBackground(new java.awt.Color(51, 255, 255));
        btnThoat1.setText("Thoát");
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });

        btnSapXep.setBackground(new java.awt.Color(51, 255, 255));
        btnSapXep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSapXep.setText("Sắp xếp ");
        btnSapXep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(278, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(262, 262, 262))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMoTa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnXem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(btnTimKiem)
                                        .addGap(50, 50, 50)
                                        .addComponent(btnSapXep)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat1)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXem)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnTimKiem)
                    .addComponent(btnSapXep))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        int selectedRow = tblHangHoa.getSelectedRow();
        try{
            if(selectedRow == -1){
                JOptionPane.showMessageDialog(this, "Hãy chọn hàng hóa muốn xem thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            else{
                DefaultTableModel model = (DefaultTableModel) tblHangHoa.getModel();
                String ma = (String) model.getValueAt(selectedRow, 0);
                String ten = (String) model.getValueAt(selectedRow, 1);
                String soluong = (String) model.getValueAt(selectedRow, 2);
                String dongia = (String) model.getValueAt(selectedRow, 3);
                String mota = (String) model.getValueAt(selectedRow, 4);
                String nhasanxuat = (String) model.getValueAt(selectedRow, 5);

                txtMaHang.setText(ma);
                txtTenHang.setText(ten);
                txtSoLuong.setText(soluong);
                txtDonGia.setText(dongia);
                txtMoTa.setText(mota);
                txtNSX.setText(nhasanxuat);

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnXemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try{
            new QLHH_Them().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selectedRow = tblHangHoa.getSelectedRow();
        try{
            if(selectedRow == -1){
                JOptionPane.showMessageDialog(this, "Hãy chọn hàng hóa muốn sửa thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            else{
                DefaultTableModel model = (DefaultTableModel) tblHangHoa.getModel();
                String ma = (String) model.getValueAt(selectedRow, 0);
                String ten = (String) model.getValueAt(selectedRow, 1);
                String soluong = (String) model.getValueAt(selectedRow, 2);
                String dongia = (String) model.getValueAt(selectedRow, 3);
                String mota = (String) model.getValueAt(selectedRow, 4);
                String nhasanxuat = (String) model.getValueAt(selectedRow, 5);

                QLHH_Sua sua = new QLHH_Sua();
                List<HangHoa> list = controller.readDataFromFile("src/file/hanghoa.txt");
                int index = -1;
                int tmp = 0;
                for(HangHoa vt : list){
                    if(vt.getMahang().equals(ma)){
                        index = tmp;
                    }
                    tmp++;
                }
                if(index != -1){
                    sua.displayDetails(selectedRow, ma, ten, soluong, dongia, mota, nhasanxuat);
                    sua.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Không tồn tại dòng vừa chọn trong cơ sở dữ liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    throw new Exception("Loi dong chon");
                }

            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int indexdDelete = tblHangHoa.getSelectedRow();
        List<HangHoa> list = controller.readDataFromFile("src/file/hanghoa.txt");
        try{
            if(list.size() == 0){
                JOptionPane.showMessageDialog(this, "Bảng trống");
            }
            else if(indexdDelete == -1){
                JOptionPane.showMessageDialog(this, "Chưa chọn hàng hóa cần xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
                throw new Exception("Loi chon dong");
            }
            else{
                int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hàng hóa này?", "Message", JOptionPane.YES_NO_OPTION);
                if(choice != JOptionPane.YES_OPTION){
                    return;
                }
                else{
                    list.remove(indexdDelete);
                    showData(list, modelHangHoa);
                    controller.writeToFile(list, "src/file/hanghoa.txt");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try{
            String ma = txtMaHang.getText();
            List<HangHoa> list = controller.readDataFromFile("src/file/hanghoa.txt");
            int find = -1;
            for(HangHoa hh : list){
                if(ma.equals(hh.getMahang())){
                    find = 1;
                    txtMaHang.setText(hh.getMahang());
                    txtTenHang.setText(hh.getTenhang());
                    txtSoLuong.setText(hh.getSoluong());
                    txtDonGia.setText(hh.getDongia());
                    txtMoTa.setText(hh.getMota());
                    txtNSX.setText(hh.getNhasx());
                }
            }
            if(find < 0){
                JOptionPane.showMessageDialog(this, "Không tìm thấy hàng hóa có mã trên", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        // TODO add your handling code here:
        new TrangChu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoat1ActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        //sap xep theo so luong 
      
            List<HangHoa> list = controller.readDataFromFile("src/file/hanghoa.txt");
            Collections.sort(list, new Comparator<HangHoa>(){
                @Override
                public int compare(HangHoa hh1, HangHoa hh2) {   
                    int soluong1 = Integer.parseInt(hh1.getSoluong());
                    int soluong2 = Integer.parseInt(hh2.getSoluong());
                    return Integer.compare(soluong1, soluong2);
                
                }  
            });
            controller.writeToFile(list, "src/file/hanghoa.txt");
            DefaultTableModel model = (DefaultTableModel) tblHangHoa.getModel();
            showData(list, model);
        
    }//GEN-LAST:event_btnSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHangHoa().setVisible(true);
            }
        });
    }
    
    private void showData(List<HangHoa> list, DefaultTableModel model){
        try{
            model.setRowCount(0);
            for(HangHoa hh : list){
                model.addRow(new Object[]
                {
                    hh.getMahang(),
                    hh.getTenhang(),
                    hh.getSoluong(),
                    hh.getDongia(),
                    hh.getMota(),
                    hh.getNhasx()
                });
            }
        }
        catch(Exception ex){
            System.out.println("Loi la : " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblHangHoa;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNSX;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables
}
