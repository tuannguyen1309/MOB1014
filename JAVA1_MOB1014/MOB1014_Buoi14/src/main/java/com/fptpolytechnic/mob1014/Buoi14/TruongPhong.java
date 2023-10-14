/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.Buoi14;

/**
 *
 * @author Dell
 */
public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return this.trachNhiem;
    }

    @Override
    public void xuatLuong() {
        System.out.println("Luong cua Truong phong la: " + (this.getLuong() + this.trachNhiem));
    }
}