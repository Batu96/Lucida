package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Leg {
    public Circle LeftLeg(){
        return new CircleBtn().CircleBtn(-112,-10,20);
    }

    public Circle RightLeg(){
        return new CircleBtn().CircleBtn(-70,-10,20);
    }
}
