/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignment1_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma nhan vien: ");
            String ID = sc.nextLine();

            System.out.println("Nhap ho ten nhan vien: ");
            String name = sc.nextLine();
            System.out.println("Nhap luong co ban: ");
            double luongCoBan = sc.nextDouble();
            System.out.print("Ban thuoc phong ban nao (Hanh chinh/Kinh doanh): ");
            String phongBan = new Scanner(System.in).nextLine();
            if (phongBan.equalsIgnoreCase("Hanh chinh")) {
                System.out.println("Nhap ngay cong: ");
                double ngayCong = sc.nextDouble();
                NhanVien newNV = new NhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Kinh doanh")) {
                System.out.println("Nhap luong kinh doanh: ");
                double luongKinhDoanh = sc.nextDouble();
                NhanVien newNV = new NhanVienKinhDoanh(ID, name, luongCoBan, phongBan, luongKinhDoanh);
                list.add(newNV);
            } else {
                System.out.println("Vui long nhap lai phong ban va cac thong tin khac!!!");
            }
            System.out.println("Ban muon nhap tiep khong (Y/N)? ");
            String luaChon = new Scanner(System.in).nextLine();
            if (luaChon.equalsIgnoreCase("n")) {
                break;
            }

        } while (true);
    }

    public void xuat() {
        for (NhanVien nv : list) {
            System.out.printf("Ma nhan vien: %s | Ho ten : %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void timNV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can tim: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                System.out.printf("Ma nhan vien: %s | Ho ten : %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong tim thay!!!");
        }
    }

    public void xoaNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa: ");
        String ID = sc.nextLine();
        Boolean check = false;
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Nhan vien khong ton tai!!!");
        }else{
            System.out.println("Nhan vien da xoa!!!");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                  Ho va ten: Nguyen Viet Tuan               |");
            System.out.println("|                       MSSV: PH47183                        |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                        Menu ASSIGNMENT                     |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|        1. Nhap danh sach nhan vien tu ban phim             |");
            System.out.println("|        2. Xuat danh sach nhan vien tu ban phim             |");
            System.out.println("|    3. Tim va hien thi nhan vien theo ma nhap tu ban phim   |");
            System.out.println("|        4. Xoa nhan vien theo ma nhap tu ban phim           |");
            System.out.println("|   5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim |");
            System.out.println("|    6. Tim cac nhan vien theo khoang luong nhap tu ban phim |");
            System.out.println("|          7. Sap xep nhan vien theo ho va ten               |");
            System.out.println("|          8. Sap xep nhan vien theo thu nhap                |");
            System.out.println("|        9. Xuat 5 nhan vien co thu nhap cao nhat            |");
            System.out.println("|                     10. Thoat chhuong trinh                |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("Moi ban chon chuc nang (1 => 10): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    // Nhap danh sach nhan vien
                    nhap();
                    break;
                case 2:
                    // Xuat danh sach nhan vien
                    xuat();
                    break;
                case 3:
                    // Tim va hien thi nhan vien theo ma
                    timNV();
                    break;
                case 4:
                    // Xoa nhan vien theo ma
                    xoaNhanVien();
                    break;
                case 5:
                    // Cap nhat thong tin nhan vien theo ma
                    break;
                case 6:
                    // Tim cac nhan vien theo khoang luong
                    break;
                case 7:
                    // Sap xep nhan vien theo ho va ten
                    break;
                case 8:
                    // Sap xep nhan vien theo thu nhap
                    break;
                case 9:
                    // Xuat 5 nhan vien co thu nhap cao
                    break;
                case 10:
                    System.out.println("Ban da thoat thanh cong!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai, nhap lai!!!");
                    break;
            }
        } while (true);
    }
}
