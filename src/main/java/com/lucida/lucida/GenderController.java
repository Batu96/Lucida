package com.lucida.lucida;

import com.lucida.lucida.enums.GenderEnum;

public class GenderController {
    //private String gender= String.valueOf(GenderEnum.MALE); Projeyi birleştirirken gender stringi kaldırıp enumdan cindiyeti çekmemiz gerek
    private String genderImg;
    private String gender = BKIController.gender;

    public String getGender() {
        return gender;
    }

    public String GenderImg() {
        if (gender.equals(GenderEnum.MALE.getValue())) {
            genderImg = "src/main/java/com/lucida/lucida/Image/mann_muscle_anatomy.jpg";
            System.out.println("Erkek");

        } else if (gender.equals(GenderEnum.FEMALE.getValue())){
            genderImg = "src/main/java/com/lucida/lucida/Image/woman_muscle_anatomy.jpg";
        }
        else {
            System.out.println("Hata");
        }
        return genderImg;
    }

}
