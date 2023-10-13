package org.example.Adapter;

import org.example.Adeptee.JapanseAdaptee;
import org.example.Target.ITarget;

public class JapanseAdapter implements ITarget {
    JapanseAdaptee japanseAdaptee;

    public JapanseAdapter(JapanseAdaptee japanseAdaptee) {
        this.japanseAdaptee = japanseAdaptee;
    }

    @Override
    public void Send(String chuoicanchuyendoi) {
        System.out.println("Adapter nhận vào chuỗi cần chuyển đổi........");
        System.out.println("Chuỗi cần chuyển đổi là : " + chuoicanchuyendoi);
        System.out.println("Chuỗi sau khi chuyển đổi là: " + this.Chuyendoingonngu(chuoicanchuyendoi));
        System.out.println("Chuyển chuỗi đã chuyển đổi sang Adeptee.......");
        japanseAdaptee.Recive(this.Chuyendoingonngu(chuoicanchuyendoi));
    }

    private String Chuyendoingonngu(String chuoichuyendoi) {
        return "こんにちは";
    }
}
