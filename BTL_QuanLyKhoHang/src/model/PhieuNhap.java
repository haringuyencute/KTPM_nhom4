/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author phamt
 */
public class PhieuNhap implements Serializable{
    private String maNhap;
    private String ngayNhap;
    private String soLuongNhap;
    private String giaNhap;
    private String tenNCC;
    private String tenNV;

 public PhieuNhap(){}
    

    public PhieuNhap(String maNhap, String ngayNhap, String soLuongNhap, String giaNhap, String tenNCC, String tenNV) {
        this.maNhap = maNhap;
        this.ngayNhap = ngayNhap;
        this.soLuongNhap = soLuongNhap;
        this.giaNhap = giaNhap;
        this.tenNCC = tenNCC;
        this.tenNV = tenNV;
      
    }

    public PhieuNhap(String ma, String ngay, double soluong, int gia, String tenncc, String tennv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public String getMaNhap() {
        return maNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public String getSoLuongNhap() {
        return soLuongNhap;
    }

    public String getGiaNhap() {
        return giaNhap;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setMaNhap(String maNhap) {
        this.maNhap = maNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setSoLuongNhap(String soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    //phuong thuc khoi tao phieu nhap mau

   

   
   
}
