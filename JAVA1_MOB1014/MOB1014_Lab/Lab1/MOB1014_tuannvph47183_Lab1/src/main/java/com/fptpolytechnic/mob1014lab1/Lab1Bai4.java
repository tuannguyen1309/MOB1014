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
public class Lab1Bai4 {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Tinh phuong trinh bac 2 \nAx2 + Bx + C = 0");
        float a, b, c;
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        System.out.print("Nhap c: ");
        c = sc.nextFloat();
        
        float delta= (float) Math.pow(b, 2) -(4*a*c);
        System.out.println("Can delta la: " + Math.sqrt(delta));
       }   
    }

        
    
    
    

