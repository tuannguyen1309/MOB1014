/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.bai2;

import java.util.Scanner;

/**
 *Nhập số từ bàn phím. 
Nếu số dương thì tính và xuất căn bậc 2 
của số đó ra màn hình

 * @author Dell
 */
public class SquareRoot {
    public static void main(String[] args) {
        //    Nhập từ bàn phím
    Scanner input = new Scanner(System.in);
//    Lưu số được nhập vào biến soDuocNhap
    double soDuocNhap = input.nextDouble();
    
//    Xét điều kiện cho số được nhập vào
    if (soDuocNhap > 0){
            System.out.println("" + Math.sqrt(soDuocNhap));
}
    }

    
}
