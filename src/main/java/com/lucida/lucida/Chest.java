package com.lucida.lucida;

import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Chest {

    public Circle LeftChest(){
        return new CircleBtn().CircleBtn(-105,-115,10);
    }
    public Circle RightChest(){
        return new CircleBtn().CircleBtn(-75,-115,10);
    }


}
