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
    private Edible [] food;
    public static final Edible[] froilanBreakfast = {new EarOfCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaBreakfast = {new EarOfCorn(), new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};

    public static final Edible[] froilanLunch = {new EarOfCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaLunch = {new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};

    public static final Edible[] froilanLDinner = {new EarOfCorn(), new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaDinner = {new EarOfCorn(), new Tomato(), new Tomato(), new Tomato(), new  EdibleEgg()};

    public static final Edible[] horseMeal = {new EarOfCorn(), new EarOfCorn(), new EarOfCorn()};

    public static Farm morningActivities(Farm farm) {
        farm = feedFarmer(farm, froilanBreakfast);
        farm = feedPilot(farm, froilandaBreakfast);
        farm = rideHorses(farm);
        farm = feedHorses(farm);
        return farm;
    }

    public static Farm lunchMeals(Farm farm){
        farm = feedFarmer(farm, froilanLunch);
        farm = feedPilot(farm, froilandaLunch);
        farm = feedHorses(farm);
        return farm;
    }

    public static Farm dinnerMeals(Farm farm) {
        farm = feedFarmer(farm, froilanLDinner);
        farm = feedPilot(farm, froilandaDinner);
        farm = feedHorses(farm);
        return farm;
    }


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

    public static Farm feedFarmer(Farm farm , Edible[] food ) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        farm = farmer.eatMeal(food, farm);
        farm.getFarmHouse().setFarmer(farmer);
        return farm;
    }

    public static Farm feedPilot(Farm farm, Edible[] food) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        farm = pilot.eatMeal(food, farm);
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
