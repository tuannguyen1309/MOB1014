/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SinhVien {

    private String ten;
    private Double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, Double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien:");
        ten = sc.nextLine();
        System.out.println("Nhap diem:");
//        diem = Double.parseDouble(sc.nextLine());
        diem = sc.nextDouble();

    }

    public void xuat() {
        System.out.print("Ten:" + ten);
        System.out.print("Diem:" + diem);
    }

}
