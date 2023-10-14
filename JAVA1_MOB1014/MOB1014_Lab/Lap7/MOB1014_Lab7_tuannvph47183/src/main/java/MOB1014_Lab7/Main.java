/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MOB1014_Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<SinhVien> listSV = new ArrayList<>();
        while (true) {
            System.out.println("-------------MENU---------");
            System.out.println("1: Nhap danh sach sinh vien");
            System.out.println("2: Tim kiem sinh vien theo ten");
            System.out.println("0: Thoat");
            System.out.println("-----------------------------");
            System.out.print("Moi chon chuc nang:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin:");
                    while (true) {
                        SinhVien sv = new SinhVien();
                        sv.nhap();
                        listSV.add(sv);
                        System.out.println("Ban co muon nhap tiep khong(Y/N)");
                        String check = scanner.nextLine();
                        if (check.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhap ten sinh vien: ");
                    String tenCanTim = scanner.nextLine();
                    for (SinhVien sinhVien : listSV) {
                        if (sinhVien.getHoVaTen().toLowerCase()
                                .contains(tenCanTim.toLowerCase())) {
                            System.out.println("Sinh vien can tim la: " + sinhVien.getHoVaTen());
                        }
                    }
                    break;
                case 0:
                    System.out.println("chao ban");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap dung chuc nang (0=>2)");
            }
        }
    }
}
