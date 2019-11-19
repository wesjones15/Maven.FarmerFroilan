package com.zipcodewilmington.froilansfarm.warehouses;

import java.util.ArrayList;

public abstract class Container<E> {
    public ArrayList<E> contents;

//    public Container(ArrayList<E> contents) {
//        this.contents = contents;
//    }
//
//    public Container(Integer numberOfContents) {
//        this.contents = new ArrayList<E>(numberOfContents);
//    }
    public void add(E item) {
        this.contents.add(item);
    }

    public void remove(E item) {
        this.contents.remove(item);
    }

    public ArrayList<E> get() {
        return this.contents;
    }

    public void removeAll() {
        this.contents.clear();
    }



}