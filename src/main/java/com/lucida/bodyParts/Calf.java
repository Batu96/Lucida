package com.lucida.bodyParts;

import com.lucida.BackMuscleGroup;
import com.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Calf extends BackMuscleGroup {
    public Circle LeftCalf(){
        return new CircleBtn().CircleBtn(FixX(90),60,15);
    }

    public Circle RightCalf(){
        return new CircleBtn().CircleBtn(FixX(150),60,15);
    }
}
