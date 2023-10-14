/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoBuoi4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Friend {
    private String ten;
    private String GTinh;
    private int tuoi;
    private String sdt;
    
    //Khởi tạo contructor
    public Friend(){
        
    }

    public Friend(String ten, String GTinh, int tuoi, String sdt) {
        this.ten = ten;
        this.GTinh = GTinh;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }
    //getter and setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGTinh() {
        return GTinh;
    }

    public void setGTinh(String GTinh) {
        this.GTinh = GTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void nhapTT(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Moi ban nhap ten: ");
        ten=sc.nextLine();
        System.out.println("Moi ban nhap gioi tinh: ");
        GTinh=sc.nextLine();
        System.out.println("Moi ban nhap tuoi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap so dien thoai: ");
        sdt=sc.nextLine();
    }
    public void inTT(){
        System.out.println("Ten: "+ten);
        System.out.println("Gioi tinh: "+GTinh);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("SDT: "+sdt);
    }
}
