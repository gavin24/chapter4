package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Violated;


public class Lecturer implements Person
{
    @Override
    public Boolean lectures()
    {
        return true;
    }

    @Override
    public Boolean studies()
    {
        return false;
    }
}
