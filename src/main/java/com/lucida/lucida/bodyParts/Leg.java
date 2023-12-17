package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.Muscle;
import javafx.scene.shape.Circle;

public class Leg extends Muscle {
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

    public String getMov1() {
        return mov1;
    }

    public String getMov2() {
        return mov2;
    }

    public String getVideo1() {
        return video1;
    }

    public String getVideo2() {
        return video2;
    }
}
