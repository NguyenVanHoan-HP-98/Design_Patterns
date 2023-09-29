package org.example.Cntt.Gui;

public class DVCntt implements  AbstractProduct {
    @Override
    public KichHoat taoKichHoat() {
        return new KichHoatOneServer();
    }

    @Override
    public TaoReq taoReq() {
        return new TaoReqTuHDTB();
    }
}
