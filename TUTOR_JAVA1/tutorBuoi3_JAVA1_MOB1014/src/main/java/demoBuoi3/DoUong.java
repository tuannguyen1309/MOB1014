/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoBuoi3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DoUong {
    private String ma;
    private String ten;
    private double donGia;
    private int loai;
    
    public DoUong(){
    
}

    public DoUong(String ma, String ten, double dongGia, int loai) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = dongGia;
        this.loai = loai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDongGia() {
        return donGia;
    }

    public void setDongGia(double dongGia) {
        this.donGia = dongGia;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
    
    //1- thường 2-full topping
    public String checkLoai(int loai){
        if (loai==1) {
            return "Thuong";
        }else{
            return "Full Topping";
        }
    }
    public void inThongTIn(){
        System.out.println("Thong tin do uong");
        System.out.println("Ma: " + ma);
        System.out.println("Ten: "+ten);
        System.out.println("Gia: "+donGia);
        System.out.println("Loai: "+checkLoai(loai));
    }
    public void nhapThongTIn(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Moi ban nhap ma: ");
        ma = sc.nextLine();
        System.out.println("Moi ban nhap ten: ");
       ten =  sc.nextLine();
        System.out.println("Moi ban nhap don gia : ");
       donGia =  sc.nextDouble();
       sc.nextLine();
        while (true) {            
             System.out.println("Moi ban nhap loai (1-Thuong 2-Full Topping): ");
        loai= sc.nextInt();
        if(loai==1 || loai==2){
            break;
        }
        }
       
    }
}
