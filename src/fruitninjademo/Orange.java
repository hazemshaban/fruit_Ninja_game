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
 * @author loloe
 */
public class Orange extends Fruit{
        private Image image = new Image("Orange.png");
         private ImageView imageView = new ImageView(image);
        private boolean s=false;

    public ImageView getImageView() {
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setTranslateX(-450);
        imageView.setTranslateY(260);
        
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
    private Image image1 = new Image("orangeSplit.png");

    public Image split() {
        s=true;
        return image1;
    }
  public boolean isS() {
        return s;
    }
  
   
    
    }

     
       

    

