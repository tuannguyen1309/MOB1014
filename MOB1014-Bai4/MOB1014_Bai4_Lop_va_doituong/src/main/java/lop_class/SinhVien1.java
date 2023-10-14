/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lop_class;

import java.util.Scanner;

/**
 *Tạo lớp mô tả sinh viên bao gồm họ tên, điểm và các phương thức nhập, xuất và xếp loại học lực

 * @author Dell
 */
public class SinhVien1 {

    public String hoTen;
    public double diem;
    
    public void input(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Moi ban nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi ban nhap diem: ");
        this.diem = sc.nextDouble();
    }
   
    public void output(){
        System.out.printf("Ho ten la: %s\n", this.hoTen);
        System.out.printf("Diem la: %.2f\n", this.diem);
        System.out.printf("Xep loai: %s", this.xepLoai());
        
    }
    public String xepLoai(){
        if(this.diem>5){
            return "Gioi";
        }else{
            return "Chua gioi";
        }
    }
        
    }

