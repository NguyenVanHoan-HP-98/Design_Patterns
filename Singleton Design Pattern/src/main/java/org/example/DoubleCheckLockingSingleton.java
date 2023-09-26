package org.example;

import java.util.Random;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton doubleCheckLockingSingleton;
    private int index;
    public static int x;

    private DoubleCheckLockingSingleton() {

    }

    private DoubleCheckLockingSingleton(int index) {
        this.index = index;
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (doubleCheckLockingSingleton == null) {
            var random = new Random();
            x = random.nextInt(1, 10000);
            //Giả sửa có 10k luồng => có khoảng 5 luồng qua bước này
            //Do ban đầu đối tượng doubleCheckLockingSingleton chưa được tạo ra
            synchronized (DoubleCheckLockingSingleton.class) {
                //synchronized có tác dụng: phải có 1 Thread thực hiện xong rồi thì các Thread khác mới được phép thực hiện
                //=> 4 luồng khác sẽ phải đợi
                if (doubleCheckLockingSingleton == null) {
                    //Khi 1 luồng đã thực hiện xong => đã tạo được đối tượng
                    //4 luồng còn lại không phải tạo lại  nữa mà return doubleCheckLockingSingleton;
                    doubleCheckLockingSingleton = new DoubleCheckLockingSingleton(x);
                }
            }
        }
        return doubleCheckLockingSingleton;
    }

    public void SayHi() {
        System.out.println("Say Hi: Double Check Locking Singleton " + index + " - " + x);
    }
}
