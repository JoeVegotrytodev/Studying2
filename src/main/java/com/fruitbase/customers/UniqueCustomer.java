package com.fruitbase.customers;

import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueCustomer extends Customer{
    
    public UniqueCustomer(String name, ArrayList<Fruit> purchases) {
        super(name);
        this.purchases = purchases;
    }

    /**
     *  - UniqueCustomer
     *         реалиация метода takeFruits
     *             отбирает только уникальные фрукты, т.е. те, которых еще нет во внутреннем массиве
     */
    @Override
    public void takeFruits(){
        Set<Fruit> tempSet = new HashSet<>(purchases);
        purchases = new ArrayList<>(tempSet);
    }
}
