package com.fruitbase;

import com.fruitbase.customers.Customer;
import com.fruitbase.customers.FreshCustomer;
import com.fruitbase.customers.UniqueCustomer;

import java.util.ArrayList;

public class Simulation {
    public static void main(String[] args) {
        FruitBase southMarket = new FruitBase();

        ArrayList<Customer> customersList = new ArrayList<>(2);

        Cargo cargo = southMarket.takeOrder(args);
        customersList.add(new FreshCustomer("Petr", cargo.getFruits()));
        customersList.add(new UniqueCustomer("Valeriy", cargo.getFruits()));

        customersList.forEach(Customer::takeFruits);
        customersList.forEach(Customer::printPurchases);
    }
}
