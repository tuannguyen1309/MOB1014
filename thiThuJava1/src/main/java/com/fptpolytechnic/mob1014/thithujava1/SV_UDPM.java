/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.thithujava1;

/**
 *
 * @author Dell
 */
public class SV_UDPM extends SinhVien {

    private double diemJava;

    public SV_UDPM() {
    }

    public SV_UDPM(double diemJava) {
        this.diemJava = diemJava;
    }

    public SV_UDPM(double diemJava, int maSV, String ten, int namSinh, double diemCsharp) {
        super(maSV, ten, namSinh, diemCsharp);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem Java: " + getDiemJava());
    }
    
}
