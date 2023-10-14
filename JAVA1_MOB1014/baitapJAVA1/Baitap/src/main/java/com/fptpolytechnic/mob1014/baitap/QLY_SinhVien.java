package com.fptpolytechnic.mob1014.baitap;

import java.util.*;

public class QLY_SinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();

        // Nhập thông tin sinh viên
        do {
            SinhVien svNew = new SinhVien();

            svNew.nhap();

            list.add(svNew);

            System.out.println("Bạn có muốn nhập tiếp không(Y/N)");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        } while (true);

        // Sắp xếp tăng dần theo điểm
        list.sort(Comparator.comparingDouble(SinhVien::getDiem));

        // Xuất danh sách sinh viên đã sắp xếp
        System.out.println("--------------------------");
        System.out.println("Danh sách sinh viên đã sắp xếp tăng dần theo điểm:");
        for (SinhVien sv : list) {
            System.out.println(sv.getTen() + " - " + sv.getDiem());
        }
    }
}
