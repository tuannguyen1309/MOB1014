/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Split {
    public static void main(String[] args) {
        System.out.print("Vui long nhap chuoi day so phan cach boi dau phay: ");
        Scanner sc = new Scanner (System.in);
        String chuoiSo = sc.nextLine();
        //1,2,3,4,5
        String mangChuoiSo[] = chuoiSo.split(",");
        for(String so : mangChuoiSo){
            if(Integer.parseInt(so)  % 2 == 0){
                System.out.println("So nguyen chan la: " + so);
            }
        }
    }
}
