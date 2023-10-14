/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Sort {
    public static void main(String[] args) {
        String hT[]=new String[5];
        Scanner sc = new Scanner (System.in);
        
        for(int i =0;i<5;i++){
           hT[i]=sc.nextLine();
        }
        Arrays.sort(hT);
        for(String x:hT){
            System.out.printf("%s\n",x);
        }
    }
}
