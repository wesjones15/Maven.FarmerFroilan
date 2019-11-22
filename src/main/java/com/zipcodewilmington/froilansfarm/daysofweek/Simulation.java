package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Chicken;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.Container;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Simulation {
    Farm farm;
    Farmer farmer;
    Pilot pilot;

    public Simulation() {
        farm = new Farm();
        farmer = new Farmer("Froilan");
        pilot = new Pilot("Froilanda");
    }

    public void init() {
        farm.getFarmHouse().add(farmer);
        farm.getFarmHouse().add(pilot);
        farm.setSilo(preFillSilo());
        farm.setStables(populateHorses(farm));
        farm.setChickenCoops(populateChickens(farm));
    }

    public void run() {
        init();
        farm = Sunday.run(farm);
        farm = Monday.run(farm);
        farm = Tuesday.run(farm);
    }

    public ArrayList<Stable> populateHorses(Farm farm) {
        Integer amountPer = 3;
        ArrayList<Stable> stables = farm.getStables();
        for (int i = 0; i < 3; i++) {
            Stable stable = new Stable();
            if (i == 2) amountPer = 4;
            for (int j = 0; j < amountPer; j++) {
                stable.add(new Horse());
            }
            stables.add(stable);
        }
        return stables;
    }

    public ArrayList<ChickenCoop> populateChickens(Farm farm) {
        Integer amountPer = 4;
        ArrayList<ChickenCoop> coops = farm.getChickenCoops();
        for (int i = 0; i < 4; i++) {
            ChickenCoop coop = new ChickenCoop();
            if (i == 3) amountPer = 3;
            for (int j = 0; j < amountPer; j++) {
                coop.add(new Chicken());
            }
            coops.add(coop);
        }
        return coops;
    }

    public Silo preFillSilo() {
        Silo silo = new Silo();
        for (int i = 0; i < 20; i++) {
            silo.add(new EarOfCorn());
            silo.add(new Tomato());
            silo.add(new EdibleEgg());
        }
        return silo;
    }

//    public void rideHorses(Farm farm) {
//        ArrayList<Stable> stables = farm.getStables();
//        Farmer farmer = farm.getFarmHouse().getFarmer();
//        Pilot pilot = farm.getFarmHouse().getPilot();
//        for (Stable stable : stables) {
//            for (Horse horse : stable.get()) {
//                farmer.mount(horse);
//                horse.setHasBeenRidden(true);
//                farmer.dismount();
//            }
//        }
//    }
}
