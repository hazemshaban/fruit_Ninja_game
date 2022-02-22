/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninjademo;

import static java.awt.SystemColor.text;
import java.util.ArrayList;
import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.management.timer.Timer;

/**
 *
 * @author acer
 */
public class GamePlay extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Scene s = new Scene(root, 800, 500);
        Image image = new Image("Wiki-background.jpg");
        Image image1 = new Image("lives3.png");
        Image image2 = new Image("lives2.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(500);
        imageView.setFitWidth(800);
        ImageView imageView1 = new ImageView(image1);
        imageView1.setTranslateX(320);
        imageView1.setTranslateY(-200);


        Random r = new Random();
      
       
        
        root.getChildren().addAll(imageView,imageView1);
        FactoryProducer factoryProducer = new FactoryProducer();
        FruitFactory fruitfactory = (FruitFactory) factoryProducer.getFactory("fruit");
         Timeline timeline5 = new Timeline();
         timeline5.setCycleCount(Timeline.INDEFINITE);
    timeline5.getKeyFrames().add(
            new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent event) {
                 Fruit f=path(r.nextInt(4)-1,r.nextInt(6),fruitfactory,imageView1);
                 
                 
                     root.getChildren().addAll(f.getImageView());
                 
                }
            }));
   // timeline5.onFinishedProperty(imageView1.setImage(image2));
    timeline5.play();
    
        Timeline timeline1 = new Timeline(new KeyFrame(
                Duration.millis(2500),
                ae -> root.getChildren().addAll(Bombspath(r.nextInt(4)-1).getImageView())));
        timeline1.setCycleCount(Animation.INDEFINITE);
        timeline1.play();
        
        stage.setScene(s);
        stage.setResizable(false);
        stage.show();

    }

    public Fruit path(int i,int r,FruitFactory fruitfactory,ImageView imageView) {

        
        
        ArrayList<Fruit> f = new ArrayList<>();
        f.add(fruitfactory.getFruit("ORANGE"));
        f.add(fruitfactory.getFruit("APPLE"));
        f.add(fruitfactory.getFruit("BANANA"));
        
        

       
        
        Path path = new Path();
        PathTransition pathTransition = new PathTransition();

        MoveTo moveTo = new MoveTo(-200+100*r, 260+5*r);
        CubicCurveTo cubicCurveTo = new CubicCurveTo(-220+100*r, -200+r*10, -240+80*r, -130+r*5, -260+80*r, 350+r*50);
        path.getElements().add(moveTo);
        path.getElements().add(cubicCurveTo);

        pathTransition.setDuration(Duration.seconds(3.7));
        pathTransition.setNode(f.get(i).getImageView());
        pathTransition.setPath(path);
        pathTransition.setCycleCount(0);
        pathTransition.setAutoReverse(false);
        pathTransition.play();
          
        f.get(i).getImageView().setOnMouseMoved((e) -> {
            f.get(i).getImageView().setImage(f.get(i).split());
            
		});

        
        return f.get(i);

    }
    
    public Bombs Bombspath(int i) {

        FactoryProducer factoryProducer = new FactoryProducer();
        BombsFactory bombsfactory = (BombsFactory) factoryProducer.getFactory("bombs");
        
     ArrayList<Bombs> b = new ArrayList<>();
        b.add(bombsfactory.getBombs("FATALBOMB"));
        b.add(bombsfactory.getBombs("DANGEROUSBOMB"));
        
        

       
                Path path = new Path();
        PathTransition pathTransition = new PathTransition();

        MoveTo moveTo = new MoveTo(-450, 100);
        CubicCurveTo cubicCurveTo = new CubicCurveTo(-50, -200, 100, -130, 480, 350);
        path.getElements().add(moveTo);
        path.getElements().add(cubicCurveTo);

        pathTransition.setDuration(Duration.seconds(3.5));
        pathTransition.setNode(b.get(i).getImageView());
        pathTransition.setPath(path);
        pathTransition.setCycleCount(0);
        pathTransition.setAutoReverse(false);
        pathTransition.play();
         b.get(i).getImageView().setOnMouseMoved((e) -> {
           if(i==1){
           
           
           }
            
		});

        return b.get(i);

    }
        Image lives (ImageView imageView){
        
            Image image1 = new Image("lives3.png");
        Image image2 = new Image("lives2.png");
        Image image3 = new Image("lives1.png");
        Image image4 = new Image("lives0.png");
       
            
                if(imageView.getImage()==image1){
                    imageView.setImage(image2);
                
                }
                else if(imageView.getImage()==image2){
                    imageView.setImage(image3);
                
                }
                else if(imageView.getImage()==image3){
                    imageView.setImage(image4);
                
                }

            
            
            
            
            
            
            
            
            
            return imageView.getImage();
        
        
        
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
