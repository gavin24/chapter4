package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Violated;

public class Parent
{
    private int amount;
    private Company job = new Company();


    public Parent(int amnt)
    {
        amount = amnt;
    }

    public double getMoney()
    {
        return job.getMoney();
    }
}
