/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi_va_bieu_thuc_chinh_qui_PHAN1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *Nhập danh sách 5 câu hỏi. Tráo ngẫu 
nhiên và xuất danh sách câu hỏi đã tráo

 * @author Dell
 */
public class Arraylist_nangCao_TraoCauHoi {
    public static void main(String[] args) {
        ArrayList<String> cauHoi = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap cau hoi: ");
            cauHoi.add(sc.nextLine());
        }
//        Trao ngau nhien cac cau hoi
        Collections.shuffle(cauHoi);
//        Xuat danh sach cac cau hoi
        for(String x: cauHoi){
            System.out.println(x);
        }
    }
}
