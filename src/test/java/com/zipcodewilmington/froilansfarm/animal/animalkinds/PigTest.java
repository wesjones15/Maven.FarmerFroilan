package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PigTest {

    Pig testPig;
    Edible humanFood;

    @Before
    public void setUp(){
        testPig = new Pig();
        humanFood = new EarOfCorn();
    }

    @Test
    public void isAnimal(){
        Assert.assertTrue(testPig instanceof Animal);
    }

    @Test
    public void isNoiseMaker(){
        Assert.assertTrue(testPig instanceof NoiseMaker);
    }

    @Test
    public void isEater(){
        Assert.assertTrue(testPig instanceof Eater);
    }

    @Test
    public void isEdible(){
        Assert.assertTrue(testPig instanceof Edible);
    }

    @Test
    // tests eat and getStomachContents
    public void testEat(){
        testPig.eat(humanFood);
        Assert.assertEquals(1, testPig.getStomachContents().size());
    }

    @Test
    public void testGetStomachContents(){
        testPig.eat(humanFood);
        ArrayList<Edible> expected = new ArrayList<Edible>();
        expected.add(humanFood);
        Assert.assertEquals(expected, testPig.getStomachContents());
    }

    @Test
    public void testEmptyStomachContents(){
        testPig.eat(humanFood);
        Integer expected = 0;
        // emptyStomachContents returns 0 if successful
        Assert.assertEquals(expected, testPig.emptyStomachContents());
        // checks size and makes sure it also equals 0
        Assert.assertEquals(0, testPig.getStomachContents().size());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("[Some Pig]", testPig.getName());
    }

    @Test
    public void testSetName(){
        testPig.setName("Napoleon");
        Assert.assertEquals("Napoleon", testPig.getName());
        Assert.assertEquals("Four legs good, two legs bad.", testPig.makeNoise());
    }

    @Test
    public void testMakeNoise() {
        Assert.assertEquals("Oink", testPig.makeNoise());
    }


}