package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PuppyTest {
//    @Test
//    public void testMakeNoise() {
//        Animal puppy = new Puppy();
//        String expected = "Bork";
//        String actual = puppy.makeNoise();
//        Assert.assertEquals(expected, actual);
//    }



    Puppy testPuppy;
    Edible corn;

    @Before
    public void setUp(){
        testPuppy = new Puppy();
        corn = new EarOfCorn();
    }

    @Test
    public void isAnimal(){
        Assert.assertTrue(testPuppy instanceof Animal);
    }

    @Test
    public void isNoiseMaker(){
        Assert.assertTrue(testPuppy instanceof NoiseMaker);
    }

    @Test
    public void isEater(){
        Assert.assertTrue(testPuppy instanceof Eater);
    }

    @Test
    public void isEdible(){
        Assert.assertTrue(testPuppy instanceof Edible);
    }

    @Test
    public void testGetWet(){
        Assert.assertTrue(testPuppy.getWet());
    }

    @Test
    public void testSetWet(){
        testPuppy.setWet(false);
        Assert.assertFalse(testPuppy.getWet());
    }

    @Test
    // tests eat and getStomachContents
    public void testEat(){
        testPuppy.eat(corn);
        Assert.assertEquals(1, testPuppy.getStomachContents().size());
    }

    @Test
    public void testGetStomachContents(){
        testPuppy.eat(corn);
        ArrayList<Edible> expected = new ArrayList<Edible>();
        expected.add(corn);
        Assert.assertEquals(expected, testPuppy.getStomachContents());
    }

    @Test
    public void testEmptyStomachContents(){
        testPuppy.eat(corn);
        Integer expected = 0;
        // emptyStomachContents returns 0 if successful
        Assert.assertEquals(expected, testPuppy.emptyStomachContents());
        // checks size and makes sure it also equals 0
        Assert.assertEquals(0, testPuppy.getStomachContents().size());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("[Wet Puppy]", testPuppy.getName());
    }

    @Test
    public void testSetName(){
        testPuppy.setName("Dry Puppy");
        Assert.assertEquals("Dry Puppy", testPuppy.getName());
    }

    @Test
    public void testMakeNoise() {
        Assert.assertEquals("Bork", testPuppy.makeNoise());
    }


}

