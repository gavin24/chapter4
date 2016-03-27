package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.OpenClosedPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OcpViolatedTest
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
        Assert.assertEquals(5.16, buy.buyCat(),2);
    }
}
