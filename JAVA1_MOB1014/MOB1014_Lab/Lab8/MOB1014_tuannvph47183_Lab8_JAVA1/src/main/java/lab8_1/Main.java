/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8_1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        System.out.println("*---------------MENU---------------*");
        System.out.println("1.Nhap");
        System.out.println("2.Xuat");
        System.out.println("------------------------------------");
        SinhVienService sinhVienService = new SinhVienService();
        while (true) {
            System.out.println("Moi ban chon chuc nang(1 => 2): ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    sinhVienService.nhap();
                    break;
                case 2:
                    sinhVienService.xuat();
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
