/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;


/**
 *
 * @author NGUYEN MINH
 */
public class ViTri implements Serializable{
    private String make;
    private String tenke;
    private String tangso;
    private String nganso;
    
    public ViTri(){}
    
    public ViTri(String make, String tenke, String tangso, String nganso){
        this.make = make;
        this.tenke = tenke;
        this.tangso = tangso;
        this.nganso = nganso;
    }

    public String getMake() {
        return make;
    }

    public String getTenke() {
        return tenke;
    }

    public String getTangso() {
        return tangso;
    }

    public String getNganso() {
        return nganso;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setTenke(String tenke) {
        this.tenke = tenke;
    }

    public void setTangso(String tangso) {
        this.tangso = tangso;
    }

    public void setNganso(String nganso) {
        this.nganso = nganso;
    }

  
    
}
