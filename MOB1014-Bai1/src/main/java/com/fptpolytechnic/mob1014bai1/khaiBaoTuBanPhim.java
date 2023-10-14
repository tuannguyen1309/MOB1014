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
public class khaiBaoTuBanPhim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Moi ban nhap ten: ");
        String hoTen = input.nextLine();
        System.out.printf("Moi ban nhap tuoi: ");
        int tuoi = input.nextInt();
        System.out.printf( hoTen + " nam nay " + tuoi + " tuoi ");
        
    }
    
}
