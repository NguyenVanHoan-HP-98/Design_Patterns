package org.example;

import org.example.Cntt.AppCntt.Xuly;
import org.example.Cntt.Gui.AbstractProduct;
import org.example.Cntt.Gui.DVCntt;
import org.example.Cntt.Gui.KichhoatDVInBot;
import org.example.Company.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        AbstractProduct abstractProduct;
        Xuly xuly;
        System.gc();
        int index = new Random().nextInt(0, 2);
        if (index == 0) {
            abstractProduct = new DVCntt();

        } else {
            abstractProduct = new KichhoatDVInBot();
        }
        xuly = new Xuly(abstractProduct);
        xuly.ThucThi();
        System.out.println("============================================================================");
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}