package org.example;

import java.util.Random;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton lazyInitializationSingleton;
    private int index;

    private LazyInitializationSingleton() {

    }

    private LazyInitializationSingleton(int index) {
        this.index = index;
    }

    public static LazyInitializationSingleton getInstance() {
        if (lazyInitializationSingleton == null) {
            System.gc();
            lazyInitializationSingleton = new LazyInitializationSingleton(new Random().nextInt(1000));
        }
        return lazyInitializationSingleton;
    }

    public void SayHi() {
        System.out.println("Say hi: Lazy Initialization singleton -> " + index + "- " + lazyInitializationSingleton.hashCode());
    }
}
