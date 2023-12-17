package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Shoulders {
    public Circle LeftShoulder(){
        return new CircleBtn().CircleBtn(-130,-120,10);
    }

    public Circle RightShoulder(){
        return new CircleBtn().CircleBtn(-55,-120,10);
    }
}
