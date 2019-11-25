package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Pig;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;

public class Saturday extends Day{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static Farm run(Farm farm) {
        System.out.println("\n\n-------------------- SATURDAY --------------------\n");
        farm = morning(farm);
        farm = fertilize(farm);
        napoleonEmerges(farm);
        return farm;
    }

    public static Farm fertilize(Farm farm) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        CropDuster cropDuster = farm.getCropDuster();
        cropDuster.mount(pilot);
        farm = cropDuster.operate(farm);
        return farm;
    }

    public static Farm napoleonEmerges(Farm farm){
        System.out.println("\nAs Froilan and Froilanda finish their breakfast, they hear a noise from outside.\n" +
                "It sounds like chanting..........\n");
        promptEnterKey();
        Pig napoleon = farm.getYard().getPig();
        callAndRepeat(napoleon, 5);
        burnItDown(napoleon, farm);
        return farm;
    }

    public static void callAndRepeat(Pig napoleon, int num){
        for (int i = 0; i < num; i++){
            System.out.println("\n[Napoleon]: \"" + napoleon.makeNoise() + "\"");
            System.out.println("[Animals]: \"Four legs good, two legs bad.\"");
        }
        promptEnterKey();
    }

    public static Farm burnItDown(Pig napoleon, Farm farm){
        // set everything to zero
        // can I kill anyone???
        farm.setSilo(null);
        System.out.println("\nThe silo is on fire........");
        callAndRepeat(napoleon, 1);
        farm.setFarmHouse(null);
        System.out.println("\nThe farmhouse is on fire........");
        callAndRepeat(napoleon, 1);
        farm.setField(null);
        System.out.println("\nThe crops are on fire........");
        callAndRepeat(napoleon, 1);
        System.out.println("\nThe farmers are both missing.........");
        callAndRepeat(napoleon, 1);
        System.out.println(asciiBurnArt());
        return farm;
    }

    public static String asciiBurnArt(){
        // ascii art of burning farm
        return "                                                                      \n" +
                "                                                __,-O<            ,-- \n" +
                "--.                                  \\.          -='            -'    \n" +
                "   \\                                __\\\\O-                      ,---  \n" +
                "   --.                                `^                       /      \n" +
                "      ).          __,-O<    \\              __,-O<            ,--      \n" +
                " ----'  `.          `\\)   __)\\O-__           )/          ,--(    ,;:. \n" +
                "         _)          /      `^  _)\\O<  " + ANSI_RED + " (   ." + ANSI_RESET + "            (_     .:;:;.\n" +
                "       |         |               `^      " + ANSI_RED + ")  )'" + ANSI_RESET + "                :;';.;:'\n" +
                "       |_" + ANSI_RED + "(   ." + ANSI_RESET + "   |_        |        " + ANSI_RED + "( ( (\" )" + ANSI_RESET + "                   ';\\||' \n" +
                "______/=\\" + ANSI_RED + ")  )'" + ANSI_RESET + "__/=\\\\_______|       " + ANSI_RED + "_'_.,)_(." + ANSI_RESET + "                      :|  \n" +
                "'-'-'-" + ANSI_RED + " ' (( (\" )" + ANSI_RESET + "[=]/'-'-'-/'.=:=:" + ANSI_RED + "." + ANSI_RESET + ":=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=:=\n" +
                "-'-'-'" + ANSI_RED + ",._'_.,)_(." + ANSI_RESET + "'-'-'-'-/   '.   " + ANSI_RED + ")" + ANSI_RESET + "                                  |\n" +
                "'-'-'-'-'-'-'-'-'-'-'-'-/    .-'" + ANSI_RED + "((" + ANSI_RESET + "          .--.--.                |/|\n" +
                "-'-'-'-'-'-'-'-'-'-'-'-/ _.-'.-:" + ANSI_RED + "' )" + ANSI_RESET + "       .; .;|;. ;.            |/|/ \n" +
                "       ___       ___   |' _.'\\ :|--|--|- .;_;'   ';_;. --|--|--|/|/   \n" +
                "|]   [|_|_|]   [|_|_|] | |\\ | \\:|--|--| ; ;'       '; ; -|--|--|/     \n" +
                "|]   [|_|_|]   [|_|_|] | | \\|--'       ;; .--.___.--. ;;     " + ANSI_RED + ")" + ANSI_RESET + "       \n" +
                "_______________________| |.-'          ;-[(_) )=( (_)]-;   " + ANSI_RED + "(" + ANSI_RESET + "\n" +
                "      " + ANSI_RED + "(" + ANSI_RESET + "              |/|               (  `--' | `--'  )   " + ANSI_RED + " ." + ANSI_RESET + "           \n" +
                "     __" + ANSI_RED + ")" + ANSI_RESET + "_.-\".      |/|/                 \\|    (      |/ " + ANSI_RED + "   (.   )" + ANSI_RESET + "  \n" +
                "   ;( ,__.)/='   |/|/                    .  .:::::.  .    " + ANSI_RED + " ,  (   " + ANSI_RESET + "      \n" +
                "   ; |/  \\|    |/|/                       .  '---'  .     " + ANSI_RED + "( , ') " + ANSI_RESET + "\n" +
                "     \\    |  |/|/                         |`.     .'|     " + ANSI_RED + "')  (,   " + ANSI_RESET + "   \n" +
                "      `   `|/|/                  ,-------/|  `...'  |\\-------,        \n" +
                "|--|--|--|/|/                  ,'       | `.       ,' |       `,      \n" +
                "|--|--|--|/  " + ANSI_RED + ".      \"" + ANSI_RESET + "         /         \\  /'.   ,'\\  /         \\     \n" +
                "             " + ANSI_RED + " )  . (`" + ANSI_RESET + "        ;           |/   \\ /   \\|           ;    \n" +
                "            " + ANSI_RED + "((  (  ;)" + ANSI_RESET + "        ;    ;   /  '     |.    '  \\  \\;    ;    \n" +
                "           " + ANSI_RED + "_' )_') (." + ANSI_RESET + "       ;      `-'         |         `-'          ";
    }

}

