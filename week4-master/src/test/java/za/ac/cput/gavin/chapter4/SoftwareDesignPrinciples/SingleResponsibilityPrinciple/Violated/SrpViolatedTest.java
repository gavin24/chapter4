package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleResponsibilityPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated.ATMService;
import za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated.Services;


public class SrpViolatedTest
{
    private ATMService serv;

    @Before
    public void setUp() throws Exception
    {
        serv = new Services();
    }

    @Test
    public void testAmount()
    {
        Assert.assertNotNull(serv.buyCar(4));
    }
}
