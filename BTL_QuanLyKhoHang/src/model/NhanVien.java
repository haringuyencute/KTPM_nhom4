package model;


import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.Serializable;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NhanVien implements Serializable {
    private String maNV;
    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private Date ngayVaoLam;
    
    public NhanVien() {};
    public NhanVien(String MaNV, String HoTen, String SoDienThoai, String DiaChi, Date NgayVaoLam)
    {
        this.maNV = MaNV;
        this.hoTen = HoTen;
        this.soDienThoai = SoDienThoai;
        this.diaChi = DiaChi;
        this.ngayVaoLam = NgayVaoLam;
    }
    
    public String getMaNV() {
        return this.maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getSoDienThoai() {
        return this.soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Date getNgayVaoLam() {
        return this.ngayVaoLam;
    }
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
}
