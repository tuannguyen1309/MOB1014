/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014bai3;

/**
 *Tính trung bình cộng các số chia 
hết cho 3 từ 27 đến 250.

 * @author Dell
 */
public class lapWhile_trungBinhCong {
    public static void main(String[] args) {
        int soBatDau = 27;
        int soKetThuc = 250;
      //khai báo biến chứa tổng các số chia hết cho 3
        int tong = 0;
        int soChiaHetCho3 = 0;
      //khai báo biến đếm cho vòng lặp
        int i = soBatDau;
        while (i <= soKetThuc) 
        {
            if (i % 3 == 0) 
            {
                tong += i;
                soChiaHetCho3++;
            }
           i += 3;
        }

        // Sau khi chạy xong vòng lặp, chúng ta sẽ có tổng của các số chia hết cho 3 từ 27-250
        // và số các số
        float trungBinhCong = (float) tong / soChiaHetCho3;
        System.out.printf("Ket qua là %.2f", trungBinhCong);
    }
}
