package com.fruitbase.fruits;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * абстрактный класс Fruit
 *     находится в пакете com.fruitbase.fruits
 *     содержит наследуемое поле вес
 *     содержит наследуемое поле цена
 *     содержит наследуемое поле name
 *     содержит общедоступный метод по-умолчанию для получения значения веса getWeight
 *     содержит общедоступный метод по-умолчанию для получения значения цены getPrice
 *     содержит общедоступный метод по-умолчанию для получения значения цены getName
 *      Для фруктов нужно добавить
 *         - внутренний параметр freshness - отражает состояние свежести фрукта;
 *           для значений нужно завести enum с как минимум состояниями: FRESH, OVERRIPED, SPOILED
 *           при создании объект имеет состояние FRESH
 *         - метод equals
 *         - метод hashcode
 *         - метод isFresh - возвращает true, если параметр freshness имеет состояние FRESH
 */
public abstract class Fruit {
    double weight;
    BigDecimal price;
    String name;
    Freshness freshness;

    public Fruit() {
        freshness = Freshness.FRESH;
    }

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

    public boolean isFresh(){
        return this.freshness == Freshness.FRESH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0 && Objects.equals(price, fruit.price) && Objects.equals(name, fruit.name) && freshness == fruit.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, price, name, freshness);
    }
}
