package org.example.ConcreteBuilder;

import org.example.EnumType.BreadType;
import org.example.EnumType.OrderType;
import org.example.EnumType.SauceType;
import org.example.EnumType.VegetableType;
import org.example.Builder.OrderBuilder;
import org.example.Product.Order;

public class FastFoodOrderBuilder implements OrderBuilder {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return  this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return  this;
    }

    @Override
    public Order build() {
        return  new Order(orderType,breadType, sauceType, vegetableType);
    }
}
