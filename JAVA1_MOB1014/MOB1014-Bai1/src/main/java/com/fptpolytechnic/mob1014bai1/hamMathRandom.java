/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014bai1;

import java.util.Scanner;

/**
 * Sinh số ngẫu nhiên từ 5 đến 12, và in ra màn hình
 * @author Dell
 */
public class hamMathRandom {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Số bắt đầu
        double startNumber=5;
//        Số ngẫu nhiên = 5 + 7 * khoảng từ 0 ->1
        double randomNumber= 5 + 7 * Math.random();
        System.out.println("Start number is: " + startNumber);
        System.out.println("Random number is: " + randomNumber);
        
        
        
    }
}
