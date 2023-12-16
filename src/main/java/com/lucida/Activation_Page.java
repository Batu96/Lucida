package com.lucida;



import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Activation_Page{

    public void event_button(String ac){

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
            //TODO:Geçilecek sayfa
            //ac değişkeninde aktivasyon kodunu çözülümüş hali var isim|soyad... şeklinde
        }
    }
    public void First_Page(){
        Stage stage = new Stage();
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
        button.setOnAction(e -> {
            String ac = textField.getText();
            event_button(ac);
        });
        BorderPane.setAlignment(button, Pos.BOTTOM_CENTER);
        pane.setBottom(button);

        stage.setTitle("Aktivasyon");
        stage.setScene(scene);
        stage.show();

    }
}