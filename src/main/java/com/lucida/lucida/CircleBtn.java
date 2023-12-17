package com.lucida.lucida;

import com.lucida.lucida.bodyParts.*;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleBtn {
    GenderController genderController=new GenderController();

    public Circle CircleBtn(int x,int y,int r){
        Circle circle = new Circle(x,y,r);

        if(genderController.getGender().equals("Kadın")){
            circle.setTranslateX(x-7);
            circle.setTranslateY(y+10);
            circle.setFill(Color.TRANSPARENT);
            circle.setCursor(Cursor.HAND);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{
                // I want to know which circle is clicked

                System.out.println(circle.getCenterY());

                switch ((int)circle.getCenterY()){
                    case -100 -> {
                        Scene scene =  InfoStage.infoPage(new Back());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case 10 -> {
                        Scene scene =  InfoStage.infoPage(new BackLeg());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -95 -> {
                        Scene scene =  InfoStage.infoPage(new Biceps());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case 60 -> {
                        Scene scene =  InfoStage.infoPage(new Calf());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -115 -> {
                        Scene scene =  InfoStage.infoPage(new Chest());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -65 -> {
                        Scene scene =  InfoStage.infoPage(new ForeArm());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -10 -> {
                        Scene scene =  InfoStage.infoPage(new Leg());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -120 -> {
                        Scene scene =  InfoStage.infoPage(new Shoulders());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -70 -> {
                        Scene scene =  InfoStage.infoPage(new SixPack());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -96 -> {
                        Scene scene =  InfoStage.infoPage(new Triceps());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                }

                System.out.println("Clicked women");
                Stage newStage = new Stage();
               // newStage.show();
            });
        }
        else{
            circle.setTranslateX(x);
            circle.setTranslateY(y-10);
            circle.setFill(Color.TRANSPARENT);
            circle.setCursor(Cursor.HAND);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, event->{
                switch ((int)circle.getCenterY()){
                    case -100 -> {
                        Scene scene =  InfoStage.infoPage(new Back());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case 10 -> {
                        Scene scene =  InfoStage.infoPage(new BackLeg());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -95 -> {
                        Scene scene =  InfoStage.infoPage(new Biceps());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case 60 -> {
                        Scene scene =  InfoStage.infoPage(new Calf());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -115 -> {
                        Scene scene =  InfoStage.infoPage(new Chest());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -65 -> {
                        Scene scene =  InfoStage.infoPage(new ForeArm());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -10 -> {
                        Scene scene =  InfoStage.infoPage(new Leg());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -120 -> {
                        Scene scene =  InfoStage.infoPage(new Shoulders());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -70 -> {
                        Scene scene =  InfoStage.infoPage(new SixPack());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                    case -96 -> {
                        Scene scene =  InfoStage.infoPage(new Triceps());
                        Stage newStage = new Stage();
                        newStage.setScene(scene);
                        newStage.show();}
                }

            });
        }
        return circle;
    }

}
