package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;


public class Buy2 implements IBuy
{
    @Override
    public double buySomething(String thing)
    {
        if (thing == "cat")
            return 5.16;

        else if (thing == "dog")
            return 10.16;

        else if (thing == "tortoise")
            return 15.16;

        else if (thing == "catfood")
            return 10.0;

        else if (thing == "dogfood")
            return 5.0;

        else
            return 3.0;
    }
}

