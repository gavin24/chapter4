package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Violated;


public class Company
{
    private Government buy = new Government();

    public double getMoney()
    {
        return buy.getMoney();
    }
}
