package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.PrincipleOfLeastKnowledge.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PlkViolatedTest
{
    private IPerson oldInfo;

    @Before
    public void setUp() throws Exception
    {
        oldInfo = new Person("Sally", 12345);
    }

    @Test
    public void testPreviousHomeNumber() throws Exception
    {
        Assert.assertEquals(12345, oldInfo.getPreviousHome().getNumber());
    }
}
