/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014lab1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab1_Menu {
    public static void main(String[] args) {
        int choiceNumber;
        Scanner sc=new Scanner(System.in);
        for(;;){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>  LAB 1  <<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| 1.Bai1:Nhap ho va ten va diem TB                 |");
            System.out.println("| 2.Bai2:Tinh chu vi va dien tich hinh chu nhat    |");
            System.out.println("| 3.Bai3:Tinh the tich khoi lap phuong             |");
            System.out.println("| 4.Bai4:Tinh delta                                |");
            System.out.println("| 5.Thoat chuc nang                                |");
            System.out.println("+--------------------------------------------------+");
            System.out.println(" >> Chon chuc nang? ");
            do{
                System.out.println("Bam so de chon (1/2/3/4/5): ");
                choiceNumber=sc.nextInt();
                
            }while((choiceNumber < 1) || (choiceNumber > 10));
            
            switch (choiceNumber) {
                case 1:
                    System.out.print("Ho va ten: ");
                    sc.nextLine(); // Đọc bỏ dòng thừa sau khi đọc số từ bàn phím
                    String hoTen = sc.nextLine();
                    System.out.print("Diem TB: ");
                    double diemTB = sc.nextDouble();
                    System.out.println("Ho ten cua ban la: " + hoTen);
                    System.out.println("Diem trung binh cua ban la: " + diemTB);
                    break;
                case 2:
                    System.out.println("Moi ban nhap chieu dai: ");
                    double dai=sc.nextDouble();
                    System.out.println("Moi ban nhap chieu rong: ");
                    double rong=sc.nextDouble();
                    double chuVi =( dai + rong )*2;
                    double dienTich = dai * rong;
                    double canhNho=Math.min(dai, rong);
                    System.out.println("Ket qua cua chu vi la: " + chuVi);
                    System.out.println("Ket qua cua dien tich la: " + dienTich);
                    System.out.println("Canh nho cua hinh chu nhat la: " + canhNho);
                    break;
                case 3:
                    System.out.println("Moi ban nhap canh cua khoi lap phuong: ");
                    double canh=sc.nextDouble();
                    double theTich=canh*canh*canh;
            //        double theTich=Math.pow(canh,3 );
                    System.out.println("The tich cua khoi lap phuong la: " + theTich);
                    break;
                case 4:
                    float a, b, c;
                    System.out.println("Nhap a: ");
                    a=sc.nextFloat();
                    System.out.println("Nhap b: ");
                    b=sc.nextFloat();
                    System.out.println("Nhap c: ");
                    c=sc.nextFloat();
                    
                    float delta =(float) Math.pow(b, 2) - (4*a*c);
                    System.out.println("Can delta la: " + Math.sqrt(delta));
                    break;
                case 5:
                    System.out.println("Thoat chuc nang thanh cong!!!");
                    break;
                default:
                    System.out.println("Vui long chon dung chuc nang!!!");
                    break;
                    
            }
            
        }
        
        
    }
}
