package com.lucida.lucida;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WomenAnatomyStage extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new ManPane().pane(), 1000, 600);
        stage.setScene(scene);
        stage.setTitle("Kadın Anatomisi");
        stage.show();
    }
}
