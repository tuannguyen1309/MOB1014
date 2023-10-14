/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tuannvph47183;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DoVat {
    private String maDoVat;
    private String tenDoVat;
    private int loai;
    private double gia;

    public DoVat() {
    }

    public DoVat(String maDoVat, String tenDoVat, int loai, double gia) {
        this.maDoVat = maDoVat;
        this.tenDoVat = tenDoVat;
        this.loai = loai;
        this.gia = gia;
    }

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

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
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
        System.out.println("Nhap ma: ");
        maDoVat=sc.nextLine();
        System.out.println("Nhap ten: ");
        tenDoVat=sc.nextLine();
        while (true) {            
            System.out.println("Nhap loai(0.Noi that-2.Ngoai that ): ");
            loai=Integer.parseInt(sc.nextLine());
            if(loai==0 || loai==2){
                break;
            }
        }
        System.out.println("Nhap gia: ");
        gia=Double.parseDouble(sc.nextLine());
    }
    
    public void xuat(){
        
    }
}
