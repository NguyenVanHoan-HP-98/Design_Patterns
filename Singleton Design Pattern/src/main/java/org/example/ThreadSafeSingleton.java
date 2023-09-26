package org.example;

import java.util.Random;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton threadSafeSingleton;
    private int index;

    private ThreadSafeSingleton() {

    }

    private ThreadSafeSingleton(int index) {
        this.index = index;
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if(threadSafeSingleton == null)
        {
            System.gc();
            threadSafeSingleton= new ThreadSafeSingleton(new Random().nextInt(1,10000));
        }
        return threadSafeSingleton;
    }

    public void SayHi() {
        System.out.println("Say hi: Thread Safe Singleton -> " + index + " - " + threadSafeSingleton.hashCode());
    }
}
