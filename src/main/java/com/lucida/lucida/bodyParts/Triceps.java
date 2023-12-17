package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Triceps extends BackMuscleGroup {
    private final String mov1="Push up";
    private final String mov2="Push Down";
    private final String video1="https://www.youtube.com/embed/K8bKxVcwjrk";
    private final String video2="https://www.youtube.com/embed/6Fzep104f0s";
    public Circle LeftTriceps(){
        return new CircleBtn().CircleBtn(FixX(75),-96,10);
    }

    public Circle RightTriceps(){
        return new CircleBtn().CircleBtn(FixX(165),-96,10);
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
