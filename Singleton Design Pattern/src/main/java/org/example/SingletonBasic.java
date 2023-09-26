package org.example;


public class SingletonBasic {
    private static final SingletonBasic singletonBasic= new SingletonBasic();
    private SingletonBasic() {

    }
    public static SingletonBasic getSingleton() {
        return singletonBasic;
    }
    public void SayHi()
    {
        System.out.println("Say Hi: " );
    }
}

