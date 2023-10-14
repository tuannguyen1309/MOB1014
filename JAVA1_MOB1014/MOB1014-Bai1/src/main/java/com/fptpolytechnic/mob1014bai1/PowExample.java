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

public class PowExample {
    public static void main(String[] args){
//        Khởi tạo Scanner
        Scanner input=new Scanner(System.in);
        System.out.println("Moi ban nhap so a: ");
//        Scan giá trị double từ bàn phím và truyền giá trị vào biến a
        double a = input.nextDouble();
        System.out.println("Moi ban nhap so b: ");
//        Scan giá trị double từ bàn phím và truyền giá trị vào biến b
        double b = input.nextDouble();
//        Tính lũy thừa a và b
        double result = Math.pow(a, b);
//        In kết quả ra màn hình
        System.out.println("A luy thua B bang : " + result);
//        Tính và đồng thời in kết quả giá trị nhỏ nhất giữa a và b ra màn hình
        System.out.println("Gia tri nho nhat cua A va B la: " + Math.min(a, b));
        
    
    }
    
}
