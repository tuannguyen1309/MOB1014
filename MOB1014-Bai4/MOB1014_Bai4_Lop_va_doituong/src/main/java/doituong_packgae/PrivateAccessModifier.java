/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong_packgae;

/**
 *
 * @author Dell
 */
public class PrivateAccessModifier {
    public static void main(String[] args) {
        
    TinhDongGoi tinhDongGoi = new TinhDongGoi(System.in);
    tinhDongGoi.ten ="Tuan";
    tinhDongGoi.tuoi =19;
    tinhDongGoi.namSinh =2004;
    tinhDongGoi.gioiTinh="Nam";
    tinhDongGoi.setTuoi(25);
    }
}
