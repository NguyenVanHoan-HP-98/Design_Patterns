package org.example;

import org.example.Client.Client;
import org.example.ConcreteImplementor.TV;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.testDevice(new TV());
    }
}