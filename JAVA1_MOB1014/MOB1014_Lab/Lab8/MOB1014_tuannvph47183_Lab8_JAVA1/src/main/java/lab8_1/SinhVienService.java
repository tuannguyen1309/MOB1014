/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SinhVienService {

    ArrayList<SinhVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String nhap() {
        while (true) {
            System.out.println("Moi ban nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            System.out.println("Moi ban nhap ten: ");
            String ten = sc.nextLine();
            System.out.println("Moi ban nhap chuyen nganh: ");
            String chuyenNganh = sc.nextLine();
            list.add(new SinhVien(maSV, ten, chuyenNganh));
            System.out.println("Ban co muon nhap tiep khong(Y/N)? ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {
                break;
            }
        }
        return null;
    }
    
    public void xuat(){
        for (SinhVien sV : list) {
            sV.inThongTin();
        }
    }
}
