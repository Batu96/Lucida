package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Calf {
    public Circle LeftCalf(){
        return new CircleBtn().CircleBtn(90,60,15);
    }

    public Circle RightCalf(){
        return new CircleBtn().CircleBtn(150,60,15);
    }
}
