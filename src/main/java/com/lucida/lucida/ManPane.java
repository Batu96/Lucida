package com.lucida.lucida;

import com.lucida.lucida.bodyParts.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

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
        Label label2 = new Label();
        label2.setTranslateX(500);
        label2.setTranslateY(-250);
        label2.setText(BKIController.gender);
        label2.setStyle("-fx-font-size: 20;");
        pane.getChildren().addAll(new ButtonApplication().label(), label2);
        Image image = new Image("file:src/main/java/com/lucida/lucida/Image/9442811.jpg");
        BackgroundImage backImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT
        );
        Background background = new Background(backImage);
        pane.setBackground(background);


        return pane;
    }

}
