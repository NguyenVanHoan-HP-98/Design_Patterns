package org.example;
//Good
public class BillPughSingleton {
    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public  void SayHi()
    {
        System.out.println("Say Hi: Bill Pugh Singleton -> "+ getInstance().hashCode());
    }
}
