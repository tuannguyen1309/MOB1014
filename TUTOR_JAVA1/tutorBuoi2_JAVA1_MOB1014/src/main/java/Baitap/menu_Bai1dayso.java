/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class menu_Bai1dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int chon;
        
        do {       
            System.out.println("\n\n---------MENU-------------------");
            System.out.println("1.Thong tin ca nhan cua hoc sinh");
            System.out.println("2.Day so");
            System.out.println("3.Ket thuc");
            System.out.println("---------------------------------");
            
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            sc.nextLine();
            //regex
            switch (chon) {
                case 1:
                    int lop;
                    System.out.println("\n1.THONG TIN CA NHAN CUA HOC SINH");
                    System.out.println("Moi ban nhap ho va ten: ");
                    String ten = sc.nextLine();
                    while(true){
                        System.out.println("Moi ban nhap lop(1-12): ");
                         lop = sc.nextInt();
                        if(1<lop && lop<=12){
                            break;
                        }
                    }
                    //Dùng Integer.parse(sc.nextLine()) là nó ko lấy khoảng trắng xuống dòng
                    sc.nextLine();
                    System.out.println("Moi ban nhap ten truong hoc: ");
                    String truongHoc = sc.nextLine();
                    String capHoc;
                    if(lop>10){
                        capHoc = "Cap ba";
                    }
                    else if(lop>=6){
                        capHoc = "Cap hai";
                    }
                    else{
                        capHoc = "Cap mot";
                    }
                            
                    System.out.println("--------");
                    System.out.println("Ho ten: " + ten);
                    System.out.println("Cap hoc: " + capHoc);
                    System.out.println("Truong hoc: " + truongHoc );
                    
                    break;
                case 2:
                    System.out.println("2.DAY SO");
                    int n;
                    while (true) {                        
                    System.out.println("Moi ban nhap so n (n>0): ");
                    n = sc.nextInt();
                    if(n>0){
                        break;
                    }
                        
                    }
                    System.out.println("Day so tu 1 den n (khong bao gom 5) :");
                    for (int i = 0; i <= n; i++) {
                        if(i !=5){
                            System.out.println( i+" ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Tam biet!!! Hen gap lai!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tinh nang ban chon khong ton tai!!!");
            }
        } while (true);
    }
}
