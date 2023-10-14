/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MOB1014.Lab4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */ 

//class bao gom
//1.thuoc tinh
//2.get,set -> tu tao
//3.ham tao (constructor)->tu tao
//4.phuong thuc
public class Lab4_Bai1_2_3_4_SanPham {//dinh nghia lop
 //bai1   
    //thuoc tinh
    private String tenSP;//khai bao thuoc tinh ten
    private double donGia;//khai bao thuoc tinh gia
    private double giamGia;//khai bao thuoc tinh giamGia
    
    ////contructor
    
    /////////ham tao co ba tham so
    
    public Lab4_Bai1_2_3_4_SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP=tenSP;
        this.donGia=donGia;
        this.giamGia=giamGia;
        
    }
//Bai3
    //ham tao co hai tham so
    public Lab4_Bai1_2_3_4_SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0; //khong giam gia
    }

    //bai2
    //ham tao khong co tham so
    public Lab4_Bai1_2_3_4_SanPham() {
    }
    
 //bai1  
    //phuong thuc
    public double getThueNhapKhau(){//phuong thuc tinh thue nhap khau
        return donGia*0.1;//tra ve gia tri
    }
    public void xuatThongTIn(){//phuong thuc xuat thong tin
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
  //bai2  
    public void nhap(){//phuong thuc nhap thong tin
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
        
        System.out.println("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
  //Bai3  

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
        
}

