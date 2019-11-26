package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;
import java.util.HashMap;

public class Silo {
    private HashMap<String, Integer> inv;
    private final String[] types = {"EarOfCorn", "Tomato", "EdibleEgg"};

    public Silo() {
        this.inv = initMap();
    }

    public HashMap<String, Integer> initMap() {
        HashMap<String, Integer> inv = new HashMap<String, Integer>();
        for (String food : types) {
            inv.put(food, 0);
        }
        return inv;
    }

    public void addAll(ArrayList<Edible> foods) {
        for (Edible food: foods) {
            this.add(food);
        }
    }

    public void add(Edible food) {
        Integer count = inv.get(food.getClass().getSimpleName()) + 1;
        inv.put(food.getClass().getSimpleName(), count);
    }

    public void remove(Edible food) {
        Integer count = inv.get(food.getClass().getSimpleName()) - 1;
        inv.put(food.getClass().getSimpleName(), count);
    }

    public void removeAll() {
        this.inv = initMap();
    }

    public Integer getAmountOf(Edible food) {
        return inv.get(food.getClass().getSimpleName());
    }

    public Integer size() {
        Integer size = 0;
        for (String food : types) {
            size += inv.get(food);
        }
        return size;
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
        StringBuilder out = new StringBuilder().append("Silo Inventory");
        for (String foodName : types) {
            out.append(String.format("\n\t%s x %s", foodName, inv.get(foodName)));
        }
        return out.toString();


    }
}
