package com.company;


public class GeneratorInt {
    private int number;
    private String string;

    GeneratorInt (int number){
        this.number = number;
    }

    public String generate(){
        int rand = (int) (( Math.random() * (9 + 1) + 0));
        string = String.valueOf(rand); // Перезаписываем null в string

        for (int i = 0; i < (this.number - 1); i++) {
            rand = (int) (( Math.random() * (9 + 1) + 0));
            String randInt = String.valueOf(rand);
            string += randInt;
        }

        return string;
    }
}
