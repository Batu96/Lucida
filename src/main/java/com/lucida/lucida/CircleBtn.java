package com.lucida.lucida;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleBtn {
    GenderController genderController=new GenderController();

    public Circle CircleBtn(int x,int y,int r){
        Circle circle = new Circle(x,y,r);
        if(genderController.getGender().equals("Kadın")){
            circle.setTranslateX(x-7);
            circle.setTranslateY(y+10);
            circle.setFill(Color.YELLOW);
            circle.setCursor(Cursor.HAND);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{

                Stage newStage = new Stage();
                newStage.show();
            });
        }
        else{
            circle.setTranslateX(x);
            circle.setTranslateY(y-10);
            circle.setFill(Color.YELLOW);
            circle.setCursor(Cursor.HAND);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{

                Stage newStage = new Stage();
                newStage.show();
            });
        }
        return circle;
    }

}
