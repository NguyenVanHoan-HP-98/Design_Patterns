package org.example.Builder;

import org.example.EnumType.BreadType;
import org.example.EnumType.OrderType;
import org.example.EnumType.SauceType;
import org.example.EnumType.VegetableType;
import org.example.Product.Order;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
