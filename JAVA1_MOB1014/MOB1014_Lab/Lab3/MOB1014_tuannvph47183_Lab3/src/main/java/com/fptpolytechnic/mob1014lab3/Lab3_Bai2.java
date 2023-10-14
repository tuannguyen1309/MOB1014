/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014lab3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab3_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<10; i++)
        {
            for(int j = 1; j<11;j++)
             {
                System.out.printf("%d x %d = %d", i, j, i*j);
                System.out.println("");
            }
                System.out.println("\n");
        }
        
      }       
    }

