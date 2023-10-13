package org.example.Adeptee;

public class JapanseAdaptee {
    //Chỉ nhận vào String là tiếng nhật, không nhận bất cứ tiếng nào khác
    public void Recive(String tiengnhat) {
        System.out.println("Adaptee bắt đầu nhận chuỗi từ clien chuyển đến...........");
        System.out.println("Tiếng nhật tôi nhận được là: " + tiengnhat);
    }
}
