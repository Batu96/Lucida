package com.lucida.bodyParts;

import com.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class ForeArm {
    public Circle LeftForeArm(){
        return new CircleBtn().CircleBtn(-150,-65,10);
    }

    public Circle RightForeArm(){
        return new CircleBtn().CircleBtn(-35,-65,10);
    }
}