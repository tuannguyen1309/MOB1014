/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.util.Scanner;

/**
 *Nhập mảng số nguyên
+ Tính và xuất trung bình cộng
+ Xuất lập phương các phần tử

 * @author Dell
 */
public class VD_Mang {
    public static void main(String[] args) {
        //Khởi tạo mảng số nguyên
        int a[] = {1,2,3,4} ;
        int tong = 0;
        Scanner sc = new Scanner (System.in);
       
         for (int i = 0; i < a.length; i++){
            System.out.println("Nhap phan tu cho mang: ");
            a[i] = sc.nextInt();
            tong +=a[i];
        }
        System.out.printf("Trung binh cong cua mang la: %f\n", (float) tong/a.length);
        
        for(int x:a){
            System.out.printf("Lap phuong cua phan tu la: %.1f\n" , Math.pow(x, 3));
        }
    }
} 