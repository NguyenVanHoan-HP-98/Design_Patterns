package org.example.Cntt.Gui;

public class KichHoatTwoServer implements KichHoat{
    @Override
    public String KichHoatDichVu() {
        return  "Lấy request -> gọi sang server 1 -> lấy kết quả -> check kết quả ->gọi sang server 2 -> lấy kết quả -> check kết quả -> trả về kq";
    }
}
