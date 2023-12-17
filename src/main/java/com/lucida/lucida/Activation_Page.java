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

        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 800, 600);

        Text text = new Text("Aktivasyon kodu");
        text.setFont(Font.font(24));
        BorderPane.setAlignment(text, Pos.TOP_CENTER);
        pane.setTop(text);

        TextField textField = new TextField();
        BorderPane.setAlignment(textField, Pos.CENTER);
        pane.setCenter(textField);

        Button button = new Button("Giriş");
        button.setPrefSize(100, 50);
        button.setOnAction(e -> {
            String ac = textField.getText();
            event_button(e, ac);
        });
        BorderPane.setAlignment(button, Pos.BOTTOM_CENTER);
        pane.setBottom(button);
        stage.setTitle("Aktivasyon");
        stage.setScene(scene);
        stage.show();

    }

}