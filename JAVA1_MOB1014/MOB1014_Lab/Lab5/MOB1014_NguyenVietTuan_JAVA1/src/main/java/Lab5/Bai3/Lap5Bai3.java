/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Lap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Lap5Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<>();
        int chon;

        do {
            System.out.println("==============================Menu=================|");
            System.out.println("| 1: Nhap danh sach san pham                       |");
            System.out.println("| 2: Sap xep giam dan va xuat ra man hinh          |");
            System.out.println("| 3: Tim va xoa san pham theo ten nhap tu ban phim |");
            System.out.println("| 4: Xuat gia trung binh cua cac san pham          |");
            System.out.println("| 5: Ket thuc                                      |");
            System.out.println("Moi chon chuc nang:");
            chon = sc.nextInt();

            switch (chon) {
                case 1: {

                    System.out.print("Nhap so luong san pham:");
                    int n = sc.nextInt();
                    
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap ten san pham thu " + (i + 1) + ":");
                        String ten = sc.nextLine();
                        System.out.print("Nhap gia san pham thu " + (i + 1) + ":");
                        double donGia = sc.nextDouble();
                        list.add(new SanPham(ten, donGia));
                    }

                }
                break;
                case 2: {

                  Collections.sort(list, new Comparator<SanPham>() {
                  @Override
                   public int compare(SanPham o1, SanPham o2) {
                   return -Double.compare(o1.donGia, o2.donGia);
                   }
                 } );
 
                         System.out.println("Danh sach san pham sau khi sap xep:");
                  for (SanPham sp : list) {
                         System.out.println(sp);
                 }

                }
                break;
                case 3: {

                    System.out.print("Nhap ten san pham can xoa:");
                    String tenXoa = sc.nextLine();

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).ten.equals(tenXoa)) {
                            list.remove(i);
                            break;
                        }
                    }

                    System.out.println("Xoa thanh cong!");

                }
                break;
                case 4: {

                    double total = 0;
                    for (SanPham sp : list) {
                        total += sp.donGia;
                    }

                    System.out.println("Gia trung binh cac san pham la: " + total / list.size());

                }
                break;
                case 5:
                    System.out.println("Ket thuc!");
                    System.exit(0);
                default:
                    System.out.println("Nhap sai vui long nhap lai");
                    break;
            }
        } while (chon != 5);
    }
}

class SanPham {

    String ten;
    double donGia;

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "ten='" + ten + '\'' +", donGia=" + donGia +'}';
    }
}