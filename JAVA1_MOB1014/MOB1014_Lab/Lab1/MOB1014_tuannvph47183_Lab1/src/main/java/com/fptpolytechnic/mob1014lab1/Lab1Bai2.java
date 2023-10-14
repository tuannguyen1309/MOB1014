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
public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap chieu dai: ");
        double dai=scanner.nextDouble();
        System.out.println("Moi ban nhap chieu rong: ");
        double rong=scanner.nextDouble();
        double chuVi =( dai + rong )*2;
        double dienTich = dai * rong;
        double canhNho=Math.min(dai, rong);
        System.out.println("Ket qua cua chu vi la: " + chuVi);
        System.out.println("Ket qua cua dien tich la: " + dienTich);
        System.out.println("Canh nho cua hinh chu nhat la: " + canhNho);
        
        
    }
}
