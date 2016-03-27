package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.DependencyInversionPrinciple.Corrected;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DipCorrectedTest
{
    private Words talk;

    @Before
    public void setUp() throws Exception
    {
        talk = new Speak();
    }

    @Test
    public void testWords() throws Exception
    {
        Assert.assertEquals("mamma", talk.getWord("mamma"));
    }
}
