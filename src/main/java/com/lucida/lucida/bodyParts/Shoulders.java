package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.Muscle;
import javafx.scene.shape.Circle;

public class Shoulders extends Muscle {
    private final String mov1="Push Press";
    private final String mov2="Face Pulls";
    private final String video1="https://www.youtube.com/embed/iaBVSJm78ko";
    private final String video2="https://www.youtube.com/embed/0Po47vvj9g4";
    public Circle LeftShoulder(){
        return new CircleBtn().CircleBtn(-130,-120,10);
    }

    public Circle RightShoulder(){
        return new CircleBtn().CircleBtn(-55,-120,10);
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
