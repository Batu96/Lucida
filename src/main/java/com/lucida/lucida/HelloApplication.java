package com.lucida.lucida;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //Generator.generator_activation_code();
        Activation_Page activation_page=new Activation_Page();
        activation_page.firstPage();
        activation_page.isValid=true;
        if(activation_page.isValid){
            activation_page.stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/SceneBKIGender.fxml")));
            Scene scene = new Scene(root);
            stage.setTitle("Ludica");
            stage.setScene(scene);
            stage.show();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}