package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Leg {
    private final String mov1="DeadLift";
    private final String mov2="Squat";
    private final String video1="https://www.youtube.com/embed/1ZXobu7JvvE";
    private final String video2="https://www.youtube.com/embed/rMvwVtlqjTE";
    public Circle LeftLeg(){
        return new CircleBtn().CircleBtn(-112,-10,20);
    }

    public Circle RightLeg(){
        return new CircleBtn().CircleBtn(-70,-10,20);
    }
}
