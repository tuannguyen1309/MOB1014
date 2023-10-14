/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DoVat {
    //thuộc tính
    private String maDoVat;
    private String tenDoVat;
    private int loai;
    private double gia;

    //contructor không tham số
    public DoVat() {
    }
    
    //contructor có tham số
    public DoVat(String maDoVat, String tenDoVat, Integer loai, double gia) {
        this.maDoVat = maDoVat;
        this.tenDoVat = tenDoVat;
        this.loai = loai;
        this.gia = gia;
    }
    
    //getter&setter
    public String getMaDoVat() {
        return maDoVat;
    }

    public void setMaDoVat(String maDoVat) {
        this.maDoVat = maDoVat;
    }

    public String getTenDoVat() {
        return tenDoVat;
    }

    public void setTenDoVat(String tenDoVat) {
        this.tenDoVat = tenDoVat;
    }

    public Integer getLoai() {
        return loai;
    }

    public void setLoai(Integer loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Moi ban nhap ma : ");
        maDoVat=sc.nextLine();
        System.out.println("Moi ban nhap ten : ");
        tenDoVat=sc.nextLine();
        sc.nextLine();
        while (true) {            
            System.out.println("Moi ban nhap loai (0.noi that - 2.ngoai that): ");
            loai=Integer.parseInt(sc.nextLine());
            if(loai == 0 || loai==2){
                break;
            }
        }
        System.out.println("Moi ban nhap gia: ");
        gia=Double.parseDouble(sc.nextLine());
        
    }
    public void xuat(){
        System.out.println("Ma : " + maDoVat);
        System.out.println("Ten : "+tenDoVat);
        if(loai==0){
            System.out.println("Loai : Noi that");
        }else{
            System.out.println("Loai : Ngoai that");
        }
        System.out.println("Gia: " +gia );
    }
}
