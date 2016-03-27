package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LskViolatedTest
{
    private Transport trans;

    @Before
    public void setUp() throws Exception
    {
        trans = new Walk();
    }

    @Test
    public void testTransportType() throws Exception
    {
        Assert.assertFalse(trans.drive());
    }
}
