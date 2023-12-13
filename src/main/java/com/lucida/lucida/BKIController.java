package com.lucida.lucida;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class BKIController implements Initializable {
    @FXML
    private Button button;


    @FXML
    private TextField kilokg;
    @FXML
    private TextField boymt;
    @FXML
    private TextField bkihesap;
    @FXML
    private RadioButton kadin;
    @FXML
    private RadioButton erkek;



    @FXML
    private void handleButtonAction(ActionEvent event){

        double kg = Double.parseDouble(kilokg.getText());
        double boy = Double.parseDouble(boymt.getText());
        double bki = kg / (boy*boy);

        DecimalFormat df = new DecimalFormat("#.00");
        bkihesap.setText(String.valueOf(df.format(bki)));


        ToggleGroup gender = new ToggleGroup();
        erkek = new RadioButton("Erkek");
        erkek.setToggleGroup(gender);
        kadin = new RadioButton("Kadın");
        kadin.setToggleGroup(gender);



    }

    @FXML
    private void goToNextPage(ActionEvent event){
        //sonraki sahnenin oluşturulması ve DEVAM yazan butona tıklandığında sonraki sahneye geçiş(Radiobutton ve bki hesaplama seçildi mi kontrol yapmadım)
        //Seçilen radiobuttona göre erkek veya kadın görselinin sonraki sahnede belirlenmesi

    }
    @Override
    public void initialize(URL url, ResourceBundle rb){

    }


}