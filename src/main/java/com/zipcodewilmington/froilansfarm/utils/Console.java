package com.zipcodewilmington.froilansfarm.utils;

import java.io.IOException;
import java.util.Scanner;

public class Console {

    public static Scanner scanner = new Scanner(System.in);
    // NOTE - THE PROMPT ENTER WAS A BIT BROKEN
    // IT WAS IGNORING THE FIRST ENTER, THEN SKIPPING TO STEPS ON THE SECOND ENTER
    // WE WERE DECLARING THE SCANNER WITHIN THE promptEnterKey() METHOD
    // MOVING IT UP HERE FIXED THE ISSUE

    public static void print(String val, String... args) {
        System.out.printf(val, args);
    }

    public static void println(String val, String... args) {
        print(val+"\n", args);
    }

    public static void promptEnterKey(){
        System.out.println("\nPress \"Enter\" to continue...");
            scanner.nextLine();
    }

}
