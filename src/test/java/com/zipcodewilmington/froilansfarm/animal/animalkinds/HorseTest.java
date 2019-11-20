package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class HorseTest {


    Horse testHorse;
    Edible corn;

    @Before
    public void setUp(){
        testHorse = new Horse();
        corn = new EarOfCorn();
    }

    @Test
    public void isAnimal(){
        Assert.assertTrue(testHorse instanceof Animal);
    }

    @Test
    public void isNoiseMaker(){
        Assert.assertTrue(testHorse instanceof NoiseMaker);
    }

    @Test
    public void isEater(){
        Assert.assertTrue(testHorse instanceof Eater);
    }

    @Test
    public void isRidable(){
        Assert.assertTrue(testHorse instanceof Rideable);
    }

    @Test
    public void isEdible(){
        Assert.assertTrue(testHorse instanceof Edible);
    }

    @Test
    // tests eat and getStomachContents
    public void testEat(){
        testHorse.eat(corn);
        Assert.assertEquals(1, testHorse.getStomachContents().size());
    }

    @Test
    public void testGetStomachContents(){
        testHorse.eat(corn);
        ArrayList<Edible> expected = new ArrayList<Edible>();
        expected.add(corn);
        Assert.assertEquals(expected, testHorse.getStomachContents());
    }

    @Test
    public void testEmptyStomachContents(){
        testHorse.eat(corn);
        Integer expected = 0;
        // emptyStomachContents returns 0 if successful
        Assert.assertEquals(expected, testHorse.emptyStomachContents());
        // checks size and makes sure it also equals 0
        Assert.assertEquals(0, testHorse.getStomachContents().size());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("[Gleu]", testHorse.getName());
    }

    @Test
    public void testSetName(){
        testHorse.setName("HesNoSecretariat");
        Assert.assertEquals("HesNoSecretariat", testHorse.getName());
    }

    @Test
    public void testMakeNoise() {
        Assert.assertEquals("Neigh", testHorse.makeNoise());
    }

}
