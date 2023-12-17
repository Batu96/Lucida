package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Calf extends BackMuscleGroup {
    private final String mov1="Standing Calf Raise";
    private final String mov2="Jump Rope";
    private final String video1="https://www.youtube.com/embed/LnWEIjIls-M";
    private final String video2="https://www.youtube.com/embed/A0cwbJ5inTo";

    public Circle LeftCalf(){
        return new CircleBtn().CircleBtn(FixX(90),60,15);
    }

    public Circle RightCalf(){
        return new CircleBtn().CircleBtn(FixX(150),60,15);
    }
}
