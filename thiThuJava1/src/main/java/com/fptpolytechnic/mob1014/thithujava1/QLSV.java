/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.thithujava1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {

    private ArrayList<SinhVien> QlySinhVien;
    private Scanner sc;

    public QLSV() {
        QlySinhVien = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    private String getValue(String x) {
        System.out.println("Nhap vao: " +x);
        return sc.nextLine();
    }

    public void nhap(){
        System.out.println("Nhap ma sinh vien: ");
        int maSv = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa sau khi đọc số từ bàn phím
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        int namSinh = sc.nextInt();
        System.out.println("Nhap diem: ");
        double diem = sc.nextDouble();
        sc.nextLine(); // Đọc bỏ dòng thừa sau khi đọc số từ bàn phím
        String luaChon;
        do {
            System.out.println("Nhap 'N' de ket thuc nhap sinh vien, nhap bat ky ky tu khac de tiep tuc: ");
            luaChon = sc.nextLine();
        } while (!luaChon.equalsIgnoreCase("N"));

        SinhVien sinhVien = new SinhVien(maSv, ten, namSinh, diem);
        QlySinhVien.add(sinhVien);
    }

}

