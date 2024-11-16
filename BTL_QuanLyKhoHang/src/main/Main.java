/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import view.TrangChu;

/**
 *
 * @author NGUYEN MINH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TrangChu tc = new TrangChu();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tc.setVisible(true);
            }
        });
    }
    
}
