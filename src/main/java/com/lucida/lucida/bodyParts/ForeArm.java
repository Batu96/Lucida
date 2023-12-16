package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ForeArm {
    public Circle LeftForeArm(){
        return new CircleBtn().CircleBtn(-150,-65,10);
    }

    public Circle RightForeArm(){
        return new CircleBtn().CircleBtn(-35,-65,10);
    }
}
