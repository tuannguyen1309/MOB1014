/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lab8;

/**
 *
 * @author Dell
 */
public class SinhVien {
    private String maSv;
    private String hoTen;
    private String chuyenNganh;
    
    public void inThongTin(){
        System.out.println(maSv);
        System.out.println(hoTen);
        System.out.println(chuyenNganh);
    }

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyenNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
}
