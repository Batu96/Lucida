package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Shoulders {
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
}
