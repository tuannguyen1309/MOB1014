/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014bai1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class diemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Moi ban nhap a: ");
        double a = scanner.nextDouble();
        System.out.printf("Moi ban nhap b: ");
        double b = scanner.nextDouble();
        System.out.printf("Moi ban nhap c: ");
        double c = scanner.nextDouble();
        System.out.print("Diem trung binh la: " +(a * 2 + b + c )/4);
    }
    
}
