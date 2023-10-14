/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi_va_bieu_thuc_chinh_qui_PHAN1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Trao_Cau_Hoi_Co_Ep_Kieu {
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
        for(Object x: cauHoi){
            String a = (String) x;
            System.out.println(a);
        }
    }
}
