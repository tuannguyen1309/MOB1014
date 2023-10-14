/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package thithu;

/**
 *
 * @author Dell
 */
public class DoHoaPhat extends DoVat{
    private String chatLieu;

    public DoHoaPhat() {
    }

    public DoHoaPhat(String chatLieu, String maDoVat, String tenDoVat, Integer loai, double gia) {
        super(maDoVat, tenDoVat, loai, gia);
        this.chatLieu = chatLieu;
    }
    
    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Chat lieu: "+chatLieu);
    }
}
