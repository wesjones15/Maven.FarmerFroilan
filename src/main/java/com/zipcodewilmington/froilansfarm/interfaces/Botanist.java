package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.warehouses.containerkinds.CropRow;

public interface Botanist {

    CropRow plant (Crop crop, CropRow cropRow);

}
