package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Corrected;


public class Services implements ATMService
{
    private float amount;

    public Services(float amnt)
    {
        amount = amnt;
    }

    @Override
    public float withdrawal(float amnt)
    {
        amount -= amnt;
        return amount;
    }

    @Override
    public float deposit(float amnt)
    {
        amount += amnt;
        return amount;
    }
}
