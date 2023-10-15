/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Asignment_JAVA;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ASM1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                  Ho va ten: Nguyen Viet Tuan               |");
            System.out.println("|                       MSSV: PH47183                        |");
            System.out.println("|                       ASSIGNMENT-GD2                       |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     Cong ty Rong Viet                      |");
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
