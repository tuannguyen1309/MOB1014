/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chuoi_va_bieu_thuc_chinh_qui_PHAN1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Nhập vào danh sách số thực ArrayList<Double>. 
Tính tổng và xuất ra màn hình

 * @author Dell
 */
public class MOB10114_Bai5 {

    public static void main(String[] args) {
        double tong = 0;
        ArrayList<Double>doubleArray = new ArrayList<Double>();
        System.out.print("Vui long nhap kich thuoc cua mang: ");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Moi ban nhap vao phan tu %d: " , i);
            double so=sc.nextDouble();
            doubleArray.add(so);
            sc.nextLine();
        }
        System.out.printf("Trung binh cong la %f", tong/arrayLength);
    }
}
