/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DSPerson {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            Person ps = new Person();
            ps.nhap();
            list.add(ps);
            
        }
        System.out.println("-=========================-");
        for (Person ps : list) {
            ps.xuat();
            
        }
        System.out.println("-=========================-");
        for (Person ps : list) {
             if(ps.getTen().equalsIgnoreCase("Tuan")){
                ps.xuat();
                System.out.println();
            }
        }
    }
}
