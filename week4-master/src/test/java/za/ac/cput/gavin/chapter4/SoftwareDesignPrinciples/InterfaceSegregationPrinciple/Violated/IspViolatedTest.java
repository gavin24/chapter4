package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class IspViolatedTest
{
    private Person tom;

    @Before
    public void setUp() throws Exception
    {
        tom = new Lecturer();
    }

    @Test
    public void testPersonType() throws Exception
    {
        Assert.assertFalse(tom.studies());
    }
}
