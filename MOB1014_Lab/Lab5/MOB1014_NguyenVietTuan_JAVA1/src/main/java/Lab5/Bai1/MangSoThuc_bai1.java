/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MangSoThuc_bai1 {
    private ArrayList<Double> list = new ArrayList<>();
    
    public void nhap(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Nhap danh sach so thuc");
        while (true) {            
            System.out.print("Nhap so: ");
            Double x= sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.print("Nhp tiep du lieu (Y/N): ");
            if(sc.nextLine().equals("N"))
                break;
        }
    }
    public void hienThi(){
        System.out.println("------------------------");
        for(Double item : list){
            System.out.print(" " + item);
        }
    }
    
    public void tinhTong(){
    double tong = 0;
    for (Double item : list){
        tong += item;
    }
        System.out.println();
        System.out.println("Tong: " + tong);
}
}
