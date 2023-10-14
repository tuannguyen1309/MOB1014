/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DanhSachSanPham_Bai3 {
    private ArrayList<SanPham_Bai3> list = new ArrayList<>();
    
    public void nhap(){
        int i=1;
        System.out.println("Nhap danh sach san pham");
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhap ten SP thu %d: ",i);
            String ten = sc.nextLine();
            if (ten == null || ten.equals("")) {
                break;
            }
            i++;
            System.out.print("Nhap gia san pham: ");
            double gia = sc.nextDouble();
            list.add(new SanPham_Bai3(ten, gia));
            sc.nextLine();
        } while (true);
    }
    
    public void xuat(){
        System.err.println("Danh sach san pham");
        System.out.println("Ten\t\t|Gia|t|t");
        for(SanPham_Bai3 sp: list){
            System.out.printf("%s | %.2f \n", sp.getTenSP(), sp.getGia());
            
        }
    }
    public void sapXep(){
        Comparator<SanPham_Bai3> comp = new Comparator<SanPham_Bai3>() {
            @Override
            public int compare(SanPham_Bai3 o1, SanPham_Bai3 o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        }
                Collections.sort(list, comp);
    }
    public void timVaXoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pahm can tim: ");
        String ten = sc.nextLine();
        
        SanPham_Bai3 sp =null;
              for(SanPham_Bai3 sp1 : list)  
              {
                  if(sp1.getTenSP().equals(ten)){
              }
              
    }
    
    public void menu(){
    Scanner sc = new Scanner(System.in);
    int chon = 0;
        do {            
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Sap xep san pham theo gia");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Tinh gia trung binh");
            System.out.println("0. thoat!!!");
            System.out.println("Moi ban chon");
            chon =sc.nextInt();
            if(chon!=0){
                switch (chon) {
                    case 0:
                        
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        sapXep();
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    default:{
                        
                    }
                }
            }
        } while (true);
}

}
