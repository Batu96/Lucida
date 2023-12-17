package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class BackLeg extends BackMuscleGroup {
    private final String mov1="Forward Lunge";
    private final String mov2="Curtsy Lunges";
    private final String video1="https://www.youtube.com/embed/MxfTNXSFiYI";
    private final String video2="https://www.youtube.com/embed/-rTyKlHjYT8";

    public Circle BackLeftLeg(){
        return new CircleBtn().CircleBtn(FixX(95),10,20);
    }

    public Circle BackRightLeg(){
        return new CircleBtn().CircleBtn(FixX(145),10,20);
    }
}
