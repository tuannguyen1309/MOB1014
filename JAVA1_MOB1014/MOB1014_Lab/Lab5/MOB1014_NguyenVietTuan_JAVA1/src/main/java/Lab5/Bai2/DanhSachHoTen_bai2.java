/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

public class DanhSachHoTen_bai2 {
    
    private  ArrayList<String> ds = new ArrayList<>();
    
    public void nhap(){
        ds.clear();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap danh sach hoc ten");
        while (true) {            
            System.out.print("Nhap ho ten:");
            String ten = sc.nextLine();
            if(ten.isEmpty()){
                System.out.println("Nhap du lieu thanh cong!!");
                break;
            }
            ds.add(ten);
        }
        
    }
    public void xuat(){
        System.out.println("------------------------------");
        for (String item : ds){
            System.out.println(item);
        }
    }
    public void xuatNgauNhien(){
        Collections.shuffle(ds);
        xuat();
    }
    public void sapXep(){
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    public void xoa(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap vao ten muon xoa: ");
        String hoTen = sc.nextLine();
        
        for(String item : ds){
            if(item.equalsIgnoreCase(hoTen)){
                ds.remove(item);
                System.out.println("Xoa ho ten thanh cong!!!");
                break;
            }
        }
    }
    public void menu(){
        Scanner sc = new Scanner (System.in); 
        int chon = 0;
        do {            
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach ho ten");
            System.out.println("2. Hien thi danh sach ho ten");
            System.out.println("3. Sap xep ngau nhien");
            System.out.println("4. Sap xep");
            System.out.println("5. Xoa");
            System.out.println("6. Thoat");
            System.out.print("Moi ban chon: ");
            chon=sc.nextInt();
            switch (chon) {
                case 0:break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
            }
        } while (chon !=0);
    }
}
