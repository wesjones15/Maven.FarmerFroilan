package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Pig;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.utils.Console;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;

public class Saturday extends Day{

    public static Farm run(Farm farm) {
        Console.println("\n\n-------------------- SATURDAY --------------------\n");
        farm = morningActivities(farm);
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
        Console.println("\nAs Froilan and Froilanda finish their breakfast, they hear a noise from outside.\n" +
                "It sounds like chanting..........\n");
        Console.promptEnterKey();
        Pig napoleon = farm.getYard().getPig();
        callAndRepeat(napoleon, 5);
        burnItDown(napoleon, farm);
        return farm;
    }

    public static void callAndRepeat(Pig napoleon, int num){
        for (int i = 0; i < num; i++){
            Console.println("\n[Napoleon]: \"" + napoleon.makeNoise() + "\"");
            Console.println("[Animals]: \"Four legs good, two legs bad.\"");
        }
        Console.promptEnterKey();
    }

    public static Farm burnItDown(Pig napoleon, Farm farm){
        // set everything to zero
        // can I kill anyone???
        farm.setSilo(null);
        Console.println(ANSI_RED + "\nThe silo is on fire........" + ANSI_RESET);
        callAndRepeat(napoleon, 1);
        farm.setFarmHouse(null);
        Console.println(ANSI_RED + "\nThe farmhouse is on fire........" + ANSI_RESET);
        callAndRepeat(napoleon, 1);
        farm.setField(null);
        Console.println(ANSI_RED + "\nThe crops are on fire........" + ANSI_RESET);
        callAndRepeat(napoleon, 1);
        Console.println(ANSI_RED + "\nThe farmers are both missing........." + ANSI_RESET);
        callAndRepeat(napoleon, 1);
        Console.println(asciiBurnArt());
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
                "-'ALL ANIMALS ARE'-'-'-/ _.-'.-:" + ANSI_RED + "' )" + ANSI_RESET + "       .; .;|;. ;.            |/|/ \n" +
                "   CREATED EQUAL ___   |' _.'\\ :|--|--|- .;_;'   ';_;. --|--|--|/|/   \n" +
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

