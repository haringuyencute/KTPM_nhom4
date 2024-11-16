/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ACER
 */
public class PhieuXuat implements Serializable{
    private String MaPhieuXuat;
    private String NgayXuat;
    private String SoLuongXuat;
    private String TenKhachHang;
    private String TenNV;
    private String GiaBan;

    public PhieuXuat() {
    }

    public PhieuXuat(String MaPhieuXuat, String NgayXuat, String SoLuongXuat, String TenKhachHang, String TenNV,String GiaBan) {
        this.MaPhieuXuat = MaPhieuXuat;
        this.NgayXuat = NgayXuat;
        this.SoLuongXuat = SoLuongXuat;
        this.TenKhachHang = TenKhachHang;
        this.TenNV = TenNV;
        this.GiaBan = GiaBan;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getMaPhieuXuat() {
        return MaPhieuXuat;
    }

    public void setMaPhieuXuat(String MaPhieuXuat) {
        this.MaPhieuXuat = MaPhieuXuat;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public String getSoLuongXuat() {
        return SoLuongXuat;
    }

    public void setSoLuongXuat(String SoLuongXuat) {
        this.SoLuongXuat = SoLuongXuat;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void getSoLuongXuat(float parseFloat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getTenKhachHang(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getTenNV(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
