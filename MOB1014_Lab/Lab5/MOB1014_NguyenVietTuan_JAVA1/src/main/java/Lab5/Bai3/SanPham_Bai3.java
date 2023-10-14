/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Bai3;

/**
 *
 * @author Dell
 */
public class SanPham_Bai3 {
    private String tenSP;
    private double gia;
    
    public SanPham_Bai3(){
        this.tenSP = null;
        this.gia = 0;
    }
    
    public SanPham_Bai3(String tenSP, double gia){
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
