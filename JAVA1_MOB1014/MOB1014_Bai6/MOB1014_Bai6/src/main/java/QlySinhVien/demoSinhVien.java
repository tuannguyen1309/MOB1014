/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QlySinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class demoSinhVien {

    public static void main(String[] args) {
        System.out.println("Danh sách menu: ");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên");
        System.out.println("3. Sắp xếp danh sách theo điểm");
        System.out.println("4. Sắp xếp danh sách theo tên");
        System.out.println("5. Xuất danh sách sinh viên theo khoảng điểm");
        System.out.println("6. Tìm kiếm sinh viên theo họ tên");
        System.out.println("7. Xuất tên in hoa những sinh viên có họ Nguyễn hoặc tên Tuấn");
        System.out.println("8. Xuất những sinh viên có tên lót là Mỹ");
        System.out.println("9. Xuất những sinh viên có tên lót là Mỹ");
        System.out.println("10. Thoát");

        Scanner scanner = new Scanner(System.in);
//         System.out.print("Vui lòng chọn menu: ");
//         int menu = scanner.nextInt();
//         scanner.nextLine();
        ArrayList<SinhVien> sinhViens = new ArrayList<SinhVien>();
        sinhViens.add(new SinhVien("Nguyen Van A", 4));
        sinhViens.add(new SinhVien("B Van E", 5));
        sinhViens.add(new SinhVien("D Thi D", 8));
        sinhViens.add(new SinhVien("A Van B", 1));
        sinhViens.add(new SinhVien("Nguyen Van F", 0));

        while (true) {
            System.out.print("Vui lòng chọn menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("Vui lòng nhập số lượng sinh viên: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < amount; i++) {
                        System.out.printf("Vui lòng nhập tên sinh viên thứ %d: ", i + 1);
                        String ten = scanner.nextLine();
                        System.out.printf("Vui lòng nhập điểm sinh viên thứ %d: ", i + 1);
                        float diem = scanner.nextFloat();
                        scanner.nextLine();
                        sinhViens.add(new SinhVien(ten, diem));
                    }
                    break;
                case 2:
                    if (sinhViens.isEmpty()) {
                        System.out.println("Danh sách trống");
                        break;
                    }
                    for (SinhVien sv : sinhViens) {
                        sv.xuatSinhVien();
                    }
                    break;
                case 3:
                    Comparator<SinhVien> compSinhVien = new Comparator<SinhVien>() {
                        @Override
                        public int compare(SinhVien sv1, SinhVien sv2) {
                            return sv1.getDiem().compareTo(sv2.getDiem());
                        }
                    };
                    Collections.sort(sinhViens, compSinhVien);
                    break;
                case 4:
                    Comparator<SinhVien> compSinhVienTen = new Comparator<SinhVien>() {
                        @Override
                        public int compare(SinhVien sv1, SinhVien sv2) {
                            return sv1.getHoTen().compareTo(sv2.getHoTen());
                        }
                    };
                    Collections.sort(sinhViens, compSinhVienTen);
                    break;
                case 5:
                    System.out.println("Vui lòng nhập khoảng điểm a <= diem <= b");
                    System.out.print("Vui lòng nhập a: ");
                    float gioiHanDuoi = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Vui lòng nhập b: ");
                    float gioiHanTren = scanner.nextFloat();
                    scanner.nextLine();
                    for (SinhVien sv : sinhViens) {
                        if (gioiHanDuoi <= sv.getDiem()
                                && sv.getDiem() <= gioiHanTren) {
                            sv.xuatSinhVien();
                        }
                    }
                case 6:
                    System.out.print("Vui lòng nhập họ tên cần tìm: ");
                    String hoTenCanTim = scanner.nextLine();
                    for (SinhVien sv : sinhViens) {
                        if (sv.getHoTen().toLowerCase()
                                .contains(hoTenCanTim.toLowerCase())) {
                            sv.xuatSinhVien();
                        }
                    }
                    break;
                case 7:
                    for (SinhVien sinhVien : sinhViens) {
                        if (sinhVien.getHoTen().startsWith("Nguyễn")
                                || sinhVien.getHoTen().endsWith("Tuấn")) {
                            System.out.println(sinhVien.getHoTen().toUpperCase());
                        }
                    }
                case 8:
                    for (SinhVien sinhVien : sinhViens) {
                        if (sinhVien.getHoTen().contains("Mỹ")) {
                            String hoTen = sinhVien.getHoTen();
                            int index = hoTen.lastIndexOf(" ");
                            String tenSinhVien = hoTen.substring(index + 1);
                            System.out.println(tenSinhVien);
                        }
                    }
                case 10:
                    System.exit(1);
                    break;
            }
        }
    }
}
