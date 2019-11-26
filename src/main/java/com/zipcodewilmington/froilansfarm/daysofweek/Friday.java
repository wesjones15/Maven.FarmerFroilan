package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;

import java.util.ArrayList;

public class Friday extends Day{
    public static Farm run(Farm farm){
        System.out.println("\n\n-------------------- FRIDAY --------------------\n");
        farm = morningActivities(farm);
        farm = harvest(farm);
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


}
