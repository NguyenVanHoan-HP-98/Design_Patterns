package org.example;

public class Main {
    public static void main(String[] args) {
        //Singleton Pattern: Đảm bảo rằng một lớp chỉ có một thể hiện duy nhất và cung cấp một điểm truy cập toàn cục đến nó.

        //Gọi Singleton Basic bằng các
        SingletonBasic.getSingleton().SayHi();
        //=> được kết quả như mong muốn.

        //Nhưng nếu chúng ta chạy hàm SayHi trên 2 Thread khác nhau thì sẽ nảy sinh vẫn để tạo 2 ra 2 instance => mất tính chất chất của Singleton
        // Trong Singleton2 có mô tả điều đấy
        var a = new Thread(new MyRunnable());
        var b = new Thread(new MyRunnable());
        a.start();
        b.start();
        //


    }
}