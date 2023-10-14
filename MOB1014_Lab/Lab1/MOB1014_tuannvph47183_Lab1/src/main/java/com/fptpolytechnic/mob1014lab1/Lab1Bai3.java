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
public class Lab1Bai3 {
    public static void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap canh cua khoi lap phuong: ");
        double canh=scanner.nextDouble();
        double theTich=canh*canh*canh;
//        double theTich=Math.pow(canh,3 );
        System.out.println("The tich cua khoi lap phuong la: " + theTich);
    }
            
}
