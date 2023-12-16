package com.example.ludisa;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Biceps {
    public Circle LeftBiceps(){
        return new CircleBtn().CircleBtn(-132,-95,10);
    }

    public Circle RightBiceps(){
        return new CircleBtn().CircleBtn(-50,-95,10);
    }
}
