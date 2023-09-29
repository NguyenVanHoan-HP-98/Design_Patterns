package org.example.Cntt.AppCntt;

import org.example.Cntt.Gui.AbstractProduct;
import org.example.Cntt.Gui.KichHoat;
import org.example.Cntt.Gui.TaoReq;

public class Xuly {
    private KichHoat kichHoat;
    private TaoReq taoReq;

    public Xuly(AbstractProduct abstractProduct) {
        taoReq = abstractProduct.taoReq();
        kichHoat = abstractProduct.taoKichHoat();
    }

    public void ThucThi() {
        System.out.println(taoReq.TaoReqDichVu());
        System.out.println(kichHoat.KichHoatDichVu());
    }
}
