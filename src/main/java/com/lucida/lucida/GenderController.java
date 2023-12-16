package com.lucida.lucida;

public class GenderController {
    //private String gender= String.valueOf(GenderEnum.MALE); Projeyi birleştirirken gender stringi kaldırıp enumdan cindiyeti çekmemiz gerek
    private String genderImg;
    private String gender = "Erkek";//Temsili.

    public String getGender() {
        return gender;
    }

    public String GenderImg() {
        if (gender.equals("Erkek")) {
            genderImg = "C:/CODES/Ludisa/src/main/Image/mann_muscle_anatomy.jpg";

        } else {
            genderImg = "C:/CODES/Ludisa/src/main/Image/woman_muscle_anatomy.jpg";
        }
        return genderImg;
    }

}
