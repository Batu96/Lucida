package com.example.ludisa;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleBtn {
    public Circle CircleBtn(int x,int y,int r){
        Circle circle = new Circle(x,y,r);
        circle.setTranslateX(x);
        circle.setTranslateY(y-10);
        circle.setFill(Color.TRANSPARENT);
        circle.setCursor(Cursor.HAND);
        circle.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{
            Stage newStage = new Stage();
            newStage.show();
        });

        return circle;
    }

}
