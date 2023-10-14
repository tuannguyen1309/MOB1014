/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Buoi3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
//1.OOP: Cach tao lop
//class : mo ta nhom doi tuong
//-Contructor:
    //không tham số: được gọi ngầm định khi class không có contructor
//2.Khởi tạo đối tượng
    //-khoogn tham số
    //-có tham số
    //->gọi phương thức, thuộc tính của 1 đối tượng
//3:ArrayList: Khởi tạo, nhập
//-Khởi tạo:
    //-thêm vào danh sách
    //-duyệt danh sách
public class Student {
    Scanner sc = new Scanner(System.in);
//trường = thuộc tính: đặc điểm 
    private String MSV;
    private String hoTen;
    private double diemTB;
    
    //public: có thể sử dụng công khai
    //private: chỉ sử dụng trong class
    
    //Contructor(alt+insert)

    public Student(String MSV, String hoTen, double diemTB) {
        this.MSV = MSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }
    public Student(){
        }
    
    //Phương thúc: hành động 
    public void nhap(){
        System.out.print("Nhap MSV: ");
        MSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diemTB: ");
        diemTB = sc.nextDouble();
    }
    
    public void xuat(){
        System.out.println(MSV + " - " + hoTen + " - " + diemTB);
    }
    
    //getter and setter(alt+insert)

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
}
