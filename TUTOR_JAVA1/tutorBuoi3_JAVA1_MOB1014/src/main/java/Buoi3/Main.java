/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        int a;
        //khởi tạo 1 đối tượng sinh viên
        Student sv1 = new Student();
        Student sv2 =new Student("PH47183", "Nguyenviettuan", 10);
        
        //Nhap TT
        sv1.nhap();
        
        //Hiển thị thông tin
        sv1.xuat();
        
        //In ra một thông tin của đối tượng
        System.out.println("In ra MSV cua SV1: "  + sv1.getMSV());
        System.out.println("In ra diem TB cua SV1: "  + sv1.getDiemTB());
    }
}
