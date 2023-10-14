package com.fptpolytechnic.mob1014assignment;

import java.util.Scanner;

public class ASM1_MENU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("+++++++++++++\n MENU chuong trinh+++++++++++++");
            System.out.println("|    Y1. Nhap danh sach nhan vien            |");
            System.out.println("|    Y2. Xuat danh sach sinh vien            |");
            System.out.println("|    Y3. Tim va hien thi nhan vien theo ma   |");
            System.out.println("|    Y4. Xoa nhan vien theo ma               |");
            System.out.println("|    Y5. Cap nhat thong tin nhan vien theo ma|");
            System.out.println("|    Y6. Tim cac nhan vien theo khoang luong |");
            System.out.println("|    Y7. Sap xep nhan vien theo ho va ten    |");
            System.out.println("|    Y8. Sap xep nhan vien theo thu nhap     |");
            System.out.println("|    Y9. Xuat 5 nhan vien co thu nhap cao    |");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("0. Thoat chuc nang");
            System.out.print("Moi ban chon");

            chon = sc.nextInt();

            switch (chon) {
                case 0:
                    break;
                case 1:
                    // Nhap danh sach nhan vien
                    break;
                case 2:
                    // Xuat danh sach nhan vien
                    break;
                case 3:
                    // Tim va hien thi nhan vien theo ma
                    break;
                case 4:
                    // Xoa nhan vien theo ma
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
                default:
                    System.out.println("Nhap sai, nhap lai!!!");
                    break;
            }
        } while (true);
    }
}
