package Bai3;

import java.util.Scanner;

public class SinhVien {

    private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public SinhVien() {

    }

    public SinhVien(String hoTen, String email, String phone, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        Data ds = new Data();

        // Nhập họ tên
        do {
            System.out.print("Nhap ho ten: ");
            hoTen = sc.nextLine();
            if (hoTen == null || hoTen.trim().isEmpty()) {
                System.out.println("Ho ten khong hop le!!!");
            } else {
                break;
            }
        } while (true);

        // Nhập email
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            if (!ds.isEmail(email)) {
                System.out.println("Email khong hop le!!!");
            } else {
                break;
            }
        } while (true);

        // Nhập số điện thoại
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine();
            if (!ds.isPhone(phone)) {
                System.out.println("So dien thoai khong hop le!!!");
            } else {
                break;
            }
        } while (true);

        // Nhập số CMND
        do {
            System.out.print("Nhap so CMND: ");
            cmnd = sc.nextLine();
            if (!ds.isCMND(cmnd)) {
                System.out.println("So CMND khong hop le!!!");
            } else {
                break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.printf("Ho ten: %s - Email: %s - SDT: %s - CMND: %s\n", hoTen, email, phone, cmnd);
    }
}
