package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class IspCorrectedTest
{
    private IStudent clara;

    @Before
    public void setUp() throws Exception
    {
        clara = new Student();
    }

    @Test
    public void testPersonType() throws Exception
    {
        Assert.assertTrue(clara.studies());
    }
}
