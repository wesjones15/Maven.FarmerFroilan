package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.animal.animalkinds.Horse;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.farm.field.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.TomatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Field;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Silo;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.io.IOException;
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
        System.out.println("Froilan eats his breakfast of an ear of corn, two tomatoes, and five eggs.");
        farm = feedPilot(farm, froilandaBreakfast);
        System.out.println("Froilanda eats her breakfast of two ears of corn, a tomato, and two eggs.");
        farm = rideHorses(farm);
        farm = feedHorses(farm);
        return farm;
    }

    public static Farm lunchMeals(Farm farm){
        farm = feedFarmer(farm, froilanLunch);
        System.out.println("Froilan eats his lunch of an ear of corn, two tomatoes, and three eggs.");
        farm = feedPilot(farm, froilandaLunch);
        System.out.println("Froilanda eats her lunch of an ear of corn, three tomatoes, and one egg.");
        farm = feedHorses(farm);
        return farm;
    }

    public static Farm dinnerMeals(Farm farm) {
        farm = feedFarmer(farm, froilanLDinner);
        System.out.println("Froila eats his dinner of two ears of corn, a tomato, and two eggs.");
        farm = feedPilot(farm, froilandaDinner);
        System.out.println("Froilanda eats her dinner of an ear of corn, three tomatoes, and one egg.");
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
        for (Stable stable : stables) {
            for (Horse horse : stable.get()) {
                farmer.mount(horse);
                horse.setHasBeenRidden(true);
                farmer.dismount();
                System.out.println("Yee haw, riding the horse");
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
        System.out.println("Froilan feeds the horses three ears of corn each.");
        return farm;
    }

    public static void promptEnterKey(){
        System.out.println("\nPress \"Enter\" to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printDaySummary(Farm farm){
//        System.out.println("Silo Contents:\n");
        System.out.println(farm.getSilo().toString());
    }

    public static Farm fertilize(Farm farm) {
        Pilot pilot = farm.getFarmHouse().getPilot();
        CropDuster cropDuster = farm.getCropDuster();
        cropDuster.mount(pilot);
        farm = cropDuster.operate(farm);
        System.out.println("Froilanda fertilizes all of the crops and crop dusts the entire farm in the process.  The pigs don't look thrilled.");
        return farm;
    }


    public static Farm harvest(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Tractor tractor = farm.getTractor();
        tractor.mount(farmer);
        farm = tractor.operate(farm);
        System.out.println("Froilan harvests the new crops.");
        return farm;
    }

    public static Farm plantField(Farm farm) {
        Farmer farmer = farm.getFarmHouse().getFarmer();
        Crop[] crops = {new CornStalk(), new TomatoPlant(), new CornStalk(), new CornStalk(), new TomatoPlant()};
        Field field = farm.getField();
        for (int i = 0; i < 5; i++) {
            CropRow cropRow;
            if (crops[i] instanceof CornStalk) {
                cropRow = plantCorn(farmer);
            }
            else if (crops[i] instanceof TomatoPlant) {
                cropRow = plantTomato(farmer);
            }
            else {
                cropRow = plantCorn(farmer);
            }
            field.add(cropRow);
        }
        farm.setField(field);
        System.out.println("Froilan spends all day planting the fields.");
        return farm;
    }

    public static CropRow plantCorn(Farmer farmer) {
        CropRow cropRow = new CropRow();
        for (int j = 0; j < 500; j++) {
            cropRow = farmer.plant(new CornStalk(), cropRow);
        }
        return cropRow;
    }

    public static CropRow plantTomato(Farmer farmer) {
        CropRow cropRow = new CropRow();
        for (int j = 0; j < 500; j++) {
            cropRow = farmer.plant(new TomatoPlant(), cropRow);
        }
        return cropRow;
    }


}
