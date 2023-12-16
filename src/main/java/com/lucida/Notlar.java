package com.lucida;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Notlar {
    public static void createNote(String text){
        String fileName = "notlarim.txt";

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing content to the file
            writer.write(text);

        } catch (IOException e) {
            System.err.println("Error creating the test file: " + e.getMessage());
        }
    }
    public Scene noteScene(){
        Pane root = new Pane();
        Scene scene = new Scene(root);
        TextArea notlarim = new TextArea();
        notlarim.setPrefSize(600, 300);
        notlarim.setLayoutX(50);
        notlarim.setLayoutY(50);
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
        root.getChildren().addAll(notlarim , saveBtn , backBtn);
        return scene;
    }
}
