package org.example;

public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        Singleton2.getSingleton2().SayHi();
    }
}
