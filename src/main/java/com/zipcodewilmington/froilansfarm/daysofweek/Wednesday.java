package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;


public class Wednesday extends Day {

    public static Farm run(Farm farm){
        System.out.println("\n\n-------------------- WEDNESDAY --------------------\n");
        farm = morningActivities(farm);
        farm = lunchMeals(farm);
        farm = fertilize(farm);
        farm = harvest(farm);
        farm = dinnerMeals(farm);
        printDaySummary(farm);
        printMondayNarrative();
        promptEnterKey();
        return farm;
    }

    private static void printMondayNarrative() {
        System.out.println(
                "Things are normal on the farm.\n" +
                        "The chickens roost, the horses neigh, and Napoleon is enjoying the company of the other animals.\n" +
                        "The animals are happy it's hump day - they start making their plans for the weekend\n\n" +
                        "There is faint singing in the background........\n" +
                        "Beasts of England, beasts of Ireland\n" +
                        "Beasts of every land and clime\n" +
                        "Hearken to my joyful tidings\n" +
                        "Of the golden future time\n" +
                        "\n" +
                        "Soon or late the day is coming\n" +
                        "Tyrant Man shall be o'erthrown\n" +
                        "And the fruitful fields of England\n" +
                        "Shall be trod by beasts alone\n" +
                        "\n" +
                        "Rings shall vanish from our noses\n" +
                        "And the harness from our back\n" +
                        "Bit and spur shall rust forever\n" +
                        "Cruel whips no more shall crack\n" +
                        "\n" +
                        "Riches more than mind can picture\n" +
                        "Wheat and barley, oats and hay\n" +
                        "Clover, beans, and mangel-wurzels\n" +
                        "Shall be ours upon that day\n" +
                        "\n" +
                        "Bright will shine the fields of England\n" +
                        "Purer shall its waters be\n" +
                        "Sweeter yet shall blow its breezes\n" +
                        "On the day that sets us free\n" +
                        "\n" +
                        "For that day we all must labour\n" +
                        "Though we die before it break\n" +
                        "Cows and horses, geese and turkeys\n" +
                        "All must toil for freedom's sake\n" +
                        "\n" +
                        "Beasts of England, beasts of Ireland\n" +
                        "Beasts of every land and clime\n" +
                        "Hearken well and spread my tidings\n" +
                        "Of the golden future time");
    }




}
