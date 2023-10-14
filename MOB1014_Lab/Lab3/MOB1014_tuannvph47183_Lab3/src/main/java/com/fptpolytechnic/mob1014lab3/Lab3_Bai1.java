/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fptpolytechnic.mob1014lab3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lab3_Bai1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Moi ban nhap so nguyen: ");
         n = sc.nextInt();
        boolean ok = true;
        for(int i = 2; i<n-1;i++){
            if(n % i == 0){
                ok = false;
                break;
            }
         }
        if (ok == true){
                System.out.printf("%d la so nguyen to!!!",n);
            }
            else{
                System.out.printf("%d không  phai so nguyen to!!!",n);
            }
       
    }
}
