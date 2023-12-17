package com.lucida.lucida;

import com.lucida.lucida.enums.GenderEnum;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;

public class Notlar {
    static String  note="";
    public static void createNote(String text) {
        String fileName = "notlarim.txt";

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing content to the file
            writer.write(text);

        } catch (IOException e) {
            System.err.println("Error creating the note file: " + e.getMessage());
        }
    }
    public static void readerNote() {
        String fileName = "notlarim.txt";
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            while (line != null) {
                note += line;
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.err.println("Error reading the note file: " + e.getMessage());
        }
    }

    public Scene noteScene() {
        Pane root = new Pane();
        Scene scene = new Scene(root, 700, 500);
        TextArea notlarimArea = new TextArea();
        readerNote();
        notlarimArea.setText(note);
        notlarimArea.setPrefSize(600, 300);
        notlarimArea.setLayoutX(50);
        notlarimArea.setLayoutY(50);
        Button saveBtn = new Button("Kaydet");
        saveBtn.setLayoutX(50);
        saveBtn.setLayoutY(360);
        saveBtn.setOnAction(e -> {
            String notlar = notlarimArea.getText();
            Notlar.createNote(notlar);
        });

        Button backBtn = new Button("Geri");
        backBtn.setLayoutX(600);
        backBtn.setLayoutY(360);
        backBtn.setOnAction(e -> {
            try {
                Stage stage = (Stage) backBtn.getScene().getWindow();
                Scene scene1 = new ManScene().Scene();
                stage.setScene(scene1);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        root.getChildren().addAll(notlarimArea, saveBtn, backBtn);
        return scene;
    }
}
