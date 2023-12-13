package com.lucida.lucida;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class womenAnatomyStage extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        HBox root = new HBox();

        stage.setScene(new Scene(root, 1200, 750));

       // Stage infoStage = new Stage();
        Pane videoPane = new Pane();

        VBox infBox = new VBox();
        Label cinsiyet = new Label("from Json file (cinsiyet)");
        Label BKI = new Label("from Json file (BKi)");
        Button notes = new Button("Notlarim");

        notes.setOnAction(e ->{
//           open notes stage
        });

        WebView webView = new WebView();

        ImageView womenImage = new ImageView("C:\\Users\\Loony\\Desktop\\Lucida\\images\\IMG_0687.jpeg.jpg");
        womenImage.setFitHeight(800);
        womenImage.setFitWidth(800);

        womenImage.setOnMouseClicked(e->{
            webView.getEngine().load("https://www.youtube.com/embed/t1_ZFIGMKy8");
            videoPane.getChildren().add(webView);
            Scene videoScene = new Scene(videoPane, 800, 800);
            stage.setScene(videoScene);
        });
        infBox.getChildren().addAll(cinsiyet, BKI, notes);
        root.getChildren().addAll( womenImage,infBox);

        root.setAlignment(Pos.TOP_RIGHT);
        infBox.setAlignment(Pos.TOP_CENTER);

        stage.setTitle("Kadın Anatomisi");
        stage.show();
    }
}
