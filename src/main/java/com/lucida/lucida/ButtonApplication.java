package com.lucida.lucida;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ButtonApplication {
    public Button UpdateButton(){
        Button btn = new Button();
        btn.setText("Güncelle");
        btn.setStyle("-fx-font-size: 15;");
        btn.setTranslateX(500);
        btn.setTranslateY(300);
        btn.setMaxWidth(100);
        btn.setMaxHeight(50);
        btn.setLayoutX(0);
        btn.setLayoutY(0);
        btn.setOnAction(e -> {
            Stage stage_test = (Stage)((Node) e.getSource()).getScene().getWindow();
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/SceneBKIGender.fxml")));
                Scene scene = new Scene(root);
                stage_test.setTitle("Ludica");
                stage_test.setScene(scene);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        return btn;
    }
    public Button NotesButton(){
        Button btn =new Button();
        btn.setText("NOTLARIM");
        btn.setStyle("-fx-font-size: 15;");
        btn.setTranslateX(500);
        btn.setTranslateY(-100);
        btn.setMaxWidth(100);
        btn.setMaxHeight(50);
        btn.setOnAction(e -> {
            Notlar notlar = new Notlar();
            Scene scene =notlar.noteScene();
            Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
            stage.setScene(scene);
        });
        return btn;
    }
}
