package com.lucida.lucida;



import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Activation_Page{
    public Stage stage = new Stage();
    public boolean isValid=false;
    public void event_button(ActionEvent e, String ac){

        String de_text=Generator.resolve_activation_code(ac);
        if(de_text==null){//yeni bir sayfa açıp hata mesajı oluşturuyor
            Stage estage = new Stage();
            BorderPane epane = new BorderPane();
            Scene escene = new Scene(epane, 200, 100);
            Text eText = new Text("Hatalı Aktivasyon Kodu");
            eText.setFont(Font.font(16));
            epane.setCenter(eText);
            estage.setScene(escene);
            estage.show();
        }
        else{
            Stage stage_test = (Stage)((Node) e.getSource()).getScene().getWindow();
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/SceneBKIGender.fxml")));
                Scene scene = new Scene(root);
                stage_test.setTitle("Ludica");
                stage_test.setScene(scene);
                stage_test.show();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public void firstPage(){

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 800, 600);

        Text text = new Text("Aktivasyon kodu");
        text.setFont(Font.font(24));
        text.setLayoutX(scene.getWidth() / 2 - 100);
        text.setLayoutY(scene.getHeight() / 2 - 100);


        TextField textField = new TextField();
        textField.setPrefSize(550, 20);
        textField.setLayoutX(scene.getWidth() / 2 - 275);
        textField.setLayoutY(scene.getHeight() / 2 - 10);

        Button button = new Button("Giriş");
        button.setStyle("-fx-font-size: 20;");
        button.setPrefSize(100, 50);
        button.setOnAction(e -> {
            String ac = textField.getText();
            event_button(e, ac);
        });
        button.setLayoutX(scene.getWidth() / 2 - 50);
        button.setLayoutY(scene.getHeight() / 2 + 50);
       pane.getChildren().addAll(text, textField, button);
        stage.setTitle("Aktivasyon");
        stage.setScene(scene);
        stage.show();

    }

}