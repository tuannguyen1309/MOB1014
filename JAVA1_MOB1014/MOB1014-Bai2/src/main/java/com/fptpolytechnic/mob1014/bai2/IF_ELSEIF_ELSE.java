/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014.bai2;

import java.util.Scanner;

/** Viết chương trình tính thuế thu nhập. Giả sử thu nhập gồm lương và thưởng
 *
 * @author Dell
 */
public class IF_ELSEIF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap luong: ");
        double luong = sc.nextDouble();
        System.out.println("Vui long nhap thuong: ");
        double thuong = sc.nextDouble();
        double total = luong + thuong;
        
        if(total<9){
            System.out.println("Khong phai dong thue");
        } else if(total<15){
            System.out.println("Phai dong thue" + total * 10/100);
        } else if(total<30){
            System.out.println("phai dong thue" + total * 15/100);
        } else{
            System.out.println("phai dong thue" + total * 20/100);
        }
    }
}
