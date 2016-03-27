package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;


public class Buy implements IBuy
{
    @Override
    public double buySomething(String thing)
    {
        if (thing == "cat")
            return 5.16;

        else if (thing == "dog")
            return 10.16;

        else if (thing == "catfood")
            return 10.0;

        else
            return 5.0;
    }
}
