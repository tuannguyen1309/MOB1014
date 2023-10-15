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
//extends ke thua
public class TruongPhong extends NhanVien {

    private Double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(Double trachNhiem, String maNV, String hoTen, Double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public Double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(Double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Trach nhiem: ");
        this.trachNhiem = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "Trach nhiem:" + this.trachNhiem;
    }

    @Override
    public double getThuNhap() {
        double thuNhap = super.getLuong() + trachNhiem;
        return (super.getThuNhap() + super.getLuong() + trachNhiem);
    }
}
