package com.lucida.lucida;

import com.lucida.lucida.enums.GenderEnum;

public class GenderController {
       private String genderImg;
    private String gender = BKIController.gender;

    public String getGender() {
        return gender;
    }

    public String GenderImg() {
        if (gender.equals(GenderEnum.MALE.getValue())) {
            genderImg = "src/main/java/com/lucida/lucida/Image/mann_muscle_anatomy.jpg";

        } else if (gender.equals(GenderEnum.FEMALE.getValue())){
            genderImg = "src/main/java/com/lucida/lucida/Image/woman_muscle_anatomy.jpg";
        }
        else {
            System.out.println("Hata");
        }
        return genderImg;
    }

}
