package com.zipcodewilmington.froilansfarm.peoplekinds;

        import org.junit.Assert;
        import org.junit.Test;

public class FarmerTest {
    @Test
    public void testMakeNoise(){
        Farmer froilan = new Farmer();
        String expected = "Yee Yee";
        String actual = froilan.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
