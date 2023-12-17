package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.Muscle;
import javafx.scene.shape.Circle;

public class SixPack extends Muscle {
    private final String mov1="Russian Twist";
    private final String mov2="Mountain Climber";
    private final String video1="https://www.youtube.com/embed/DJQGX2J4IVw";
    private final String video2="https://www.youtube.com/embed/hq_0YlyfqGM";
    public Circle Sixpack(){
        return new CircleBtn().CircleBtn(-93,-70,30);
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
