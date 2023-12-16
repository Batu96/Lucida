package com.lucida.bodyParts;

import com.lucida.BackMuscleGroup;
import com.lucida.CircleBtn;
import com.lucida.GenderController;
import javafx.scene.shape.Circle;

public class Back extends BackMuscleGroup {

    GenderController genderController=new GenderController();
    public Circle Back(){
        return  new CircleBtn().CircleBtn(FixX(120),-100,30);
    }
}
