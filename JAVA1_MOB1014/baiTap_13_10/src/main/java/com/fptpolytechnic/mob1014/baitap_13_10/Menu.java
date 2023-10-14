/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.baitap_13_10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> listSV = new ArrayList<>();
        
        int chon;
        while (true) {            
            System.out.println("===========MENU===============");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Tim kiem sinh vien theo ten");
            System.out.println("0.Thoat");
            System.out.println("==============================");
            chon=Integer.parseInt(sc.nextLine());
            
            switch (chon) {
                case 0:
                    System.out.println("Chuc mung ban da thoat thanh cong!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Thong tin sinh vien");
                    while (true) {                        
                        SinhVien sv = new SinhVien();
                        sv.nhap();
                        System.out.println("Ban co muon nhap tiep khong(Y/N)? ");
                        String check=sc.nextLine();
                        if(check.equalsIgnoreCase("N")){
                           break;
                        }
                         
                    }
                    break;
                case 2:
                    System.out.println("Tim kiem sinh vien theo ten");
                    sc.nextLine();
                    
                    break;
                default:
                    System.out.println("Vui long chon dung chuc nang(0=>2)!!!");;
            }
            
        }
    }
}
