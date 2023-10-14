/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class QlySinhVien {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        //khởi tạo danh sách ArrayList nắm giữ danh sách sinh viên
        ArrayList<Student> dsQlySinhVien = new ArrayList<>();
        
        //Thêm sinh viên vào danh sách
        System.out.println("NHAP THONG TIN SINH VIEN\n======\n");
        do {            
            //tạo 1 đối tượng sinh viên
            Student svNew = new Student();
            //Nhập thông tin cho đối tượng sinh viên vừa tạo
            svNew.nhap();
            //Adds
            dsQlySinhVien.add(svNew);
            //Hỏi có tiếp tục không
            System.out.println("Ban co muon nhap tiep khong(Y/N): ");
            if(sc.nextLine().equalsIgnoreCase("N")){
                break;
            }
        
        } while (true);
        
        //hiển thị danh sách sinh viên
//        System.out.println("HIEN THI DANH SACH SINH VIEN\n=====\n");
//        for (Student sv : dsQlySinhVien) {
//            sv.xuat();
//        }
//        
//        //tìm kiếm và in ra thông itn sinh viên
//        /*Nguyên tắc: nhạp vào thông tin muốn tìm
//        -Kiểm tra xem trong danh sách có đối tượng nào chứa thông tin cần tìm không (dùng if)
//        =>Nếu có thì thực hiện thao taccs với đối tượng tìm được
//        */
//        System.out.println("========tim ra thong tin sv");
//        String maSv;
//        System.out.print("Nhap vao msv can tim: ");
//        maSv = sc.nextLine();
//        int dem=0;
//        for(Student sv : dsQlySinhVien){
//            if(sv.getMSV().equalsIgnoreCase(maSv)){
//                sv.xuat();
//                dem++;
//            }
//        }
//        if(dem==0){
//            System.out.println("Khong tim thay sv co ma nhu tren");
//        }
        //1.tìm kiếm và sửa
//        System.out.println("========tim va sua thong tin sv");
//            //nhap vao ma can tim
//        System.out.println("Nhap vao ma sinh vien can sua: ");
//        String maSv = sc.nextLine();
//            //tim sv co maSV tuong ung
//        for (Student sv: dsQlySinhVien) {
//            //tim duoc thi sua
//            if(sv.getMSV().equalsIgnoreCase(maSv)){
//                sv.nhap();
//            }
//        }
//            //in ra DS de KT xem cap nhat dc ko
//         for (Student student : dsQlySinhVien) {
//            student.xuat();
//        }
   
    
        //2.tìm kiếm và xóa
//        System.out.println("========tim va xoa thong tin sv theo ma sv");
//            //Nhap MSV can xoa
//        System.out.println("Nhap MSV can xoa: ");
//        String maSv = sc.nextLine();
//            //Tim va xoa SV co ma = MSV nhap vao
//     
//            for (int i = 0; i < dsQlySinhVien.size(); i++) {
//                    //Neu tim thay thi thuc hien xoa
//                if (dsQlySinhVien.get(i).getMSV().equalsIgnoreCase(maSv)) {
//                    dsQlySinhVien.remove(i);
//                }
//        }
//            
//            //In DS sau khi xoa
//         for (Student student:dsQlySinhVien){
//             student.xuat();
//         }   
    
        //3.sắp xếp theo Alphab(bảng chữ cái)-tăng dần
        System.out.println("========sap xep tang dan sv theo ma sv ");
            //ghi đè PT compare
         Comparator<Student> comp = new Comparator<Student>(){
             @Override
             public int compare(Student o1, Student o2){
                 return o1.getMSV().compareTo(o2.getMSV());
                 //throw new UnsupportedOperationException("Not supported yet.");
             }
         };
                //sắp xếp theo pt vừa ghi đè
            dsQlySinhVien.sort(comp);
                //In ra DS sau SX
             for (Student student : dsQlySinhVien) {
                 student.xuat();
        }
   
        //sắp xếp theo giá trị -tăng dần
        System.out.println("========sap xep thong tin sv theo diem tb ");
            Comparator<Student> compDiem = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getDiemTB()>o2.getDiemTB()) {
                    return 1;
                }else if(o1.getDiemTB()<o2.getDiemTB()){
                    return -1;
                }else{
                    return 0;
                }
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            };
                //Sap xep => tang dan
            dsQlySinhVien.sort(compDiem);
                //sap xep giam dan => dao lai danh sach
             Collections.reverse(dsQlySinhVien);
            for (Student student : dsQlySinhVien) {
            student.xuat();
        }
    }
}
