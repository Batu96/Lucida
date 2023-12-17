package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.GenderController;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class Back extends BackMuscleGroup {
    private final String mov1 = "Barbell Row";
    private final String mov2 = "DeadLift";
    private final String video1 = "https://www.youtube.com/embed/77hEhK7TCig";
    private final String video2 = "https://www.youtube.com/embed/1ZXobu7JvvE";

    GenderController genderController = new GenderController();

    public Circle Back() {

        return new CircleBtn().CircleBtn(FixX(120), -100, 30);
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
