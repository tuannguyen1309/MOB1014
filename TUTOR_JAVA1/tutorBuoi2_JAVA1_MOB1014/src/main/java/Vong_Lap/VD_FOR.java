/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vong_Lap;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class VD_FOR {
    public static void main(String[] args) {
        //thuc hien nhap n vao tu ban phim.Tinh tong cac so chan tu 3 den n
        Scanner sc =new Scanner(System.in);
        //khaibao
        int n, tong=0;
        //Nhap gtri cho n
        System.out.println("Nhap n =");
        n = sc.nextInt();
        
        //tinh tong cac so tu 3 den n
            //1.duyet va kiem tra tung so 1 tu 3 den n
         for (int i = 3; i <=n; i++) {
            //2.Kiem tra cac so do trong khoang tu 3 den n
                //So chan thi cong vao tong
            if(i%2==0){
//                tong = tong +i;
                tong +=i;
            }
        }
        System.out.printf("Tong cac so chan tu 3 den n la: %d\n",tong);
    }
}
