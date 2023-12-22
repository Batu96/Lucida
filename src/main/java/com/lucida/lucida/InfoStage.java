package com.lucida.lucida;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.web.WebView;

public class InfoStage{
    public static Scene infoPage(Muscle muscle){
        Pane root = new Pane();
        WebView webView = new WebView();

        Button mov1 = new Button(muscle.getMov1());
        mov1.setLayoutX(10);
        mov1.setLayoutY(10);
        mov1.setOnAction(e -> {
            webView.getEngine().load(muscle.getVideo1());
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov2 = new Button(muscle.getMov2());
        mov2.setLayoutX(10);
        mov2.setLayoutY(50);
        mov2.setOnAction(e -> {
            webView.getEngine().load(muscle.getVideo2());
            webView.setPrefSize(400, 390);
            webView.setLayoutX(200);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Image image = new Image("file:src/main/java/com/lucida/lucida/Image/rsz_9442811.jpg");
        BackgroundImage backImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backImage);
        root.setBackground(background);

        root.getChildren().addAll(mov1, mov2);

        return new Scene(root, 600, 400);
    }
}
