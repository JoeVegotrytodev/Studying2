package com.fruitbase;

import com.fruitbase.fruits.*;

import java.util.ArrayList;

/**
 * класс FruitCatalogue
 *     находится в пакете com.fruitbase
 *     содержит поле массив Fruit - список записей известных фруктов
 *     содержит конструктор без параметров
 *         при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
 *     содержит метод findFruit, доступный только в пакете
 *         по переданному слову проверяет есть ли информация о таком фрукте
 *         если есть, то возвращает Fruit. Если нет, то возвращает null.
 */
public class FruitCatalogue {
    /**
     * содержит поле массив Fruit - список записей известных фруктов
     */
    private final ArrayList<Fruit> knownFruits;

    /**
     * содержит конструктор без параметров
     *  *         при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
     */
    public FruitCatalogue() {
        knownFruits = new ArrayList<>();

        knownFruits.add(new Apple());
        knownFruits.add(new Banana());
        knownFruits.add(new Orange());
        knownFruits.add(new Pineapple());
    }

    /**
     *  содержит метод findFruit, доступный только в пакете
     *          по переданному слову проверяет есть ли информация о таком фрукте
     *          если есть, то возвращает Fruit. Если нет, то возвращает null.
     */
    Fruit findFruit(String outerFruitName){
        for(Fruit fruit : knownFruits){
            if(fruit.getName().equals(outerFruitName))
                return fruit;
        }
        return null;
    }
}
