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
public class Lab3_Bai4 {
    public static void sortSV(String sv[], float  diemSV[]){
        for(int i=0;i<sv.length - 1;i++){
            for(int j = i +1; j<sv.length;j++){
                if(diemSV[i] > diemSV[j]){
                    float temp = diemSV[i];
                    diemSV[i]=diemSV[j];
                    diemSV[j] = temp;
                    
                    String svTemp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = svTemp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String sv[] = new String[4];
        float diemSV[]=new float[4];
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<4;i++){
            System.out.printf("Nhap ten cho sinh vien thu [%d]: ", i +1);
            sv[i] = sc.nextLine();
            System.out.printf("Nhap diem cho sinh vien thu [%d]: ", i +1);
            diemSV[i] = sc.nextFloat();
            sc.nextLine();
        }
        System.out.println("\nMang sinh vien: " + Arrays.toString(diemSV));
        sortSV(sv, diemSV);
        for(int i=0;i<4;i++){
            System.out.println("Ho ten: " + sv[i]);
            System.out.println("Diem: " + diemSV[i]);
            if(diemSV[i] >=9){
                System.out.println("Hoc luc : Xuat Xac!!");
            }else if(diemSV[i] >=7.5){
                System.out.println("Hoc luc : Gioi!!");
            }else if(diemSV[i]>=6.5){
                System.out.println("Hoc luc : Kha!!");
            }else if(diemSV[i]>=5){
                System.out.println("Hoc luc : Trung binh!!");
            }else{
                System.out.println("Hoc luc : Yeu!!");
            }
            System.out.println("\n");
        }
    }
}
