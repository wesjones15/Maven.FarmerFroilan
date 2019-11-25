package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;

public class Silo extends Container<Edible> {

    //

    public Silo() {
        this.contents = new ArrayList<Edible>();
    }

    public void addAll(ArrayList<Edible> foods) {
        for (Edible food: foods) {
            this.add(food);
        }
    }

    public Integer getAmountOf(Edible food) {
        Integer count = 0;
        for (Edible f : this.contents) {
            if (f.getClass() == food.getClass()) {
                count++;
            }
        }
        return count;
    }

    public Edible getFood(Edible food) {
        if (getAmountOf(food) > 0) {
            this.remove(food);
            return food;
        }
        return null;
    }

    @Override
    public String toString() {
        Edible[] types = {new EarOfCorn(), new Tomato(), new EdibleEgg()};
        StringBuilder out = new StringBuilder().append("Silo Inventory");
        for (Edible food: types) {
            Integer amount = this.getAmountOf(food);
            out.append(String.format("\n\t%s x %s", food.getClass().getSimpleName(), amount));
        }
        return out.toString();
    }
}
