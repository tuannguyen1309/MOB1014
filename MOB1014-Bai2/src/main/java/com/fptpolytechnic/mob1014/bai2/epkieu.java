/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014.bai2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class epkieu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 5;
        double b = 9.4;
//        ép kiểu tự động
        b = a;
//        ép kiểu tường minh phần thập phân sẽ bỏ
        a = (int)b;
        System.out.println("" + b);    
        System.out.println("" + a);
    }
}
