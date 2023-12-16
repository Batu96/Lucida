package com.lucida.lucida;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ManMuscleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        stage.setScene(new ManScene().Scene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}