package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class ForeArm {
    private final String mov1="Wrist Flexor Stretch";
    private final String mov2="Wrist Curls";
    private final String video1="https://www.youtube.com/embed/R7dI2ZcbiMI";
    private final String video2="https://www.youtube.com/embed/3VLTzIrnb5g";
    public Circle LeftForeArm(){
        return new CircleBtn().CircleBtn(-150,-65,10);
    }

    public Circle RightForeArm(){
        return new CircleBtn().CircleBtn(-35,-65,10);
    }
}
