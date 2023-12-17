package com.lucida.lucida.bodyParts;

import com.lucida.lucida.CircleBtn;
import javafx.scene.shape.Circle;

public class Chest {
    private final String mov1="Push Ups";
    private final String mov2="Incline Dumbbell Fly";
    private final String video1="https://www.youtube.com/embed/0pkjOk0EiAk";
    private final String video2="https://www.youtube.com/embed/JSDpq14vCZ8";

    public Circle LeftChest(){
        return new CircleBtn().CircleBtn(-105,-115,10);
    }
    public Circle RightChest(){
        return new CircleBtn().CircleBtn(-75,-115,10);
    }


}
