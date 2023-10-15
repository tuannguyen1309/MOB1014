/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignment_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MOB1014_Assignment_PH47183_NguyenVietTuan {

    static ArrayList<NhanVien> listNV = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int chon;
        while (true) {
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                  Ho va ten: Nguyen Viet Tuan               |");
            System.out.println("|                       MSSV: PH47183                        |");
            System.out.println("|                       ASSIGNMENT-GD2                       |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|                     Cong ty Rong Viet                      |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("|        1. Nhap danh sach nhan vien tu ban phim             |");
            System.out.println("|        2. Xuat danh sach nhan vien tu ban phim             |");
            System.out.println("|    3. Tim va hien thi nhan vien theo ma nhap tu ban phim   |");
            System.out.println("|        4. Xoa nhan vien theo ma nhap tu ban phim           |");
            System.out.println("|   5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim |");
            System.out.println("|    6. Tim cac nhan vien theo khoang luong nhap tu ban phim |");
            System.out.println("|          7. Sap xep nhan vien theo ho va ten               |");
            System.out.println("|          8. Sap xep nhan vien theo thu nhap                |");
            System.out.println("|        9. Xuat 5 nhan vien co thu nhap cao nhat            |");
            System.out.println("|                     10. Thoat chhuong trinh                |");
            System.out.println("*------------------------------------------------------------*");
            System.out.println("Moi ban chon chuc nang (1 => 10): ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap danh sach nhan vien");
                    do {
                        System.out.print("Ban can nhap nhan vien nao(NV/TP/TT): ");
                        sc.nextLine();
                        //Phương thức toUpperCase() trả về một chuỗi mới với tất cả các ký tự được chuyển đổi thành chữ hoa.
                        switch (sc.nextLine().toUpperCase()) {
                            case "NV":
                                NhanVien nv = new NhanVien();
                                nv.nhap();
                                listNV.add(nv);
                                break;
                            case "TP":
                                NhanVien nvTP = new TruongPhong();
                                nvTP.nhap();
                                listNV.add(nvTP);
                                  break;
                            case "TT":
                                NhanVien nvTT = new TiepThi();
                                nvTT.nhap();
                                listNV.add(nvTT);
                                break;
                            default:
                                System.out.println("Hay chon dung (NV/TP/TT)!!XIN MOI:");
                        }
                        System.out.print("Ban co muon tiep tuc nhap nua khong (Y/N): ");
                    } while (!sc.nextLine().equalsIgnoreCase("N"));
                    break;
                case 2:
                    System.out.println("Ds nhan vien:");
                    for (NhanVien nv : listNV) {
                        nv.xuat();
                    }
                    break;
                case 3:
                    System.out.println("Tim nhan vien theo ma:");
                    sc.nextLine();
                    System.out.println("Nhap ma nv can tim:");
                    String maNV = sc.nextLine();
                    int index = timTheoMa(maNV);
                    if (index == - 1) {
                        System.out.println("Ma nv:---" + maNV + "---Khong co trong danh sach");
                    } else {
                        System.out.println("Nhan vien can tim:---" + maNV);
                        listNV.get(index).xuat();
                    }

                    break;
                case 4:
                    System.out.println("Tim nhan vien theo ma:");
                    sc.nextLine();
                    System.out.println("Nhap ma nv can xoa:");
                    maNV = sc.nextLine();
                    index = timTheoMa(maNV);
                    if (index == - 1) {
                        System.out.println("Ma nv:---" + maNV + "---Khong co trong danh sach");
                    } else {
                        System.out.println("Xoa nv:---" + maNV + "---khoi danh sach");
                        listNV.remove(index);
                    }
                    System.out.println("Ds nhan vien sau khi xoa:");
                    for (NhanVien nv : listNV) {
                        nv.xuat();
                    }
                    break;
                case 5:
                    System.out.println("Cap nhat thong tin theo ma tung nhan vien:");
                    sc.nextLine();
                    System.out.println("Nhap ma nv can cap nhat:");
                    maNV = sc.nextLine();
                    index = timTheoMa(maNV);
                    if (index == - 1) {
                        System.out.println("Ma nv:---" + maNV + "---Khong cos trong danh sach");
                    } else {
                        NhanVien nvCN = listNV.get(index);//lay nv ra
                        System.out.println("Ban muon cap nhat lai ma nv (Y/N):");
                        if (sc.nextLine().equalsIgnoreCase("Y")) {
                            System.out.println("Ma nv moi:");
                            nvCN.setMaNV(sc.nextLine());
                        }
                        System.out.println("Ban muon cap nhat lai ho ten nv (Y/N):");
                        if (sc.nextLine().equalsIgnoreCase("Y")) {
                            System.out.println("Ho ten nv moi:");
                            nvCN.setHoTen(sc.nextLine());
                        }
                        System.out.println("Ban muon cap nhat lai luong nv (Y/N):");
                        if (sc.nextLine().equalsIgnoreCase("Y")) {
                            System.out.println("Luong moi:");
                            nvCN.setLuong(sc.nextDouble());
                        }
                        listNV.set(index, nvCN);
                    }
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:
                    System.out.println("Thoat chuong trinh thanh cong");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai chuc nang vui long chon dung tu 0-9");
            }

        }

    }

    private static int timTheoMa(String maNV) {
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(maNV)) {
                return i;
            }
        }
        return -1;
    }
}
