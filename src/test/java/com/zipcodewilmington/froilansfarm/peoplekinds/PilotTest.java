package com.zipcodewilmington.froilansfarm.peoplekinds;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    @Test
    public void testMakeNoise(){
        Pilot froilanda = new Pilot();
        String expected = "I'm gonna fly";
        String actual = froilanda.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
