package com.zipcodewilmington.froilansfarm.peoplekinds;

        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

public class FarmerTest {
    Farmer froilan;

    @Before
    public void setUp() throws Exception {
       froilan = new Farmer("Ol Farmer Froilan");
    }

    @Test
    public void testMakeNoise(){
        String expected = "Yee Yee";
        String actual = froilan.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Ol Farmer Froilan";
        String actual = froilan.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setName() {
        String expected = "Lil Richard";
        froilan.setName(expected);
        String actual  = froilan.getName();
        Assert.assertEquals(expected,actual);
    }

}
