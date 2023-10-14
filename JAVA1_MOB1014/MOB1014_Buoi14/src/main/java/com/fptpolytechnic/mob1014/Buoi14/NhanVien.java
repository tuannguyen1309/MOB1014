/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014.Buoi14;

/**
 *
 * @author Dell
 */
// Lương của NhanVien, Trưởng phòng, 
// Lao công… được tính theo công thức 
// khác nhau. Ví dụ nhân viên là lương
// tháng, lao công thì lương giờ, trưởng
// phòng còn có lương trách nhiệm

public class NhanVien {
    private String hoTen;
    private double luong;

    public NhanVien(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public double getLuong() {
        return this.luong;
    }

    public void xuatLuong() {
        System.out.println("Luong cua nhan vien la: " + this.luong);
    }
}