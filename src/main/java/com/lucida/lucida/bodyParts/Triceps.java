package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Triceps extends BackMuscleGroup {
    public Circle LeftTriceps(){
        return new CircleBtn().CircleBtn(FixX(75),-95,10);
    }

    public Circle RightTriceps(){
        return new CircleBtn().CircleBtn(FixX(165),-95,10);
    }
}
