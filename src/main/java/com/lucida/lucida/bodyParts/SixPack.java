package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class SixPack {
    private final String mov1="Russian Twist";
    private final String mov2="Mountain Climber";
    private final String video1="https://www.youtube.com/embed/DJQGX2J4IVw";
    private final String video2="https://www.youtube.com/embed/hq_0YlyfqGM";
    public Circle Sixpack(){
        return new CircleBtn().CircleBtn(-93,-70,30);
    }
}
