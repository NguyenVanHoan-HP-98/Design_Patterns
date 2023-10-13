package org.example;

import org.example.Vidu1.Computer;
import org.example.Vidu2.Board;
import org.example.Vidu3.BoardApp;

public class Main {
    public static void main(String[] args) {
        // Chạy VD1
        Computer computer1 = new Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);
        //Chạy VD 2
        long startTime = System.currentTimeMillis();
        Board chessBoard = new Board();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create a board: " + (endTime - startTime) + " millis");
        chessBoard.print();
        // Chạy VD3
        long startTime1 = System.currentTimeMillis();
        BoardApp chessBoard1 = new BoardApp();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken to create a BoardApp: " + (endTime1 - startTime1) + " millis");
        chessBoard1.print();
    }
}