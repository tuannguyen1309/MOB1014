/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QlySinhVien;

/**
 *
 * @author Dell
 */
public class SinhVien {
     // Khai báo 2 biến với Đặc tả truy xuất  private
    private String hoTen;
    private Float diem;

    public SinhVien(String hoTen, float diem){
      this.hoTen = hoTen;
      this.diem = diem;
    }
    
    public String getHoTen() {
      return this.hoTen;
    }
    public void setHoTen(String value) {
      this.hoTen = value;
    }

    public Float getDiem() {
      return this.diem;
    }
    public void setDiem(float value) {
      this.diem = value;
    }
    public void xuatSinhVien() {
      System.out.println(this.getHoTen() + " " + this.getDiem() + "\n");
    }
}
