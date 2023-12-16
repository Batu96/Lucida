package com.example.ludisa;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Shoulders {
    public Circle LeftShoulder(){
        return new CircleBtn().CircleBtn(-130,-120,10);
    }

    public Circle RightShoulder(){
        return new CircleBtn().CircleBtn(-55,-120,10);
    }
}
