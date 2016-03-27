package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.OpenClosedPrinciple.Corrected;


public class PetStore
{
    private IBuy buy;

    public PetStore()
    {
        buy = new Buy2();
    }

    public double buyAnimal(String animal)
    {
        return buy.buySomething(animal);
    }
}
