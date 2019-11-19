package com.zipcodewilmington.froilansfarm.warehouses;

import java.util.ArrayList;

public abstract class Container<E> {
    public ArrayList<E> contents;

    public Container(ArrayList<E> contents) {
        this.contents = contents;
    }

    public Container(Integer numberOfContents) {
        this.contents = new ArrayList<E>(numberOfContents);
    }

    public ArrayList<E> getContents() {
        return this.contents;
    }



}