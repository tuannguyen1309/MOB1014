/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob101lab2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab2_Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap he so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap he so b: ");
        double b = sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }
            else{
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        }
        else{
            double x = -b/a;
            System.out.println("Phuong trinh co nghiem la x= " + x);
        }
    }
}
