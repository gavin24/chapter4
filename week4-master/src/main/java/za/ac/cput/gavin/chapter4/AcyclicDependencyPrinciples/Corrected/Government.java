package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Corrected;


public class Government
{
    private Company tax = new Company();

    public double getMoney()
    {
        return tax.getMoney(1500);
    }
}
