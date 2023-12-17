package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Calf extends BackMuscleGroup {
    public Circle LeftCalf(){
        return new CircleBtn().CircleBtn(FixX(90),60,15);
    }

    public Circle RightCalf(){
        return new CircleBtn().CircleBtn(FixX(150),60,15);
    }
}
