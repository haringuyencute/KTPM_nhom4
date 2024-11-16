/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class HangHoa implements Serializable{
    private String mahang;
    private String tenhang;
    private String soluong;
    private String dongia;
    private String mota;
    private String nhasx;

    public HangHoa() {
    }

    public HangHoa(String mahang, String tenhang, String soluong, String dongia, String mota, String nhasx) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
        this.nhasx = nhasx;
    }

    public String getMahang() {
        return mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public String getSoluong() {
        return soluong;
    }

    public String getDongia() {
        return dongia;
    }

    public String getMota() {
        return mota;
    }

    public String getNhasx() {
        return nhasx;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }
            
}

