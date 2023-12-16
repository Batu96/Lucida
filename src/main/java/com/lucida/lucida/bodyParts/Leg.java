package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Leg {
    public Circle LeftLeg(){
        return new CircleBtn().CircleBtn(-112,-10,20);
    }

    public Circle RightLeg(){
        return new CircleBtn().CircleBtn(-70,-10,20);
    }
}
