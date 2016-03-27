package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleResponsibilityPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected.ATMService;
import za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected.Services;


public class SrpCorrectedTest
{
    private ATMService serv;

    @Before
    public void setUp() throws Exception
    {
        serv = new Services(52000);
    }

    @Test
    public void testAmount()
    {
        Assert.assertNotNull(serv.withdrawal(5000));
    }
}
