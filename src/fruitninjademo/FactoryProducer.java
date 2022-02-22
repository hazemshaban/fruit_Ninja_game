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
public class FactoryProducer {
    
    public FactoryProducer getFactory(String choice){
        if(choice.equals("fruit")){
            return  FruitFactory.getInstance();
         
        }
        else if (choice.equals("bombs")){
            return  BombsFactory.getInstance();
        }
        return null;
    }
    
}
