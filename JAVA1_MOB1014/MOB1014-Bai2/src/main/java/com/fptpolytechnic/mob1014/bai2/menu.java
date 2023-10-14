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
public class menu {
  
	/**
	 * Total price of the selected items.
	 */
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        char operator;

        // In menu
        System.out.println("Menu");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Thoát");
        System.out.print("Chọn phép toán: ");

        // Nhập lựa chọn của người dùng
        operator = scan.next().charAt(0);

        switch (operator) {
            case '1':
                // Nhập hai số
                System.out.print("Nhập số thứ nhất: ");
                num1 = scan.nextInt();
                System.out.print("Nhập số thứ hai: ");
                num2 = scan.nextInt();

                // Tính toán và in kết quả
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '2':
                // Nhập hai số
                System.out.print("Nhập số thứ nhất: ");
                num1 = scan.nextInt();
                System.out.print("Nhập số thứ hai: ");
                num2 = scan.nextInt();

                // Tính toán và in kết quả
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '3':
                // Thoát chương trình
                System.out.println("Thoát chương trình.");
                break;

            default:
                // Lựa chọn không hợp lệ
                System.out.println("Lựa chọn không hợp lệ.");
        }

        scan.close();
    }
}
