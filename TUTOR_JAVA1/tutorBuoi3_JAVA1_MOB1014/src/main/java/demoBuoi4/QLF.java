package demoBuoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLF {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Friend> listF = new ArrayList<>();

    public static void main(String[] args) {
        QLF ql = new QLF();
        ql.menu();
    }

    public void menu() {
        while (true) {
            int chon;
            System.out.println("-----------------------MENU------------");
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. Tim va sua");
            System.out.println("4. Sap xep theo tuoi");
            System.out.println("5. Thoat");
            System.out.println("----------------------------------------");
            System.out.println("Moi ban chuc nang ( 1->5): ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    in();
                    break;
                case 3:
                    tim();
                    break;
                case 4:
                    sapXepTuoi();
                    break;
                case 5:
                    System.out.println("Tam biet quy khach!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Vui lòng chọn đúng chức năng!!");
            }
        }
    }

    public void nhap() {
        while (true) {
            Friend f = new Friend();
            f.nhapTT();
            listF.add(f);
            System.out.println("Ban co muon nhap tiep khong? (Y/N) : ");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("n")) {
                System.out.println("Nhap thanh cong!");
                break;
            }
        }
    }

    public void in() {
        System.out.println("Danh sach Friend");
        for (Friend friend : listF) {
            System.out.println("------------------");
            friend.inTT();
            System.out.println("-------------------");
        }
    }

    public void tim() {
        System.out.println("\nMoi ban nhap SDT muon tim: ");
        String tim = sc.nextLine();
        int check = 0;
        for (Friend friend : listF) {
            if (friend.getSdt().equalsIgnoreCase(tim)) {
                System.out.println("Thong tin Friend:");
                friend.inTT();
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Khong co friend nao co so dien thoai la " + tim);
        }else{
            System.out.println("Da cap nhap thong tin");
            System.out.println("Danh sach sau khi cap nhat");
            in();
        }
    }

    public void sapXepTuoi() {
//        listF.sort((f1, f2) -> f1.getTuoi() - f2.getTuoi());
//        System.out.println("Danh sach Friend sau khi sap xep theo tuoi:");
//        in();
        Comparator<Friend> ss=new Comparator<Friend>() {
            @Override
            public int compare(Friend o1, Friend o2) {
                return Integer.compare(o1.getTuoi(), o2.getTuoi());
                //-1 x truoc y(x<y)
                // 1 x > y
                // 0 x=y
            }
        };
        //sap xep tang
        Collections.sort(listF,ss);
        //sap xep giam
        Collections.reverse(listF);
        System.out.println("Danh sach sap xep theo tuoi: ");
        in();
    }
}
