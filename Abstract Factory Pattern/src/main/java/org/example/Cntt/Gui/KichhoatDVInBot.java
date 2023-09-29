package org.example.Cntt.Gui;

public class KichhoatDVInBot implements AbstractProduct {
    @Override
    public KichHoat taoKichHoat() {
        return new KichHoatTwoServer();
    }

    @Override
    public TaoReq taoReq() {
        return new TaoReqTrucTiep();
    }
}
