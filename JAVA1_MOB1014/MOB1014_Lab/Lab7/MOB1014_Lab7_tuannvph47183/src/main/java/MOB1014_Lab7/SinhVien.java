/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOB1014_Lab7;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class SinhVien {
    private String hoVaTen;
    private double diem;
    
    
    public SinhVien() {

    }
    public SinhVien(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public SinhVien(String hoVaTen, double diem) {
        this.hoVaTen = hoVaTen;
        this.diem = diem;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien:");
        hoVaTen = sc.nextLine();
        System.out.println("Nhap diem:");
//        diem = Double.parseDouble(sc.nextLine());
        diem = sc.nextDouble();

    }

    public void xuat() {
        System.out.print("Ten:" + hoVaTen);
        System.out.print("Diem:" + diem);
    }
}
