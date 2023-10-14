/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.baitap;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        int a;
        //khởi tạo 1 đối tượng sinh viên
        sinhVien sv1 = new sinhVien();
        sinhVien sv2 =new sinhVien("PH47183", "Nguyenviettuan", 10);
        
        //Nhap TT
        sv1.nhap();
        
        //Hiển thị thông tin
        sv1.xuat();
        
        //In ra một thông tin của đối tượng
        System.out.println("In ra MSV cua SV1: "  + sv1.getDiem());
        System.out.println("In ra diem TB cua SV1: "  + sv1.getDiemTB());
    }
}
