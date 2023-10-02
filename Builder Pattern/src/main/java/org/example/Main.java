package org.example;

import org.example.ConcreteBuilder.FastFoodOrderBuilder;
import org.example.EnumType.BreadType;
import org.example.EnumType.OrderType;
import org.example.EnumType.SauceType;
import org.example.Product.BankAccount;
import org.example.Product.Order;

public class Main {
    public static void main(String[] args) {
        Order order  = new FastFoodOrderBuilder()
                .orderType(OrderType.TAKE_AWAY)
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.FISH_SAUCE)
                .build();
        System.out.println(order.toString());

        BankAccount bankAccount = new BankAccount.BankAccountBuilder("ABC","01234")
                .withEmail("12345gyh@gmail.com")
                .build();
        System.out.println(bankAccount.toString());
    }
}