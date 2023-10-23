package com.fruitbase.customers;

import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;

public class FreshCustomer extends Customer{
    public FreshCustomer(String name, ArrayList<Fruit> purchases)
            {
        super(name);
        this.purchases = purchases;
    }

    /**
     * - FreshCustomer
     *         реалиация метода takeFruits
     *             выбираются только свежие фрукты
     */
    @Override
    public void takeFruits(){
        purchases.removeIf(fruit -> !fruit.isFresh());
    }
}
