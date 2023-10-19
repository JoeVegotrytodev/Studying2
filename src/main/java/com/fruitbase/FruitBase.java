package com.fruitbase;

import java.util.Arrays;

public class FruitBase {
    private final FruitCatalogue fruitCatalogue;

    /*
     * Роль запросов у нас будут играть аргументы командной строки. Каждый аргумент является словом в запросе.
     * Если среди этих слов будут встречаться названия известных фруктов, то будет формироваться груз,
     * содержащий указанные фрукты.
     * Если передан "пустой запрос" (не переданы аргументы), то программа завершается.
     * Пример запроса: Orange Orange Blueberry Grape Pineapple
     * На этот запрос должна вернуться информация о грузе, содержащем два Orange и один Pineapple.

     По итогу выполнения выводится информация о собранном грузе - общий вес и цена.
     Значения цены и веса каждого фрукта на ваше усмотрение.
     */

    /**
     * содержит метод main
     *      *         здесь происходит выполнение программы согласно описанию выше
     *      *         основные шаги:
     *      *             создается фруктовая база
     *      *             проверяется наличие заказа от пользователя
     *      *             если есть заказ, то он передается в метод takeOrder
     *      *             выводим результат
     * @param args список фруктов для заказа
     */
    public static void main(String[] args) {
        FruitBase southMarket = new FruitBase();
        Cargo cargo;

        cargo = southMarket.takeOrder(args);

        System.out.println(cargo);

    }

    /**
     *  содержит конструктор без параметров
     *         в нем инициализируется поле FruitCatalogue
     */
    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }

    /**
     * содержит общедоступный метод для обработки заказа takeOrder
     *         в этом методе происходит поиск слов из заказа в FruitCatalogue
     *         если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
     *         Если среди запроса не встретились известные названия,
     *         то возвращается груз Cargo с нулевым количеством фруктов
     */
    public Cargo takeOrder(String[] order){
        Cargo cargo = new Cargo();

        Arrays
                .stream(order)
                .filter(fruitName -> (fruitCatalogue.findFruit(fruitName) != null))
                .forEach(fruitName -> cargo.addFruit(fruitCatalogue.findFruit(fruitName)));

        /*for(Fruit newFruit : order){
            if(fruitCatalogue.findFruit(newFruit.getName()) != null) {
                cargo.addFruit(newFruit);
            }
        }*/
        return cargo;
    }
}
