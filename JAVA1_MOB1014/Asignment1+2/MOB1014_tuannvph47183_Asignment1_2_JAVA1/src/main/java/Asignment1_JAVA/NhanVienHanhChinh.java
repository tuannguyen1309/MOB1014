/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignment1_JAVA;

/**
 *
 * @author Dell
 */
//extends ke thua
public class NhanVienHanhChinh extends NhanVien {

    private double ngayCong;

    public NhanVienHanhChinh(String ID, String hoTen, double ngayCong, String phongBan, double luongCoBan) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    double getLuong() {
        return luongCoBan * ngayCong;
    }
}
