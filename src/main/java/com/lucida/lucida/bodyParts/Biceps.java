package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Biceps {
    public Circle LeftBiceps(){
        return new CircleBtn().CircleBtn(-132,-95,10);
    }

    public Circle RightBiceps(){
        return new CircleBtn().CircleBtn(-50,-95,10);
    }
}
