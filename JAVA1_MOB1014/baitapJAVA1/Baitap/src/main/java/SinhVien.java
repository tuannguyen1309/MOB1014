import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVien {

    private String ten;
    private double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    private SinhVien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        ten = sc.nextLine();

        System.out.print("Nhập điểm: ");
        diem = sc.nextDouble();
    }

    public void xuat() {
        System.out.println(ten + " - " + diem);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<SinhVien> list = new ArrayList<>();

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
        Comparator<SinhVien> compDiem = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() > o2.getDiem()) {
                    return 1;
                } else if (o1.getDiem() < o2.getDiem()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(list, compDiem);

        // Xuất danh sách sinh viên đã sắp xếp
        System.out.println("--------------------------");
        System.out.println("Danh sách sinh viên đã sắp xếp tăng dần theo điểm:");
        for (SinhVien sv : list) {
            sv.xuat();
        }
    }
}
