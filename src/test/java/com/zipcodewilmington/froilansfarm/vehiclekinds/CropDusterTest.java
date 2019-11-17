package com.zipcodewilmington.froilansfarm.vehiclekinds;

import com.zipcodewilmington.froilansfarm.peoplekinds.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    @Test
    public void testMakeNoise(){
        CropDuster cd = new CropDuster();
        String expected = "Neowww";
        String actual = cd.makeNoise();
        Assert.assertEquals(expected, actual);
    }

}
