package com.zipcodewilmington.froilansfarm.warehouses;

import java.util.ArrayList;

public abstract class Container<E> {
    private ArrayList<E> contents;

    public Container(ArrayList<E> contents) {
        this.contents = contents;
    }


}