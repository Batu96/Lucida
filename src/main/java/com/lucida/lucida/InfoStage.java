package com.lucida.lucida;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class InfoStage{
    public Scene infoPage(Object muscle){
        //TODO : Muscle class'ı oluşturulduktan sonra parametre olarak Muscle muscle gelecek

        Pane root = new Pane();
        WebView webView = new WebView();

        Button mov1 = new Button("muscle.mov1"); //muscle -> muscle.mov1 muscle.video1
        mov1.setLayoutX(10);
        mov1.setLayoutY(10);
        mov1.setOnAction(e -> {
            webView.getEngine().load("muscle.video1");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov2 = new Button("Standing Calf Raise");
        mov2.setLayoutX(10);
        mov2.setLayoutY(50);
        mov2.setOnAction(e -> {
            webView.getEngine().load("https://www.youtube.com/embed/LnWEIjIls-M");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov3 = new Button("Jump Rope");
        mov3.setLayoutX(10);
        mov3.setLayoutY(90);
        mov3.setOnAction(e -> {
            webView.getEngine().load("https://www.youtube.com/embed/A0cwbJ5inTo");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        root.getChildren().addAll(mov1, mov2, mov3);

        return new Scene(root);
    }
}
