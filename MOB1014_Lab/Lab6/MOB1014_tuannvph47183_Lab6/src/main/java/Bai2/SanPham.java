/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = sc .nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
//        //cach1
//        sc.nextLine();
        System.out.print("Nhap hang: ");
        //cach2
        hang = new Scanner(System.in).nextLine();
        
        
    }
    
    public void xuat(){
        System.out.println("--------------------");
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
    }
}
