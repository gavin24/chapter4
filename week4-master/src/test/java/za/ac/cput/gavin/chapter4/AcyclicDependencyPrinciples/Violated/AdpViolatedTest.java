package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AdpViolatedTest
{
    private Parent mom;

    @Before
    public void setUp() throws Exception
    {
        mom = new Parent(1500);
    }

    @Test
    public void testMoneyDue() throws Exception
    {
        Assert.assertNotNull(mom.getMoney());
    }
}
