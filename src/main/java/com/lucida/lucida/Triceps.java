package com.lucida.lucida;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Triceps {
    public Circle LeftTriceps(){
        return new CircleBtn().CircleBtn(75,-95,10);
    }

    public Circle RightTriceps(){
        return new CircleBtn().CircleBtn(165,-95,10);
    }
}
