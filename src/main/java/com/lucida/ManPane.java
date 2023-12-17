package com.lucida;

import com.lucida.bodyParts.*;
import javafx.scene.layout.StackPane;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class ManPane {
    public StackPane pane() throws MalformedURLException, FileNotFoundException {
        StackPane pane = new StackPane();
        pane.getChildren().add(new ImageApplication().imageView());
        pane.getChildren().add(new ButtonApplication().UpdateButton());
        pane.getChildren().add(new ButtonApplication().NotesButton());
        pane.getChildren().add(new Chest().LeftChest());
        pane.getChildren().add(new Chest().RightChest());
        pane.getChildren().add(new SixPack().Sixpack());
        pane.getChildren().add(new Leg().LeftLeg());
        pane.getChildren().add(new Leg().RightLeg());
        pane.getChildren().add(new Biceps().LeftBiceps());
        pane.getChildren().add(new Biceps().RightBiceps());
        pane.getChildren().add(new Shoulders().LeftShoulder());
        pane.getChildren().add(new Shoulders().RightShoulder());
        pane.getChildren().add(new ForeArm().RightForeArm());
        pane.getChildren().add(new ForeArm().LeftForeArm());
        pane.getChildren().add(new Calf().RightCalf());
        pane.getChildren().add(new Calf().LeftCalf());
        pane.getChildren().add(new BackLeg().BackLeftLeg());
        pane.getChildren().add(new BackLeg().BackRightLeg());
        pane.getChildren().add(new Back().Back());
        pane.getChildren().add(new Triceps().LeftTriceps());
        pane.getChildren().add(new Triceps().RightTriceps());
        return pane;
    }

}
