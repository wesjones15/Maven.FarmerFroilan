package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {
    CornStalk cornstalk;
    EarOfCorn ear;

    @Before
    public void setUp(){
        cornstalk = new CornStalk();
        ear = new EarOfCorn();
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals(false, cornstalk.hasBeenFertilized);
        Assert.assertEquals(false, cornstalk.hasBeenHarvested);
    }

    @Test
    public void testYield1(){
        cornstalk.setHasBeenFertilized(true);
        cornstalk.setHasBeenHarvested(false);
        Assert.assertEquals(ear.getClass(), cornstalk.yield().getClass());
    }

    @Test
    public void testYield2(){
        cornstalk.setHasBeenFertilized(true);
        cornstalk.setHasBeenHarvested(false);
        Assert.assertTrue(cornstalk.yield() instanceof EarOfCorn);
    }

    @Test
    public void testYield3(){
        cornstalk.setHasBeenFertilized(true);
        cornstalk.setHasBeenHarvested(true);
        Assert.assertNull(cornstalk.yield());
    }
}
