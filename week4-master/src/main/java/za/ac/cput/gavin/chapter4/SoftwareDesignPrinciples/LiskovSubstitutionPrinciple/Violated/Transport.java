package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Violated;


public abstract class Transport
{
    public Boolean getThere()
    {
        return true;
    }

    public abstract Boolean drive();
}
