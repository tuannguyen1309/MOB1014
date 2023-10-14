/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuoi_va_bieu_thuc_chinh_qui_PHAN1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class demoSinhVien {
    public static void main(String[] args) {
        System.out.println("Danh sach menu");
        System.out.println("1.Nhap danh sach sinh vien");
        System.out.println("2.Xuat danh sach sinh vien");
        System.out.println("3.Thoat chuc nang");
        Scanner sc = new Scanner (System.in);
        System.out.println("Vui long chon menu: ");
        int menu = sc.nextInt();
        
        
        ArrayList<SinhVien> sinhVien=new ArrayList<SinhVien>();
        while (true) {            
            switch (menu) {
            case 1:
                System.out.println("Vui long nhap so luong sinh vien: ");
                int amount = sc.nextInt();
                for (int i = 0; i < amount; i++) {
                    System.out.printf("Vui long nhap ten sinh vien thu %d: ",i+1);
                    String ten = sc.nextLine();
                    sc.nextLine();
                    System.out.printf("Vui long nhap diem sinh vien thu %d: ", i +1);
                    float diem = sc.nextFloat();
                    
                    sinhVien.add(new SinhVien());
                }
                break;
            case 2:
                if(sinhVien.isEmpty()){
                    System.out.println("Danh sach trong: ");
                    break;
                }
                for(SinhVien sv : sinhVien){
                    sv.xuatSinhVien();
                }
            case 3:
                System.out.println("Thoat chuc nang");
                System.exit(0);
            default:
                System.out.println("");
        }
    }
        }
        
}
