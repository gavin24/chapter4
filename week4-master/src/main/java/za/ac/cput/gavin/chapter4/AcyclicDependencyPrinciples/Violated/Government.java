package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Violated;


public class Government
{
    Parent taxpayer = new Parent(1500);

    public double getMoney()
    {
        return taxpayer.getMoney();
    }
}
