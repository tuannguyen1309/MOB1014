/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.thithujava1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("========================menu==================");
            System.out.println("0.Thoat                                       ");
            System.out.println("1. Them sinh vien                             ");
            System.out.println("2. xuat danh sach sinh vien                                     ");
            System.out.println("3. xuat danh sach cac sv qua mon (diem Csharp)");
            System.out.println("4.Tim SV theo ma                              ");
            System.out.println("5. ke thua                                    ");
            System.out.println("==============================================");
            System.out.println("Moi ban chon chuc nang (1=>5):                ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 0:
                    System.out.println("Ban da thoat thanh cong!!!");
                    System.exit(0);
                    break;
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    do {                        
                        System.out.println("Vui long chon dung chuc nang!!!");                        
                    } while (chon <6);
          }
        } while (chon !=0);
    }

}
