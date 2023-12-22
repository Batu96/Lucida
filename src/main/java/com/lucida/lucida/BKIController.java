package com.lucida.lucida;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import com.lucida.lucida.enums.GenderEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class BKIController implements Initializable {
    public static String gender;

    @FXML
    public AnchorPane anchorPane;

    @FXML
    private TextField Adfx;

    @FXML
    private TextField soyadfx;


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
    private ToggleGroup tgCinsiyet;




    public static String bkilabel="";
    @FXML
    private  void  handleButtonAction(ActionEvent event) {

        double kg = Double.parseDouble(kilokg.getText());
        double boy = Double.parseDouble(boymt.getText());
        double bki = kg / (boy * boy);
        bkilabel = String.valueOf(bki);
        DecimalFormat df = new DecimalFormat("#.00");
        bkihesap.setText(String.valueOf(df.format(bki)));
        ToggleGroup gender = new ToggleGroup();
        erkek = new RadioButton(GenderEnum.MALE.getValue());
        erkek.setToggleGroup(gender);
        kadin = new RadioButton(GenderEnum.FEMALE.getValue());
        kadin.setToggleGroup(gender);
        bkilabel = String.valueOf(bki);
    }

    @FXML
    private void goToNextPage(ActionEvent event) throws Exception {


        String gender = this.saveFields();

        if (gender.equals(GenderEnum.FEMALE.getValue())) {
            loadWomenAnatomyWindow();

        }


        else if (gender.equals(GenderEnum.MALE.getValue())) {
              loadWanAnatomyWindow();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private String saveFields() {
        String ad = this.Adfx.getText();
        String soyad = this.soyadfx.getText();
        String kilo = this.kilokg.getText();
        String boy = this.boymt.getText();
        String activationCode = "1234";
        gender = ((RadioButton) this.tgCinsiyet.getSelectedToggle()).getText();
        String vki = "25";

        Json_processes.json_write(ad, soyad, kilo, boy, activationCode, gender, vki);

        return gender;
    }

    private void loadWomenAnatomyWindow() throws Exception {
        WomenAnatomyStage womenAnatomy = new WomenAnatomyStage();
        womenAnatomy.start((Stage) this.anchorPane.getScene().getWindow());
    }

    private void loadWanAnatomyWindow() throws Exception {
        ManMuscleApplication manAnatomy = new ManMuscleApplication();
        manAnatomy.start((Stage) this.anchorPane.getScene().getWindow());
    }
}