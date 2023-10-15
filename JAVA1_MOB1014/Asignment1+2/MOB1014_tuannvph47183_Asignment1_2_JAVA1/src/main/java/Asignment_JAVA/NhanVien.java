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
// Nguyễn Viết Tuấn - PH47183
public class NhanVien {

    private String maNV;
    private String hoTen;
    private Double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public double getThuNhap() {
        return this.luong;

    }

    @Override
    public String toString() {
        return "Danh sach nv: "
                + "\n\t maNV: " + maNV
                + "\n\t hoTen: " + hoTen
                + "\n\t luong: " + luong
                + "\n\t Thu nhap:" + getThuNhap();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien:");
        maNV = sc.nextLine();
        System.out.print("Ten nhan vien:");
        hoTen = sc.nextLine();
        System.out.print("Luong cua nhan vien:");
        luong = Double.parseDouble(sc.nextLine());

    }

    public void xuat() {
        System.out.println(this.toString());
    }

    public double getThueThuNhap() {
        if (getThuNhap() <= 9000000) {
            return 0;
        } else if (getThuNhap() < 15000000) {
            return getThuNhap() - 9000000 * 0.1;
        } else {
            return (6000000 * 0.1) + (getThuNhap() - 15000000) * 0.12;
        }
    }

}
