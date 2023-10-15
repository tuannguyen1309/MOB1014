/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignment1_JAVA;

/**
 *
 * @author Dell
 */
public class NhanVienKinhDoanh extends NhanVien {

    private double luongKinhDoanh;

    public NhanVienKinhDoanh(String ID, String hoTen, double luongKinhDoanh, String phongBan, double luongCoBan) {
        super(ID, hoTen, luongCoBan, phongBan);
        this.luongKinhDoanh = luongKinhDoanh;
    }

    public double getLuongKinhDoanh() {
        return luongKinhDoanh;
    }

    public void setLuongKinhDoanh(double luongKinhDoanh) {
        this.luongKinhDoanh = luongKinhDoanh;
    }

    @Override
    double getLuong() {
        return luongCoBan + luongKinhDoanh;
    }

}
