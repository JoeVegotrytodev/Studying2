package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange() {
        super();
        weight = 0.6;
        price = new BigDecimal(120);
        name = "Orange";
    }
}
