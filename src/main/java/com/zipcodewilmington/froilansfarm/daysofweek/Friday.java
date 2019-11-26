package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Pig;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.utils.Console;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;

import java.util.ArrayList;

public class Friday extends Day{
    public static Farm run(Farm farm){
        System.out.println("\n\n-------------------- FRIDAY --------------------\n");
        farm = morningActivities(farm);
        farm = harvest(farm);
        farm = napoleonRising(farm);
        return farm;
    }

    public static Farm harvest(Farm farm){
        ArrayList<ChickenCoop> chickenCoops = farm.getChickenCoops();
        Silo silo = farm.getSilo();

        for (ChickenCoop chickenCoop : chickenCoops) {
            for (Chicken chicken : chickenCoop.get()) {
                Edible yield = chicken.yield();
                if (yield != null) {
                    silo.add(yield);
                }
            }
        }

        farm.setSilo(silo);
        farm.setChickenCoops(chickenCoops);
        return farm;
    }

    public static Farm napoleonRising(Farm farm){
        Console.println("As Froilanda is walking past the barn, she sees Napoleon on a wooden box squealing.\n");
        Console.promptEnterKey();
        Pig napoleon = farm.getYard().getPig();
        napoleonStare(napoleon, farm);
        napoleonThreaten(napoleon, 2);
//        Console.promptEnterKey();
        return farm;
    }

    public static void napoleonStare(Pig napoleon, Farm farm){
        Console.println("The animals turn to Froilanda and disperse as Napoleon stares at her.");
        Console.promptEnterKey();
        Console.println("As Froilanda begins to walk away, Napoleon mumbles quietly.");
//        Console.promptEnterKey();
    }

    public static void napoleonThreaten(Pig napoleon, int num) {
        for (int i = 0; i < num; i++) {
            Console.println("\n[Napoleon]: \"" + napoleon.makeNoise() + "\"");
        }
//        Console.promptEnterKey();
    }
}
