package com.lucida.lucida;

import javafx.scene.shape.Circle;

public class BackLeg extends BackMuscleGroup{
    public Circle BackLeftLeg(){
        return new CircleBtn().CircleBtn(FixX(95),10,20);
    }

    public Circle BackRightLeg(){
        return new CircleBtn().CircleBtn(FixX(145),10,20);
    }
}
