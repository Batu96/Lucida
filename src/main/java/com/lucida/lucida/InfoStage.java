package com.lucida.lucida;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class InfoStage extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        WebView webView = new WebView();

        Button mov1 = new Button("Barbell Row");
        mov1.setLayoutX(10);
        mov1.setLayoutY(10);
        mov1.setOnAction(e -> {
            webView.getEngine().load("https://www.oldschoollabs.com/wp-content/uploads/2021/01/00271301-Barbell-Bent-Over-Row_Back-OPTIMIZED-1.gif");
            webView.setPrefSize(300, 400);
            webView.setLayoutX(300);
            webView.setLayoutY(0);
            root.getChildren().add(webView);
        });
        Button mov2 = new Button("");
        mov2.setLayoutX(10);
        mov2.setLayoutY(50);

        Button mov3 = new Button("");
        mov3.setLayoutX(10);
        mov3.setLayoutY(90);

        root.getChildren().addAll(mov1, mov2, mov3);
        stage.setScene(new Scene(root, 700, 400));
        stage.show();
    }
}
