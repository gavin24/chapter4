package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Corrected;


public class Company
{
    private IBank money = new Bank();

    public double getMoney(double amount)
    {
        return money.getMoney(amount);
    }
}
