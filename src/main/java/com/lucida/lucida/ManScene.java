package com.lucida.lucida;

import javafx.scene.Scene;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class ManScene {
    public Scene Scene() throws MalformedURLException, FileNotFoundException {
        Scene scene = new Scene(new ManPane().pane(), 1200, 700);

        return scene;
    }
}
