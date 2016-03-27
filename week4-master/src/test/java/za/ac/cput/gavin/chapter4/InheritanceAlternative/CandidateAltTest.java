package za.ac.cput.gavin.chapter4.InheritanceAlternative;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Encapsulation.FavouriteFood;

/**
 * Created by gavin.ackerman on 2016-03-27.
 */
public class CandidateAltTest {

    Person person  = new Person(5000);


    @Before
    public void setUp()
    {

    }

    @Test
    public void testSalary()
    {
        Assert.assertEquals(5000, person.getSalary());
    }
}
