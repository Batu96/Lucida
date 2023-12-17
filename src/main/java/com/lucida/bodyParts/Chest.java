package com.lucida.bodyParts;

import com.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Chest {

    public Circle LeftChest(){
        return new CircleBtn().CircleBtn(-105,-115,10);
    }
    public Circle RightChest(){
        return new CircleBtn().CircleBtn(-75,-115,10);
    }


}
