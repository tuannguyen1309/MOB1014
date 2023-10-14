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
public class Lab2_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
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
