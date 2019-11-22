package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Day {
    public static final Edible[] froilanBreakfast = {new EarOfCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaBreakfast = {new EarOfCorn(), new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] horseMeal = {new EarOfCorn(), new EarOfCorn(), new EarOfCorn()};

//    public static Animal eatMeal(Animal eater, Edible[] meal, Farm farm) {
//        Silo silo = farm.getSilo();
//        for (Edible food : meal) {
//            Edible morsel = silo.getFood(food);
//            if (morsel == null) {
//                // we don't have any of that food
//                break;
//            }
//            eater.eat(morsel);
//        }
//        farm.setSilo(silo);
//        return eater;
//    }
    public static Farm rideHorses(Farm farm) {
        ArrayList<Stable> stables = farm.getStables();
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Pilot pilot = farm.getFarmHouse().getPilot();
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                farmer.mount(horse);
                horse.setHasBeenRidden(true);
                farmer.dismount();
            }
        }
        return farm;
    }

    public static Farm feedFarmer(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        farm = farmer.eatMeal(froilanBreakfast, farm);
        farm.getFarmHouse().setFarmer(farmer);
        return farm;
    }

    public static Farm feedPilot(Farm farm) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        farm = pilot.eatMeal(froilandaBreakfast, farm);
        farm.getFarmHouse().setPilot(pilot);
        return farm;
    }

    public static Farm feedHorses(Farm farm) {
        ArrayList<Stable> stables = farm.getStables();
        for (Stable stable : stables) {
            for (int i = 0; i < stable.get().size(); i++) {
                stable.get().get(i).eatMeal(horseMeal, farm);
            }
        }
        farm.setStables(stables);
        return farm;
    }
}
