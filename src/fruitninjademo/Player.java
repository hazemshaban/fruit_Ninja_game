/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninjademo;

/**
 *
 * @author acer
 */
public class Player {
    private static Player instance;
    
    private Player(){
        
    }
    
    
    public static Player getInstance(){
        if(instance==null){
            instance=new Player();
        }
        return instance;
    }
    private int Score=0;

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
    
    
}
