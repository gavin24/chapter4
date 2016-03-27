package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Corrected;


public class Parent
{
    private IBank money = new Bank();

    public double getMoney(double amount)
    {
        return money.getMoney(amount);
    }
}
