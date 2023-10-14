/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package String;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class userName {

    public static void main(String[] args) {
        String userName;
        String mk;
        Scanner sc =new Scanner(System.in);
        System.out.println("Vui long nhap username: ");
        userName = sc .nextLine();
        System.out.println("Vui long nhap pass: ");
        mk = sc .nextLine();
        
        if(userName.equalsIgnoreCase("hello") && mk.length()>6){
            System.out.println("Nhap thanh cong!!!");
            
        }else{
            System.out.println("Dang nhap that bai!!!");
        }
        
        
    }
}
