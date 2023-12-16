package com.lucida.lucida;

import javafx.scene.control.Button;

public class ButtonApplication {
    public Button UpdateButton(){
        Button btn = new Button();
        btn.setText("Güncelle");
        btn.setStyle("-fx-font-size: 15;");
        btn.setTranslateX(500);
        btn.setTranslateY(300);
        btn.setMaxWidth(100);
        btn.setMaxHeight(50);
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
        return btn;
    }
}
