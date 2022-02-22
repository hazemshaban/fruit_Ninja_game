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
public class BombsFactory extends FactoryProducer{
    private static BombsFactory instance;
    
    private BombsFactory(){
        
    }
    
    public static BombsFactory getInstance(){
        if(instance==null){
            instance=new BombsFactory();
        }
        return instance;
    }
    public Bombs getBombs(String bombstype) {
        if (bombstype == null) {
            return null;
        }
        if (bombstype.equalsIgnoreCase("DANGEROUSBOMB")) {
            return new DangerousBomb();
        }
        else if (bombstype.equalsIgnoreCase("FATALBOMB")){
            return new FatalBomb();
        }

        return null;
}
    
}
