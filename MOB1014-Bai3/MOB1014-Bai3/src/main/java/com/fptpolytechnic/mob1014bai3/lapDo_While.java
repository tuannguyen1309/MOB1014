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
public class lapDo_While {
    public static void main(String[] args) 
    {
        
        int diem=0;
            Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Vui long nhap diem:");
            diem=sc.nextInt();
        }while(diem < 0 || diem > 10);
        System.out.printf("Diem da nhap la %d ",diem);
    
    }
}
