package com.zipcodewilmington.froilansfarm.utils;

public class Console {
    public static void print(String val, String... args) {
        System.out.printf(val, args);
    }

    public static void println(String val, String... args) {
        print(val+"\n", args);
    }
}
