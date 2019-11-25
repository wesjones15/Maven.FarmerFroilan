package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;


public class Wednesday extends Day {
    Farm farm;
    public static final Edible[] froilanLunch = {new EarOfCorn(), new Tomato(), new Tomato(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaLunch = {new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};

    public static final Edible[] froilanLDinner = {new EarOfCorn(), new EarOfCorn(), new Tomato(), new EdibleEgg(), new EdibleEgg()};
    public static final Edible[] froilandaDinner = {new EarOfCorn(), new Tomato(), new Tomato(), new Tomato(), new  EdibleEgg()};

    public static Farm run(Farm farm){
        farm = morningActivities(farm);
        farm = lunchMeals(farm);
        farm = dinnerMeals(farm);
        return farm;
    }

//    public Farm wednesdayMorning () {
//        return Day.morningActivities(farm);
//    }
//
//    public Farm wedensdayLunch () {
//        return Day.lunchMeals(farm);
//    }
//
//    public Farm wednesdayDinner () {
//        return Day.dinnerMeals(farm);
//    }




//    public static Farm afternoonEvening (Farm farm) {
//        farm = feedFarmer (farm, froilanLunch);
//        farm = pilotLunch(farm);
//        farm = rideHorses(farm);
//        farm = feedHorses(farm);
//        return farm;
//    }
//
//    public static Farm farmerLunch (Farm farm){
//        Farmer farmer = farm.getFarmHouse().getFarmer();
//        farm = farmer.eatMeal(froilanLunch, farm);
//        farm.getFarmHouse().setFarmer(farmer);
//        return farm;
//        }
//
//    public static Farm pilotLunch (Farm farm){
//        Pilot pilot = farm.getFarmHouse().getPilot();
//        farm = pilot.eatMeal(froilandaLunch, farm);
//        farm.getFarmHouse().setPilot(pilot);
//        return farm;
//    }
//
//    public static Farm farmerDinner (Farm farm){
//        Farmer farmer = farm.getFarmHouse().getFarmer();
//        farm = farmer.eatMeal(froilanLunch, farm);
//        farm.getFarmHouse().setFarmer(farmer);
//        return farm;
//    }

    public static Farm pilotDinner (Farm farm){
        Pilot pilot = farm.getFarmHouse().getPilot();
        farm = pilot.eatMeal(froilandaLunch, farm);
        farm.getFarmHouse().setPilot(pilot);
        return farm;
}



}
