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
public class Lab2_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi ban nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Moi ban nhap c: ");
        double c = sc.nextDouble();
        
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }
            else{
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        }
        else{
             double Delta = b*b-4*a*c;
             if(Delta<0){
                 System.out.println("Phuonng trinh vo nghiem");
             }
             else if(Delta == 0){
                 System.out.println("Phuong trinh co nghiem kep x = " + -b/(2*a));
             }
             else{
                 double x1 = (-b + Math.sqrt(Delta))/ (2 * a);
                 double x2 = (-b - Math.sqrt(Delta))/ (2 * a);
                 System.out.println("Phuong trinh co hai nghiem x1 = " + x1 + " va x2 = " + x2);
             }
         }   
    }
}
