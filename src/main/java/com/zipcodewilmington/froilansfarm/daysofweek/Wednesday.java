package com.zipcodewilmington.froilansfarm.daysofweek;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import com.zipcodewilmington.froilansfarm.peoplekinds.Pilot;
import com.zipcodewilmington.froilansfarm.utils.Console;


public class Wednesday extends Day {

    public static Farm run(Farm farm){
        Console.println("\n\n-------------------- WEDNESDAY --------------------\n");
        farm = morningActivities(farm);
        farm = lunchMeals(farm);
        farm = fertilize(farm);
        farm = harvest(farm);
        farm = dinnerMeals(farm);
        printDaySummary(farm);
        printWednesdayNarrative();
//        promptEnterKey();
        return farm;
    }

    private static void printWednesdayNarrative() {
        Console.println(
                "Things are normal on the farm.\n" +
                        "The chickens roost, the horses neigh, and Napoleon and Old Major are enjoying the company of the other animals.\n" +
                        "The animals are happy it's hump day - they start making their plans for the weekend\n\n\n" +
                        "There is faint singing in the background........\n\n");
                Console.promptEnterKey();
                Console.println(
                        "\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\n" +
                        "\uD83C\uDFB5 Beasts of England, beasts of Ireland  \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Beasts of every land and clime         \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Hearken to my joyful tidings           \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Of the golden future time              \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Soon or late the day is coming         \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Tyrant Man shall be o'erthrown         \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5And the fruitful fields of England     \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Shall be trod by beasts alone          \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Rings shall vanish from our noses      \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5And the harness from our back          \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Bit and spur shall rust forever        \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Cruel whips no more shall crack        \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Riches more than mind can picture      \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Wheat and barley, oats and hay         \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Clover, beans, and mangel-wurzels      \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Shall be ours upon that day            \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Bright will shine the fields of England\uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Purer shall its waters be              \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Sweeter yet shall blow its breezes     \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5On the day that sets us free           \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5For that day we all must labour        \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Though we die before it break          \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Cows and horses, geese and turkeys     \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5All must toil for freedom's sake       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5                                       \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Beasts of England, beasts of Ireland   \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Beasts of every land and clime         \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Hearken well and spread my tidings     \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5Of the golden future time              \uD83C\uDFB5\n" +
                        "\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5");
    }




}
