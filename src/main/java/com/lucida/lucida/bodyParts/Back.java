package com.lucida.lucida.bodyParts;

import com.lucida.lucida.BackMuscleGroup;
import com.lucida.lucida.CircleBtn;
import com.lucida.lucida.GenderController;
import javafx.scene.shape.Circle;

public class Back extends BackMuscleGroup {

    GenderController genderController=new GenderController();
    public Circle Back(){
        return  new CircleBtn().CircleBtn(FixX(120),-100,30);
    }
}
