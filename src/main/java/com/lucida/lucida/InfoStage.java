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

public class InfoStage extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Pane root = new Pane();
        WebView webView = new WebView();

        Button mov1 = new Button("Barbell Row");
        mov1.setLayoutX(10);
        mov1.setLayoutY(10);
        mov1.setOnAction(e -> {
            webView.getEngine().load("https://giphy.com/embed/4ssD3no5DCbQs");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov2 = new Button("DeadLift");
        mov2.setLayoutX(10);
        mov2.setLayoutY(50);
        mov2.setOnAction(e -> {
            webView.getEngine().load("https://giphy.com/embed/4ssD3no5DCbQs");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov3 = new Button("PullUp");
        mov3.setLayoutX(10);
        mov3.setLayoutY(90);
        mov3.setOnAction(e -> {
            webView.getEngine().load("https://giphy.com/embed/4ssD3no5DCbQs");
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });

        root.getChildren().addAll(mov1, mov2, mov3);
        stage.setTitle("Hareketler");
        stage.setScene(new Scene(root, 700, 400));
        stage.show();
    }
}
