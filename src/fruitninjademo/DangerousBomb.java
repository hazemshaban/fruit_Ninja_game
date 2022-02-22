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
public class DangerousBomb implements Bombs{
   private Image image = new Image("Bomb_FNPIB.png");
         private ImageView imageView = new ImageView(image);
        

    public ImageView getImageView() {
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setTranslateX(-450);
        imageView.setTranslateY(260);
        
        return imageView;
    }
}
