/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class menu_Bai2_TinhTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        
        do {            
            System.out.println("\n\n---------MENU-------------------");
            System.out.println("1.Thong tin truong hoc");
            System.out.println("2.Tinh trung binh");
            System.out.println("3.Ket thuc");
            System.out.println("---------------------------------");
            
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            sc.nextLine();
            
            switch (chon) {
                case 1:
                    System.out.println("1.THONG TIN TRUONG HOC");
                    System.out.println("Moi ban nhap ten truong: ");
                    String ten = sc.nextLine();
                    System.out.println("Moi ban nhap so luong giang vien: ");
                    int sl = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Moi ban nhap dia chi: ");
                    String diaChi=sc.nextLine();
                    String khoi;
                    if(sl>200){
                        khoi = "Dai Hoc";
                        
                    }
                    else if(sl>150){
                        khoi = "Cao Dang";
                    }
                    else if(sl>100){
                        khoi = "trung cap";
                    }
                    else{
                        khoi="cao hoc";
                    }
                    System.out.println("-------------------");
                    System.out.println("Ten truong : "+ten);
                    System.out.println("Khoi giang day: "+khoi);
                    System.out.println("Dia chi: "+diaChi);
                    break;
                case 2:
                    int n;
                    System.out.println("\n\n");
                    System.out.println("2.TINH  TRUNG BINH");
                    while (true) {                        
                        System.out.println("Moi ban nhap n: ");
                        n = sc.nextInt();
                        if(n>0){
                            break;
                        }
                    }
                    double tong = 0;
                    int dem = 0;
                    
                    for (int i = 0; i <=n; i++) {
                        if(i%2==0){
                            tong +=i;
                            dem++;
                        }
                    }
                    if(dem>0){
                        double tb = tong/dem;
                        System.out.println("Trung binh cac so chan tu 0 den n la: "+tb);
                    }
                    
                    break;
                case 3:
                    System.out.println("Tam biet!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chon dung chuc nang");
            }
        } while (true);
    }
}
