package com.lucida.lucida;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import static java.lang.Thread.sleep;

public class HelloApplication extends Application {
    //Musterinin hash icin bilgileri
    private String name = "Yusuf";
    private String surname = "Korkmazyiğit";

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Generator.generator_activation_code( ));
        Activation_Page activation_page=new Activation_Page();


        activation_page.firstPage();
    }

    public static void main(String[] args) {
        launch();
    }
}