/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fptpolytechnic.mob1014assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DanhSachNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();
    
    public void nhap(){
        do {            
            Scanner sc =new Scanner (System.in);
            System.out.print("Nhap ma sinh vien: ");
            String ID =sc.nextLine();
            if(ID.equals("") || ID == null){
                break;
            }
            System.out.println("Nhap ho va ten nhan vien: ");
            String name = sc . nextLine();
            System.out.println("Nhap  luong co ban: ");
            double luongCoBan = sc.nextDouble();
            System.out.print("Ban thuoc phong ban nao (Hanh chinh/ Kinh doanh): ");
            String phongBan = sc.nextLine();
            if(phongBan.equalsIgnoreCase("Hanh chinh")){
                System.out.print("Nhap ngay cong: ");
                double ngayCong = sc.nextDouble();
                
                NhanVien newNV = new NhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            }else if(phongBan.equalsIgnoreCase("Kinh doanh")){
                System.out.print("Nhap luong kinh doanh: ");
                double luongKinhDoanh = sc.nextDouble();
                NhanVien newNV = new NhanVienKinhDoanh(ID, name, luongCoBan, phongBan, luongKinhDoanh );
                list.add(newNV);
            }else {
                System.out.println("Vui long nhap lai phong ban va cac thong tin khac!");
            }
            
        } while (true);
    }
    public void xuat(){
        for (NhanVien nv: list){
            System.out.printf("Ma nhan vien: %s | Ho ten: %s | Phong ban: %s | Luong: %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }
    public void menuu(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do{
            System.out.println("\nMENU chuong trinh");
            System.out.println("Y1. Nhap danh sach nhan vien");
            System.out.println("Y2. Xuat danh sach sinh vien");
            System.out.println("Y3. Tim va hien thi nhan vien theo ma");
            System.out.println("Y4. Xoa nhan vien theo ma");
            System.out.println("0. Thoat chuc nang");
            System.out.print("Moi ban chon");
            
            chon = sc.nextInt();
            if(chon !=0){
                switch(chon){
                case 0: 
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3: 
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Nhap sai, nhap lai!!!");
                }
                
            }
        }while(chon !=0);
    }
}
