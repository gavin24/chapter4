package za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EncapsulationTest
{
    private FavouriteFood fav;

    @Before
    public void setUp()
    {
        fav = new FavouriteFood("Amy", 12);
    }

    @Test
    public void testFood()
    {
        Assert.assertEquals("pasta", fav.getFavFood());
    }
}
