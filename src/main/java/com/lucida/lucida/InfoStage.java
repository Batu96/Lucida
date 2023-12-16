package com.lucida.lucida;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class InfoStage extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        TextArea notlarim = new TextArea();
        notlarim.setPrefSize(600, 300);
        notlarim.setLayoutX(50);
        notlarim.setLayoutY(50);
        stage.setTitle("Notlarim");
        Button saveBtn = new Button("Kaydet");
        saveBtn.setLayoutX(50);
        saveBtn.setLayoutY(360);
        saveBtn.setOnAction(e -> {
            String notlar = notlarim.getText();
            Notlar.createNote(notlar);
        });

        Button backBtn = new Button("Geri");
        backBtn.setLayoutX(600);
        backBtn.setLayoutY(360);
        backBtn.setOnAction(e -> {
//            try {
//                new ManScene().start(stage);
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
        });
        Pane root = new Pane();
        root.getChildren().addAll(notlarim , saveBtn , backBtn);
        stage.setScene(new Scene(root, 700, 400));
        stage.show();
    }
}
