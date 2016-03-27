package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.DependencyInversionPrinciple.Violated;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DipViolatedTest
{
    private Speak talk;

    @Before
    public void setUp() throws Exception
    {
        talk = new Speak();
    }

    @Test
    public void testWords() throws Exception
    {
        Assert.assertEquals("mamma", talk.getWord());
    }
}
