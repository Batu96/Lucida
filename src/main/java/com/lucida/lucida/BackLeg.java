package com.example.ludisa;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BackLeg {
    public Circle BackLeftLeg(){
        return new CircleBtn().CircleBtn(95,10,20);
    }

    public Circle BackRightLeg(){
        return new CircleBtn().CircleBtn(145,10,20);
    }
}
