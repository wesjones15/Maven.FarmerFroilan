package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {
    TomatoPlant tomatoPlant;
    Tomato tomato;

    @Before
    public void setUp(){
        tomatoPlant = new TomatoPlant();
        tomato = new Tomato();
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(false, tomatoPlant.hasBeenFertilized);
        Assert.assertEquals(false, tomatoPlant.hasBeenHarvested);
    }

    @Test
    public void testYield1(){
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(false);
        Assert.assertEquals(tomato.getClass(), tomatoPlant.yield().getClass());
    }

    @Test
    public void testYield2(){
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(false);
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

    @Test
    public void testYield3(){
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(true);
        Assert.assertNull(tomatoPlant.yield());
    }
}
