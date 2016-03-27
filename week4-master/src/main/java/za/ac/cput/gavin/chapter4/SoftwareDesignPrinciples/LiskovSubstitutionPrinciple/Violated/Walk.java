package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.LiskovSubstitutionPrinciple.Violated;


public class Walk extends Transport
{
    @Override
    public Boolean drive() throws UnsupportedOperationException
    {
        return false;
    }
}
