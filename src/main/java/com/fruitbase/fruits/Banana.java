package com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit{
    public Banana() {
        super();
        weight = 0.3;
        price = new BigDecimal(100);
        name = "Banana";
    }
}
