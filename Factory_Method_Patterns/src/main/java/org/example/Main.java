package org.example;

import org.example.Animal.IAnimal;
import org.example.Factory.BasicAnimalFactory;
import org.example.Factory.IAnnimalFactory;
import org.example.Factory.RandomAnimalFactory;

import java.io.Console;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IAnnimalFactory iAnnimalFactory;
        System.gc();
        int random = new Random().nextInt(0, 2);
        if (random == 0) {
            iAnnimalFactory = new BasicAnimalFactory();
        } else {
            iAnnimalFactory = new RandomAnimalFactory();
        }
        System.out.println(random);
        System.out.println(iAnnimalFactory.CreateAnimal().GetName());
        System.out.println(iAnnimalFactory.CreateAnimal().GetName());
        System.out.println(iAnnimalFactory.CreateAnimal().GetName());
        System.out.println(iAnnimalFactory.CreateAnimal().GetName());
        System.out.println(iAnnimalFactory.CreateAnimal().GetName());

    }
}