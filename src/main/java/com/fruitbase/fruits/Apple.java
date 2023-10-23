package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit{
    public Apple() {
        super();
        weight = 0.3;
        price = new BigDecimal(30);
        name = "Apple";
    }
}
