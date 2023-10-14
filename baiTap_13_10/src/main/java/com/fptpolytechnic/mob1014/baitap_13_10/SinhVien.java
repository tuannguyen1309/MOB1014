/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014.baitap_13_10;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SinhVien {
 private String ten;
 private double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }
    
 
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        ten=sc.nextLine();
        System.out.println("Moi ban nhap diem: ");
        diem=sc.nextDouble();
    }
    public void xuat(){
        System.out.println("Ten: "+ ten);
        System.out.println("Diem: "+diem);
    }
}
