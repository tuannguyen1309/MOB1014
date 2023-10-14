/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014bai3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ngatBreak {
    public static void main(String[] args) {
        int diem = 0;
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("nhap diem:");
            diem = sc.nextInt();
            if(diem > 0 && diem<=10){
                break;
            }
            System.out.println("Vui long nhap diem tu 0 den 10");
        }
    }
}
