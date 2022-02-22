/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitninjademo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author loloe
 */
public class Fruitninjademo extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Button btn1 = new Button("Play");
        Image image = new Image("Fruit-Ninja-304.png");
        ImageView imageView = new ImageView(image);
        
        

        imageView.setFitHeight(500);
        imageView.setFitWidth(700);

        
       
        
        btn1.setTranslateX(340);
        btn1.setTranslateY(400);
        btn1.setFont(new Font("Arial", 14));
        btn1.setTextFill(Color.WHITE);
        btn1.setBackground(new Background(new BackgroundFill(Color.GOLDENROD, new CornerRadii(5), Insets.EMPTY)));
        btn1.setPrefSize(150, 80);
        root.getChildren().addAll(imageView,btn1);
        Scene scene = new Scene(root, 700, 500);
        stage.setScene(scene);
        stage.show();
        GamePlay s=new GamePlay();
        btn1.setOnAction((ActionEvent e) -> {
        s.start(stage);

        });


    }

    public static void main(String[] args) {
        launch(args);
    }

}
