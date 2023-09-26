package org.example;


public class Main {
    public static void main(String[] args) {
        // Cách sử dụng Singleton Pattern bằng cách.
        EagerInitialization.getInstance().SayHi();
        EagerInitialization.getInstance().SayHi();
        //Static Block Singleton
        StaticBlock.getInstance().SayHi();
        StaticBlock.getInstance().SayHi();
        //Lazy Initialization
        LazyInitializationSingleton.getInstance().SayHi();
        LazyInitializationSingleton.getInstance().SayHi();
        //==> Có vẻ khá Ok rồi nhưng gờ ta thử tạo mấy cái Thread chạy hàm Sayhi cùng 1 lúc
        var a = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var b = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        a.start();
        b.start();
        //Nếu chúng ta chạy hàm SayHi trên 2 Thread khác nhau thì sẽ nảy sinh vẫn để tạo 2 ra 2 instance => mất tính chất chất của Singleton
        //Java cung cấp cách giải quyết đó là thêm từ khóa synchronized vào trước hàm
        var c = new Thread( () -> ThreadSafeSingleton.getInstance().SayHi());
        var d = new Thread( () -> ThreadSafeSingleton.getInstance().SayHi());
        c.start();
        d.start();




    }
}