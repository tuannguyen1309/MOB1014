/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENU;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MENU {
    
    public static void TTSV(){
        System.out.println("Bat dau thuc hien chuc nang 1");
    }
    public static void TT(){
        System.out.println("Bat dau thuc hien chuc nang 2");
        //Khai bao bien 
        //nhap gia tri cho bien 
        //tinh tong 
        //in ra tong
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {            
            //1.In ra menu
            System.out.println("--------MENU-------");
            System.out.println("1.Nhap va in ra sinh vien");
            System.out.println("2.Tinh tong");
            System.out.println("3.Thoat");
            System.out.println("--------------------");
            //2. Chon chuc nang
            System.out.println("Moi ban chon: ");
            chon = sc.nextInt();
            //3. Thuc hien chuc nang da chon
            switch (chon) {
                case 1:
                    System.out.println("1.Nhap va in ra sinh vien");
                    TTSV();
                    break;
                case 2:
                    System.out.println("2.Tinh tong");
                    TT();
                    break;
                case 3:
                    System.out.println("3.Thoat");
                    System.exit(0);
                    break;
                default:
                    System.out.println("khong co cn nay");
            }
        } while (true);
        
    }
 
    
}
