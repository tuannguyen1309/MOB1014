/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignment_JAVA;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TiepThi extends NhanVien {

    private Double doanhSo;
    private Double hoaHong;

    public TiepThi() {
    }

    public TiepThi(Double doanhSo, Double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public TiepThi(Double doanhSo, Double hoaHong, String maNV, String hoTen, Double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public Double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(Double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Doanh so: ");
        doanhSo = sc.nextDouble();
        System.out.print("Hoa hong: ");
        hoaHong = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "Hoa Hong:" + this.hoaHong + "Doanh so:" + this.doanhSo;
    }

    @Override
    public double getThuNhap() {
        return (super.getThuNhap() + this.doanhSo * this.hoaHong);
    }

}
