/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.bai2;

import java.util.Scanner;

/**
 *
 * Nhập tháng và năm từ bàn phím.
Xuất số ngày của tháng đã nhập
 */
public class lenhSwitch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Vui long nhap nam:");
        int nam = sc.nextInt();
        System.out.println("Vui long nhap thang:");
        int thang = sc.nextInt();
        
        switch(thang){
            case 1:
                System.out.println("So ngay cua thang la 31");
                break;
            case 2:
                if(nam%4==0){
                    System.out.println("So ngay cua thang la 29");
                }else{
                    System.out.println("So ngay cua thang la 28");
                    
                }
                break;
            default:
                System.out.println("So ngay cua thang la 30");
                break;
                
        }
    }
}
