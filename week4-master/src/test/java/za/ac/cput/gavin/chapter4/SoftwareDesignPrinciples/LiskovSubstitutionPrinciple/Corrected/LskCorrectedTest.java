package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LskCorrectedTest
{
    private Transport trans;

    @Before
    public void setUp() throws Exception
    {
        trans = new Car();
    }

    @Test
    public void testTransportType() throws Exception
    {
        Assert.assertTrue(trans.drive());
    }
}
