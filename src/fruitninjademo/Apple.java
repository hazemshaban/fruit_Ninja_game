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
public class Apple extends Fruit {

    private Image image = new Image("apple.png");
    private ImageView imageView = new ImageView(image);
    private boolean s=false;
    public ImageView getImageView() {
        imageView.setFitHeight(60);
        imageView.setFitWidth(60);
        imageView.setTranslateX(-450);
        imageView.setTranslateY(260);
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
    public boolean isS() {
        return s;
    }
    private Image image1 = new Image("appleSplit.png");

    public Image split() {
        s=true;
 
        return image1;
    }

}
