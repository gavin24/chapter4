package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AdpCorrectedTest
{
    private Parent mom;

    @Before
    public void setUp() throws Exception
    {
        mom = new Parent();
    }

    @Test
    public void testMoneyDue() throws Exception
    {
        Assert.assertEquals(300.00, mom.getMoney(2000), 2);
    }
}
