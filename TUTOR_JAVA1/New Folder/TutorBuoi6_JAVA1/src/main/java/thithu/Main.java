/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        //Bước 4: Tao đối tượng DoVatService
        //Bước 5: Menu hòan thiện

        Scanner sc = new Scanner(System.in);
        ArrayList<DoVat> list = new ArrayList<>();
        DoVatService sv = new  DoVatService();
        while (true) {
            int chon;
            System.out.println("=====================menu==========");
            System.out.println("1.Nhap danh sach doi tuong");
            System.out.println("2.Xuat danh sach doi tuong");
            System.out.println("3.Tim theo ma");
            System.out.println("4.Xoa theo ten");
            System.out.println("5.Sap xep danh sach do vat theo ma tang dan");
            System.out.println("6.Tim theo khoang gia");
            System.out.println("7.Sap xep do vat theo gia giam dan");
            System.out.println("8.Ke thua");
            System.out.println("0.Thoat");
            System.out.println("Moi ban chon chuc nang (0 => 8): ");
            System.out.println("====================================");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 0:
                    System.out.println("Chao tam biet!!!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("\nBan chon chuc nang 1");
                    while (true) {                        
                        DoVat dv = new DoVat();
                        dv.nhap();
                        sv.themDoVat(dv);
                        System.out.println("Ban co muon nhap tiep khong(Y/N)");
                        String check = sc.nextLine();
                        if (check.equalsIgnoreCase("n")) {
//                            Object object = (Object) check;
                            break;
                            
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDanh sach do vat : ");
                    list = sv.xuatDoVat();
                    for (DoVat d : list) {
                        System.out.println("------------");
                        d.xuat();
                    }
                    break;
                case 3:
                    System.out.println("Tim theo ma");    
                    System.out.println("Moi ban nhap ma");    
                    String maTim = sc.nextLine();
                    DoVat dv = sv.timDoVat(maTim);
                    if(dv==null){
                        System.out.println("Khong ton tai");
                    }else{
                        System.out.println("do vat muon tim");
                        break;
                    }
                    
                    break;
                case 4:
                    System.out.println("Xoa theo ten");
                    System.out.println("Moi ban nhap ten muon xoa");
                    String tenXoa = sc.nextLine();
                    sv.xoaDoVat(tenXoa);
                    System.out.println("\nXoa thanh cong!!!");
                    System.out.println("Daanh sach do vat sau khi xoa");
                    list = sv.xuatDoVat();
                    for (DoVat d : list) {
                        System.out.println("------------");
                        d.xuat();
                    }
                    break;
                case 5:
                    System.out.println("\n\nSap xep ma");
                    ArrayList<DoVat> listSapXep = sv.sapXepMa();
                    System.out.println("List sau khi sap xep: ");
                    for (DoVat doVat : listSapXep) {
                        doVat.xuat();
                    }
                    break;
                case 6:
                    
                    break;
                case 7:

                    break;
//                case 8:
//                    DoHoaPhat dhp = new DoHoaPhat(maTim, tenXoa, chon, chon);
//                    dhp.xuat();
//                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
