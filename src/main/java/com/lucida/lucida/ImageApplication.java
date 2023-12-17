package com.lucida.lucida;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageApplication {

    //Resim yüklendi
    private Image image() throws MalformedURLException, FileNotFoundException {
        GenderController genderController=new GenderController();
        InputStream inputStream = new FileInputStream(genderController.GenderImg());
        Image image = new Image(inputStream);
        return image;
    }
    public ImageView imageView() throws MalformedURLException, FileNotFoundException {
        ImageView imageView =new ImageView(image());
        return imageView;
    }
}
