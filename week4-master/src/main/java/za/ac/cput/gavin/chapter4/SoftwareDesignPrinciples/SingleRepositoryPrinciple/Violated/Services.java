package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.SingleRepositoryPrinciple.Violated;


public class Services implements ATMService
{
    @Override
    public void withdrawal()
    {

    }

    @Override
    public void deposit()
    {

    }

    @Override
    public int buyCar(int amount)
    {
        if (amount > 25000)
            return amount/25000;

        else
            return 0;
    }
}
