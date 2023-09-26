package org.example;

import java.util.Random;

public class StaticBlock {
    private static final StaticBlock STATIC_BLOCK;
    private int index;

    private StaticBlock() {

    }

    private StaticBlock(int index) {
        this.index = index;

    }

    static {
        try {
            STATIC_BLOCK = new StaticBlock(new Random().nextInt(10000));
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    /*Đoạn mã trong khối static sẽ chạy khi lớp được nạp vào bộ nhớ.
    Điều này đảm bảo rằng đối tượng Singleton sẽ được tạo ngay khi lớp được nạp, bất kể ai gọi phương thức getInstance().*/
    public static StaticBlock getInstance() {
        return STATIC_BLOCK;
    }

    public void SayHi() {
        System.out.println("Say hi: Static block singleton -> " + index);
    }
}
