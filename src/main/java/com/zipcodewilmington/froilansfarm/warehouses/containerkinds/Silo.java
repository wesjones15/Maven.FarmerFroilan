package com.zipcodewilmington.froilansfarm.warehouses.containerkinds;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.warehouses.Container;

import java.util.ArrayList;
import java.util.HashMap;

public class Silo extends Container<Edible> {
    private HashMap<String, Integer> inv;

    public Silo() {
        this.contents = new ArrayList<Edible>();
        this.inv = initMap();
    }

    public HashMap<String, Integer> initMap() {
        HashMap<String, Integer> inv = new HashMap<String, Integer>();
        inv.put("EarOfCorn", 0);
        inv.put("Tomato", 0);
        inv.put("EdibleEgg", 0);
        return inv;
    }

    public void addAll(ArrayList<Edible> foods) {
        for (Edible food: foods) {
            this.add(food);
        }
    }

    @Override
    public void add(Edible food) {
        Integer count = inv.get(food.getClass().getSimpleName()) + 1;
        inv.put(food.getClass().getSimpleName(), count);
    }

    @Override
    public void remove(Edible food) {
        Integer count = inv.get(food.getClass().getSimpleName()) - 1;
        inv.put(food.getClass().getSimpleName(), count);
    }

    @Override
    public void removeAll() {
        this.inv = initMap();
    }

    public Integer getAmountOf(Edible food) {
//        Integer count = 0;
//        for (Edible f : this.contents) {
//            if (f.getClass() == food.getClass()) {
//                count++;
//            }
//        }
//
//        return count;
        return inv.get(food.getClass().getSimpleName());
    }

    public Integer size() {
        String[] types = {"EarOfCorn", "Tomato", "EdibleEgg"};
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
        else
            return null;
    }

    @Override
    public String toString() {
//        Edible[] types = {new EarOfCorn(), new Tomato(), new EdibleEgg()};
        String[] types = {"EarOfCorn", "Tomato", "EdibleEgg"};
        StringBuilder out = new StringBuilder().append("Silo Inventory");
//        for (Edible food: types) {
        for (String foodName : types) {
//            Integer amount = this.getAmountOf(food);
//            Integer amount = inv.get(food.getClass().getSimpleName());
            Integer amount = inv.get(foodName);
            out.append(String.format("\n\t%s x %s", foodName, amount));
        }
        return out.toString();


    }
}
