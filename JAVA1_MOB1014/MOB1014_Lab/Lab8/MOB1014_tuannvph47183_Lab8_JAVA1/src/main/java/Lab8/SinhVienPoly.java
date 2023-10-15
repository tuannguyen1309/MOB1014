/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author Dell
 */
public class SinhVienPoly extends SinhVien{
    private String chuyenNganhHep;

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(String maSv, String hoTen, String chuyenNganh, String chuyenNganhHep) {
        super(maSv, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(this.chuyenNganhHep);
    }
}
