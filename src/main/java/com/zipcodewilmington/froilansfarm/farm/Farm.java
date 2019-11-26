package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.vehiclekinds.CropDuster;
import com.zipcodewilmington.froilansfarm.vehiclekinds.Tractor;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.*;
//import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.ChickenCoop;
//import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.FarmHouse;
//import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.Stable;

import java.util.ArrayList;

public class Farm {
    private Tractor tractor;
    private CropDuster cropDuster;
    private Field field;
    private Silo silo;
    private FarmHouse farmHouse;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Stable> stables;
    private Yard yard;

    public Farm(Tractor tractor, CropDuster cropDuster, Field field, Silo silo, FarmHouse farmHouse, ArrayList<ChickenCoop> chickenCoops, ArrayList<Stable> stables, Yard yard){
        this.tractor = tractor;
        this.cropDuster = cropDuster;
        this.field = field;
        this.silo = silo;
        this.farmHouse = farmHouse;
        this.chickenCoops = chickenCoops;
        this.stables = stables;
        this.yard = yard;
    }

    public Farm() {
        this(new Tractor(), new CropDuster(), new Field(), new Silo(), new FarmHouse(), new ArrayList<ChickenCoop>(), new ArrayList<Stable>(), new Yard());
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cropDuster = cropDuster;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Silo getSilo() {
        return silo;
    }

    public void setSilo(Silo silo) {
        this.silo = silo;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Yard getYard(){
        return yard;
    }

    public void setYard(Yard yard){ this.yard = yard;}

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public void addChickenCoop() {
        chickenCoops.add(new ChickenCoop());
    }

    public ChickenCoop getChickenCoop(Integer index) {
        return chickenCoops.get(index);
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public void addStable() {
        stables.add(new Stable());
    }

    public Stable getStable(Integer index) {
        return stables.get(index);
    }
}
