package org.example.Vidu3;

import java.util.concurrent.TimeUnit;

public class CellProduct implements Cloneable {
    private String color;
    private String coordinate;

    public CellProduct(String color) {
        // Do more time to create an cell
        this.color = color;
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
    @Override
    public String toString() {
        return "Cell [color=" + color + ", coordinate=" + coordinate + "]";
    }
    @Override
    protected CellProduct clone() {
        try {
            return (CellProduct) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
