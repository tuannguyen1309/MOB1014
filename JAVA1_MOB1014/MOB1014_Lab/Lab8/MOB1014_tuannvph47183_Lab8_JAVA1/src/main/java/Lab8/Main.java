/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Nhap 1 danh sach doi tuong");
        System.out.println("2. Xuat danh sach doi tuong");
        System.out.println("3. Tim kiem doi tuong theo mssv");
        System.out.println("4. Sap xep theo thuoc tinh chuyen nganh");
        System.out.println("5. Ke Thua");
        System.out.println("0. Thoat");
        Scanner sc = new Scanner(System.in);
        SinhVienService sVienService = new SinhVienService();
        while (true) {
            System.out.println("Vui long chon menu: ");
            int luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    sVienService.nhapSinhVien();
                    break;
                case 2:
                    sVienService.xuatSinhVien();
                    break;
                case 3:
                    System.out.println("Nhap ma sinh vien can tim: ");
                    sVienService.timSinhVien(sc.nextLine());
                    break;
                case 4:
                    sVienService.sapXepTheoChuyenNganh();

                    break;
                case 5:
                    SinhVienPoly sinhVienPoly = new SinhVienPoly("PH47183", "tuan", "web", "Front-end");
                    sinhVienPoly.inThongTin();
                    break;
                case 0:
                    System.exit(1);
            }
        }
    }
}
