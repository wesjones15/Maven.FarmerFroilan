package com.zipcodewilmington.froilansfarm.peoplekinds;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Pilot extends Person {
    String name;

    public Pilot(String name) {
        this.name = "Flyin' Froilanda";
    }

    public String makeNoise() {
        return "I'm gonna fly";
    }

    public void mount(){

    }

    public void fertilize () {

    }

    public Boolean fly() {
        return null;
    }

    public void eat(Edible food, Integer quantity) {
        //Froilana eats 2 earCorn so silo contents of corn will decrement by 1 and his stomachContents will increase by 1
        //Eats 1 tomato  - silo tomato count will decrement by 2 and stomach contents will be added
        //Eats 2 eggs  - wherever we keep eggs, decrement by two, add two eggs to stomach contents arraylist
    }

    public void plant() {}

    public void dismount() {

    }
}
