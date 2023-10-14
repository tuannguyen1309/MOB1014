/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (true) {
            System.out.println("-------------MENU---------");
            System.out.println("1: Nhap danh sach sinh vien");
            System.out.println("2: Tim kiem sinh vien theo ten");
            System.out.println("0: Thoat");
            System.out.println("-----------------------------");
            System.out.print("Moi chon chuc nang:");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhap thong tin:");
                    while(true){
                        SinhVien sv=new SinhVien();
                        sv.nhap();
                        System.out.println("Ban co muon nhap tiep khong(Y/N");
                        String check=sc.nextLine();
                        if(check.equalsIgnoreCase("N")){
                            break;
                        }
                    }
                    
                    
                    break;
                case 2:
                    
                    System.out.println("Nhap ten sinh vien:");
                    String tenCanTim=sc.nextLine(); 
                    for (SinhVien sinhVien : listSV) {
                        if(sinhVien.getTen().toLowerCase().contains(tenCanTim.toLowerCase())){
                            System.out.println("Sinh vien can tim la:"+sinhVien.getTen());
                        }
                    }
                    
                    break; 
                case 0:
                    System.out.println("chao ban");
                    System.exit(0);
                    break;
                default : 
                    System.out.println("Nhap sai chuc nang. Cn(0,1,2)");
            }

        }
    }
}
