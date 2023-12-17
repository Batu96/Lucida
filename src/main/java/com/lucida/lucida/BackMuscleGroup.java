package com.lucida.lucida;

public class BackMuscleGroup {
    protected int FixX(int x) {

        if (new GenderController().getGender().equals("Kadın")) {
            return x -= 10;
        } else {
            return x;
        }
    }

}
