/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.bai2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class lenhIF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double soDuong = 0;
        System.out.println("Vui long nhap so duong: ");
        soDuong=input.nextDouble();
        
        if(soDuong > 0){
            double ketQua = Math.sqrt(soDuong);
            System.out.printf("Can bac 2 cua so da nhap la:  %f\n", ketQua);
            
        }else{
            System.out.println("Vui long nhap so duong ");
        }
        
    }
}
