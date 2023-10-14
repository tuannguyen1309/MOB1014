/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class DoVatService {
    //Bước 3: Khởi tạo ArrayList<DoVat> và khởi tạo các phương thức Th chức năng
    //Bước cuối : Đi hoàn thiện 
    ArrayList<DoVat> listDV = new ArrayList<>();
    
    public void themDoVat(DoVat dv){
        listDV.add(dv);
    }
    
    public ArrayList<DoVat> xuatDoVat(){
        return listDV;
    }
    
    public ArrayList<DoVat> xoaDoVat(String ten){
        for (DoVat d : listDV) {
            if(d.getTenDoVat().equalsIgnoreCase(ten)){
                listDV.remove(d);
            }
        }
        return listDV;
    }
    public DoVat timDoVat(String ma){
        for (DoVat d : listDV) {
            if(d.getMaDoVat().equalsIgnoreCase(ma)){
                return d;
            }
        }
        return null;
    }
        
    public ArrayList<DoVat> sapXepMa(){
        Comparator<DoVat> cmp = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return o1.getMaDoVat().compareToIgnoreCase(o2.getMaDoVat());
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Collections.sort(listDV,cmp);
        return listDV;
    }
     public DoVat timDoVatGia(double bd,double kt){
        for (DoVat d : listDV) {
            if(d.getGia()>=bd&&d.getGia()<=kt){
                return d;
            }
        }
        return null;
    }
     
     public ArrayList<DoVat> sapXepGia(){
        Comparator<DoVat> cmp = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return Double.compare(o1.getGia(),o2.getGia());
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Collections.sort(listDV,cmp);
        Collections.reverse(listDV);
        return  listDV;
    }
    
    
    }
    
