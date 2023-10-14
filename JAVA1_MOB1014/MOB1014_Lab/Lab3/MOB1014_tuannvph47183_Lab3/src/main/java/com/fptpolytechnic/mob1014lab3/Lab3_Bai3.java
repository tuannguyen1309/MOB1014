/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab3_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Moi ban nhap mang so nguyen: ");
        n = sc.nextInt();
        int mang1[] = new int[n];
        //input
        for(int i = 0;i< n;i++){
            System.out.printf("Nhap gia tri cho phan tu [%d] = ", i + 1);
            mang1[i] = sc.nextInt();
        }
        Arrays.sort(mang1);//sapxep
        System.out.println("Mang vua nhap da sap xep la: " + Arrays.toString(mang1));
        //min
        int min = mang1[0];
        for(int i =0;i<n;i++) {
            if(min > mang1[i]) {
                min = mang1[i];
            }
        }
        System.out.println("Phan tu nho nhat la: " + min);
        float count = 0;
        int tong = 0;
        for(int i = 0; i<n;i++){
            if(mang1[i] % 3 == 0){
                tong += mang1[i];
                count++;
            }
        }
        float avg = (float) tong / count;
        System.out.println("Trung binh cac so chia het cho 3 la: " + avg);
    }
}
