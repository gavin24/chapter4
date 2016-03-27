package za.ac.cput.gavin.chapter4.AcyclicDependencyPrinciples.Corrected;


public class Bank implements IBank
{
    @Override
    public double getMoney(double amount) {
        return amount*0.15;
    }
}
