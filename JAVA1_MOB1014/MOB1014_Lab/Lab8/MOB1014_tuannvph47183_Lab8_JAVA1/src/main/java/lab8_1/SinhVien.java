/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_1;

/**
 *
 * @author Dell
 */
public class SinhVien {
    private String maSV;
    private String ten;
    private String chuyenNganh;
    
    public void inThongTin(){
        System.out.println(maSV);
        System.out.println(ten);
        System.out.println(chuyenNganh);
    }

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
}
