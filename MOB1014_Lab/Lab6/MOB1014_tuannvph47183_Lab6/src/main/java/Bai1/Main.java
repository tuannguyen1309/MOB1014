package Bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //cách 1:
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        hoTen = hoTen.trim();

        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1);

        System.out.printf("%s %s %s ", ho.toUpperCase(), tenDem, ten.toUpperCase());
        //cách 2:
        
//        Scanner nhap = new Scanner(System.in);
//        System.out.print("Nhap ho ten: ");
//        String hoten = nhap.nextLine();
//        String[] ars = hoten.split(" ");
//        String ho = ars[0];
//        String ten = ars[ars.length-1];
//        ho = ho.toUpperCase();
//        ten = ten.toUpperCase();
//        //Xuất
//        System.out.println("============================");
//        System.out.print(ten+" "+ho+" ");
//        for (int i=1;i<ars.length-1;i++){
//            System.out.print(ars[i]+" ");
//        }
//        System.out.println("\n");
    }
    }

