package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OcpCorrectedTest
{
    private PetStore buy;

    @Before
    public void setUp() throws Exception
    {
        buy = new PetStore();
    }

    @Test
    public void testPrice()
    {
        Assert.assertEquals(15.16, buy.buyAnimal("tortoise"), 2);
    }
}
