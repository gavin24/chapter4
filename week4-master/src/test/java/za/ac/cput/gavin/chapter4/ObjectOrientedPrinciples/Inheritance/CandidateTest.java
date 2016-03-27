package za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CandidateTest
{
    private Candidate can;

    @Before
    public void setUp()
    {
        can = new Experience("Sandy", 5);
    }

    @Test
    public void testQualification()
    {
        Assert.assertFalse(can.getQualifies());
    }
}
