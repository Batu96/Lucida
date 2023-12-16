package com.lucida.lucida;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;

public class ImageApplication {

    private Image image() throws MalformedURLException, FileNotFoundException {

        InputStream inputStream = new FileInputStream(new GenderController().GenderImg());
        Image image = new Image(inputStream);
        return image;
    }
    public ImageView imageView() throws MalformedURLException, FileNotFoundException {
        ImageView imageView =new ImageView(image());
        return imageView;
    }
}
