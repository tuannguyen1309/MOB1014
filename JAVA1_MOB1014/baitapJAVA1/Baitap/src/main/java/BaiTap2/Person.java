/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Person {
    Scanner sc = new Scanner(System.in);
    private String ten;
    private String SDT;
    
    public Person(){
    
        }

    public Person(String ten, String SDT) {
        this.ten = ten;
        this.SDT = SDT;
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
     public void nhap(){
         System.out.println("Moi ban nhap ten: ");
         ten=sc.nextLine();
         System.out.println("Moi ban nhap so dien thoai: ");
         SDT=sc.nextLine();
     }
     public void xuat(){
         System.out.printf("Ten: %s",ten);
         System.out.printf("So dien thoai: %s",SDT);
     }
     
     private static boolean checkSDT(String SDT){
         String regex = "^(084)\\\\d{10}$";
         return SDT.matches(regex);
     } 
}
