package org.example.Client;

import org.example.AbstractionImpl.AdvancedRemote;
import org.example.AbstractionImpl.BasicRemote;
import org.example.Implementor.Deceive;

public class Client {
    public static void testDevice(Deceive device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
