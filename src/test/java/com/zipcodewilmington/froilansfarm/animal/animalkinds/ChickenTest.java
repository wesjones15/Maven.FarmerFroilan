package com.zipcodewilmington.froilansfarm.animal.animalkinds;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EarOfCorn;
import com.zipcodewilmington.froilansfarm.farm.ediblefoods.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenTest {

    Chicken testChicken;
    Edible corn;

    @Before
    public void setUp(){
        testChicken = new Chicken();
        corn = new EarOfCorn();
    }

    @Test
    public void isAnimal(){
        Assert.assertTrue(testChicken instanceof Animal);
    }

    @Test
    public void isNoiseMaker(){
        Assert.assertTrue(testChicken instanceof NoiseMaker);
    }

    @Test
    public void isEater(){
        Assert.assertTrue(testChicken instanceof Eater);
    }

    @Test
    // tests eat and getStomachContents
    public void testEat(){
        testChicken.eat(corn);
        Assert.assertEquals(1, testChicken.getStomachContents().size());
    }

    @Test
    public void testGetStomachContents(){
        testChicken.eat(corn);
        ArrayList<Edible> expected = new ArrayList<Edible>();
        expected.add(corn);
        Assert.assertEquals(expected, testChicken.getStomachContents());
    }

    @Test
    public void testEmptyStomachContents(){
        testChicken.eat(corn);
        Integer expected = 0;
        // emptyStomachContents returns 0 if successful
        Assert.assertEquals(expected, testChicken.emptyStomachContents());
        // checks size and makes sure it also equals 0
        Assert.assertEquals(0, testChicken.getStomachContents().size());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("[Fingers]", testChicken.getName());
    }

    @Test
    public void testSetName(){
        testChicken.setName("Sgt Cluckers");
        Assert.assertEquals("Sgt Cluckers", testChicken.getName());
    }

    @Test
    public void testMakeNoise() {
        Assert.assertEquals("Bawk", testChicken.makeNoise());
    }

    @Test
    public void testFertilize() {
        testChicken.fertilize();
        Assert.assertTrue(testChicken.getHasBeenFertilized());
    }

    @Test
    // if not fertilized, should yiels an EdibleEgg
    public void testYield() {
        testChicken.setHasBeenFertilized(false);
        Assert.assertTrue(testChicken.yield().getClass() == new EdibleEgg().getClass());
    }

    @Test
    // if fertilized, yields nothing
    public void testYield2(){
        testChicken.fertilize();
        Assert.assertNull(testChicken.yield());
    }

    @Test
    public void getHasBeenFertilized() {
        testChicken.fertilize();
        Assert.assertTrue(testChicken.getHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilized() {
        testChicken.fertilize();
        testChicken.setHasBeenFertilized(false);
        Assert.assertFalse(testChicken.getHasBeenFertilized());
    }

    // moving these methods to the silo
//    @Test
//    public void getEggs() {
//    }
//
//    @Test
//    public void setEggs() {
//    }
//
//    @Test
//    public void countEggs() {
//    }

}
