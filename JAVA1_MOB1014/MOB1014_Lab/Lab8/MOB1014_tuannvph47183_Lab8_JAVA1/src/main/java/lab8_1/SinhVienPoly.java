/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_1;

/**
 *
 * @author Dell
 */
public class SinhVienPoly extends SinhVien{
    private String chuyenNganhHep;

    public SinhVienPoly(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(String chuyenNganhHep, String maSV, String ten, String chuyenNganh) {
        super(maSV, ten, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly() {
    }

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println(this.chuyenNganhHep);
    }
}
