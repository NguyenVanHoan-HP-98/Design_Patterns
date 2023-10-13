package org.example.Vidu3;

import org.example.Vidu2.Cell;
import org.example.Vidu2.Color;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
    private static final Map<Color, CellProduct> CELL_CACHE = new HashMap<>();
    private CellFactory() {

    }
    public  static CellProduct getCell(Color color)
    {
        if(!CELL_CACHE.containsKey(color))

        {
            CellProduct cell = new CellProduct(color.name());
            CELL_CACHE.put(color,cell);
        }
        return  CELL_CACHE.get(color).clone();

    }
}
