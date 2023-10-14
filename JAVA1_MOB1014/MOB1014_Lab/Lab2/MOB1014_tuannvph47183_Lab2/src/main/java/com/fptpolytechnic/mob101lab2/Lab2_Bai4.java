/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob101lab2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab2_Bai4 {
    
        
       static Scanner sc = new Scanner (System.in);
       public static void main(String[] args) {
        menu();
    }
        public static void menu(){
            for(;;){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>  LAB 2  <<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("+--------------------------------------------------+");
            System.out.println("|         1.Bai 1: Phuong trinh bac nhat           |");
            System.out.println("|         2.Bai 2: Phuong trinh bac hai            |");
            System.out.println("|         3.Bai 3: Tinh tien dien                  |");
            System.out.println("|         4.Thoat chuc nang                        |");
            System.out.println("+--------------------------------------------------+");
            System.out.println(">>>>>>>>>>>>>>>>>  Chon chuc nang <<<<<<<<<<<<<<<<<<");
            int chon;
            do{
                System.out.println("Bam so de chon (1/2/3/4): ");
               chon = sc.nextInt();
                
            }while ((chon < 1) || (chon > 5));
            switch (chon){
                case 1:
                     giaiPTB1();
                     break;
              
                case 2:
                        giaiPTB2();
                        break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Thoat chuc nang thanh cong!!!");
                    break;
                default:
                    System.out.println("Vui long chon dung chuc nang!");
                    break;
            }
        }
        
        }
        public static void giaiPTB1(){
        System.out.println("Giai phuong trinh bac nhat ax + b = 0");
        System.out.println("Moi ban nhap he so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap he so b: ");
        double b = sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }
            else{
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        }
        else{
            double x = -b /a;
            System.out.println("Phuong trinh co nghiem la x= " + x);
        }
     }
        public static void giaiPTB2(){
                        System.out.println("Moi ban nhap d: ");
                        double d = sc.nextDouble();
                        System.out.println("Moi ban nhap e: ");
                        double e = sc.nextDouble();
                        System.out.println("Moi ban nhap f: ");
                        double f = sc.nextDouble();
        
                        if(d==0){
                            if(e==0){
                                System.out.println("Phuong trinh co vo so nghiem!");
                            }
                            else{
                                System.out.println("Phuong trinh vo nghiem!!!");
                            }
                        }
                        else{
                             double Delta = e*e-4*d*f;
                             if(Delta<0){
                                 System.out.println("Phuonng trinh vo nghiem");
                             }
                             else if(Delta == 0){
                                 System.out.println("Phuong trinh co nghiem kep x = " + -e/(2*d));
                             }
                             else{
                                 double x1 = (-e + Math.sqrt(Delta))/ (2 * d);
                                 double x2 = (-e - Math.sqrt(Delta))/ (2 * d);
                                 System.out.println("Phuong trinh co hai nghiem x1 = " + x1 + " va x2 = " + x2);
                             }
                         }
    }
        public static void tinhTienDien(){
                    System.out.println("Moi ban nhap so dien su dung cua thang: ");
                    float soDien = sc . nextFloat();

                    if(soDien<0){
                        System.out.println("khong co so dien am!!!");
                    }
                   else if(soDien< 50){
                        float tien = soDien * 1000;
                        System.out.println("So dien su dung tu 0 -> 50 la: " + tien);
                    }
                    else{
                        float tien = 50 * 1000 + (soDien - 50) * 1200;
                        
                        System.out.println("So dien su dung tren 50 la: " + tien);
                    }
    }
}
    

