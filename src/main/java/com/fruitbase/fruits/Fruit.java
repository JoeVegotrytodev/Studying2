package com.fruitbase.fruits;

import java.math.BigDecimal;

/**
 * абстрактный класс Fruit
 *     находится в пакете com.fruitbase.fruits
 *     содержит наследуемое поле вес
 *     содержит наследуемое поле цена
 *     содержит наследуемое поле name
 *     содержит общедоступный метод по-умолчанию для получения значения веса getWeight
 *     содержит общедоступный метод по-умолчанию для получения значения цены getPrice
 *     содержит общедоступный метод по-умолчанию для получения значения цены getName
 */
public abstract class Fruit {
    double weight;
    BigDecimal price;
    String name;

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n  Fruit{" +
                "name=" + name +
                ", price=" + price +
                ", weight='" + weight + '\'' +
                '}';
    }
}
