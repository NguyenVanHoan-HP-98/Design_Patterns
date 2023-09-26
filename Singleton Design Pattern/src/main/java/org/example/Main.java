package org.example;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {

        // Cách sử dụng Singleton Pattern bằng cách.
        //EagerInitialization.getInstance().SayHi();
        //EagerInitialization.getInstance().SayHi();
        //==========================================================
        //Static Block Singleton
        //StaticBlock.getInstance().SayHi();
        //StaticBlock.getInstance().SayHi();
        //==========================================================
        //Lazy Initialization
        //LazyInitializationSingleton.getInstance().SayHi();
        // LazyInitializationSingleton.getInstance().SayHi();
        //==========================================================
        //==> Có vẻ khá Ok rồi nhưng gờ ta thử tạo mấy cái Thread chạy hàm Sayhi cùng 1 lúc
        /*
        System.gc();
        var a = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var b = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var a1 = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var b1 = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var a2 = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        var b2 = new Thread( () -> LazyInitializationSingleton.getInstance().SayHi());
        a.start();
        b.start();
        a1.start();
        b1.start();
        a2.start();
        b2.start();
        */
        //==========================================================
        //Nếu chúng ta chạy hàm SayHi trên 2 Thread khác nhau thì sẽ nảy sinh vẫn để tạo 2 ra 2 instance => mất tính chất chất của Singleton
        //Java cung cấp cách giải quyết đó là thêm từ khóa synchronized vào trước hàm
        // System.gc();
        /*
        var a = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        var b = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        var a1 = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        var b1 = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        var a2 = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        var b2 = new Thread(() -> ThreadSafeSingleton.getInstance().SayHi());
        a.start();
        b.start();
        a1.start();
        b1.start();
        a2.start();
        b2.start();
         */


        //==========================================================
        /*
        System.gc();
        var a = new Thread(()-> DoubleCheckLockingSingleton.getInstance().SayHi());
        var b = new Thread(()-> DoubleCheckLockingSingleton.getInstance().SayHi());
        var c = new Thread(()-> DoubleCheckLockingSingleton.getInstance().SayHi());
        var d = new Thread(()-> DoubleCheckLockingSingleton.getInstance().SayHi());
        a.start();
        b.start();
        c.start();
        d.start();
        */

        var a = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        var b = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        var a1 = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        var b1 = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        var a2 = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        var b2 = new Thread(() -> BillPughSingleton.getInstance().SayHi());
        a.start();
        b.start();
        a1.start();
        b1.start();
        a2.start();
        b2.start();
    }
}