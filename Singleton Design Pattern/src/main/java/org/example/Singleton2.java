package org.example;

import java.util.Random;

public class Singleton2 {
    private  static   Singleton2 SINGLETON_2;
    private  int index;
    private  Singleton2(int index)
    {
        this.index = index;
    }
    public static  Singleton2 getSingleton2()
    {
        var random = new Random();
        SINGLETON_2 = new Singleton2(random.nextInt(1,100));
        return  SINGLETON_2;
    }
    public  void  SayHi()
    {
        System.out.println("Say Hi: "+index);
    }


}
