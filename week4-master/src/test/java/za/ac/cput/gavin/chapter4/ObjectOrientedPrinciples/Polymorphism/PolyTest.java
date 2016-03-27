package za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PolyTest
{
    private Move car, person;

    @Before
    public void setUp()
    {
        car = new CarMove();
        person = new PersonMove();
    }

    @Test
    public void testCar()
    {
        Assert.assertEquals("drives", car.getMove());
    }

    @Test
    public void testPerson()
    {
        Assert.assertEquals("walks", person.getMove());
    }
}
