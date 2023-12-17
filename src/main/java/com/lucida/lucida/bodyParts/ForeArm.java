package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.Muscle;
import javafx.scene.shape.Circle;

public class ForeArm extends Muscle {
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
