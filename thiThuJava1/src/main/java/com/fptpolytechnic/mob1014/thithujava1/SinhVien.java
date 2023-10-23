/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fptpolytechnic.mob1014.thithujava1;

/**
 *
 * @author Dell
 */
public class SinhVien {

    private int maSV;
    private String ten;
    private int namSinh;
    private double diemCsharp;

    public void inThongTin() {
        System.out.println("Ma sinh vien: " + getMaSV());
        System.out.println("Ten: " + getTen());
        System.out.println("Nam sinh: " + getNamSinh());
        System.out.println("Diem Csharp: " + getDiemCsharp());
    }
//    contructor khong tham so

    public SinhVien() {
    }

    public SinhVien(int maSV, String ten, int namSinh, double diemCsharp) {
        this.maSV = maSV;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemCsharp = diemCsharp;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemCsharp() {
        return diemCsharp;
    }

    public void setDiemCsharp(double diemCsharp) {
        this.diemCsharp = diemCsharp;
    }

}
