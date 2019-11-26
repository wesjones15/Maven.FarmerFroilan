package com.zipcodewilmington.froilansfarm.utils;

import java.io.IOException;

public class Console {
    public static void print(String val, String... args) {
        System.out.printf(val, args);
    }

    public static void println(String val, String... args) {
        print(val+"\n", args);
    }

    public static void promptEnterKey(){
        //Jack, this breaks the tests
        System.out.println("\nPress \"Enter\" to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
