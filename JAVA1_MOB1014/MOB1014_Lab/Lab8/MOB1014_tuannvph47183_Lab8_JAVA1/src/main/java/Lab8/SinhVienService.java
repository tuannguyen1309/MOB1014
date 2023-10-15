/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SinhVienService {
    private ArrayList<SinhVien>  qlySinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
     public void nhapSinhVien() {
        while(true) {
            System.out.print("Vui long nhap ma sinh vien: ");
            String maSv = sc.nextLine();
            System.out.print("Vui long nhap ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Vui long nhap chuyen nganh: ");
            String chuyenNganh = sc.nextLine();
            qlySinhVien.add(new SinhVien(maSv, hoTen, chuyenNganh));
            System.out.println("Ban co muon nhap tiep khong (Y/N) ");
            String luaChon = sc.nextLine();
            if(!luaChon.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
    public void xuatSinhVien() {
        for (SinhVien sinhVien : qlySinhVien) {
            sinhVien.inThongTin();
        }
    }
    public void timSinhVien(String maTim) {
        int flag = 0;
        for (SinhVien sinhVien : qlySinhVien) {
            if (sinhVien.getMaSv().toLowerCase().contains(maTim.toLowerCase())) {
                sinhVien.inThongTin();
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Khong tim thay ai!!!");
        }
    }
    public void sapXepTheoChuyenNganh() {
        Comparator<SinhVien> compare = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b){
                return a.getChuyenNganh().compareToIgnoreCase(b.getChuyenNganh());
            }
        };
        Collections.sort(qlySinhVien, compare);
    }
}
