package com.fruitbase;

import com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * класс Cargo
 *     находится в пакете com.fruitbase
 *     содержит поле массив Fruit - записи о фруктах, добавленных в груз
 *     содержит консткрутор без параметров
 *         в нем инициализируется внутренний массив
 *     содержит общедоступный метод getWeight - возвращает суммарный вес груза
 *     содержит общедоступный метод getPrice - возвращает суммарную цену груза
 *     содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив
 */
public class Cargo {
    /**
     * содержит поле массив Fruit - записи о фруктах, добавленных в груз
     */
    private final ArrayList<Fruit> fruitsOrder;

    /**
     * содержит консткрутор без параметров
     *  *         в нем инициализируется внутренний массив
     */
    public Cargo() {
        fruitsOrder = new ArrayList<>();
    }

    /**
     * содержит общедоступный метод getWeight - возвращает суммарный вес груза
     * @return сумма весов фруктов в заказе типа дабл
     */
    public double getWeight(){

        return fruitsOrder.stream().map(Fruit::getWeight).reduce(0.0, Double::sum);
    }

    /**
     * содержит общедоступный метод getPrice - возвращает суммарную цену груза
     * @return сумма цен фруктов в заказе типа BigDecimal
     */
    public BigDecimal getPrice(){
        return fruitsOrder.stream().map(Fruit::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * содержит метод addFruit, доступный только в пакете - добавляет Fruit во внутренний массив
     * @param newFruit фрукт для добавления в массив заказов
     */
    public void addFruit(Fruit newFruit){
        fruitsOrder.add(newFruit);
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "fruitsOrder=" + fruitsOrder +
                '.' + "\n Вес заказа = " + this.getWeight() +
                "\n Цена заказа = " + this.getPrice();
    }
}
