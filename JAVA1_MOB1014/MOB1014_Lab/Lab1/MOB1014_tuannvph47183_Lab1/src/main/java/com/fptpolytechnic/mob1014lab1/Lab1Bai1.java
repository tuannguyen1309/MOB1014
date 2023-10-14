/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014lab1;

import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Lab1Bai1 {

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoTen =sc.nextLine();
        System.out.print("Diem TB: ");
        double diemTB=sc.nextDouble();
        
        System.out.printf("%s %.1f diem", hoTen, diemTB );
    }
}
