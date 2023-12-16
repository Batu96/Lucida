package com.lucida.lucida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Notlar {
    public static void createNote(String text){
        String fileName = "notlarim.txt";

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Writing content to the file
            writer.write(text);

        } catch (IOException e) {
            System.err.println("Error creating the test file: " + e.getMessage());
        }
    }
}
