package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Corrected;


public class Car extends Transport
{
    @Override
    public Boolean getsThere()
    {
        return true;
    }

    @Override
    public Boolean drive()
    {
        return true;
    }
}
