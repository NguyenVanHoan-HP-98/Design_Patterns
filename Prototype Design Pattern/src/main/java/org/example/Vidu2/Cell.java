package org.example.Vidu2;

import java.util.concurrent.TimeUnit;

public class Cell {
    private String color;

    public Cell(String color) {
        this.color = color;
        try {
            // More time to create an cell
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cell [color=" + color + "]";
    }

}
