package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.Muscle;
import javafx.scene.shape.Circle;

public class Biceps extends Muscle {
    private final String mov1="Incline Dumbbell Curl ";
    private final String mov2="Concentration Curl";
    private final String video1="https://www.youtube.com/embed/aG7CXiKxepw";
    private final String video2="https://www.youtube.com/embed/VMbDQ8PZazY";

    public Circle LeftBiceps(){
        return new CircleBtn().CircleBtn(-132,-95,10);
    }

    public Circle RightBiceps(){
        return new CircleBtn().CircleBtn(-50,-95,10);
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
