package com.fruitbase.customers;

import com.fruitbase.fruits.Fruit;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Customer {
    ArrayList <Fruit> purchases;
    String name;
    LinkedList<Fruit> unchoosedFruits;

    /**
     * имеет конструктор
     *             инициализируется внутренний массив
     *             устанавливается имя
     * @param name имя
     */
    public Customer(String name) {
        purchases = new ArrayList<>();
        unchoosedFruits = new LinkedList<>();
        this.name = name;
    }

    /**
     * имеет метод takeFruits, который должны реализовать наследникик
     *             метод принимает груз и сохраняет из него фрукты во внутренний массив, т.е. в грузе объекты заканчиваются.
     */
    public abstract void takeFruits();

    /**
     * имеет метод printPurchases
     *             метод выводит полученные фрукты
     */
    public void printPurchases(){
        System.out.println(purchases);
    }
}
