/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninjademo;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author acer
 */public abstract class Fruit {
    private ImageView imageView=new ImageView();

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    abstract Image split();

   abstract boolean isS() ;
        
}
