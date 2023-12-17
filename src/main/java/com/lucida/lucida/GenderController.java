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
            genderImg = "src/main/java/com/lucida/lucida/Image/mann_muscle_anatomy.jpg";

        } else {
            genderImg = "src/main/java/com/lucida/lucida/Image/woman_muscle_anatomy.jpg";
        }
        return genderImg;
    }

}
