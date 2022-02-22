/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninjademo;

/**
 *
 * @author loloe
 */
public class FruitFactory extends FactoryProducer {

    private static FruitFactory instance;

    private FruitFactory() {

    }

    public static FruitFactory getInstance() {
        if (instance == null) {
            instance = new FruitFactory();
        }
        return instance;
    }

    public Fruit getFruit(String fruittype) {
        if (fruittype == null) {
            return null;
        }
        if (fruittype.equalsIgnoreCase("APPLE")) {
            return new Apple();
        }
        else if (fruittype.equalsIgnoreCase("ORANGE")){
            return new Orange();
        }

        else if (fruittype.equalsIgnoreCase("BANANA")){
            return new Banana();
        }
        return null;
}
}
