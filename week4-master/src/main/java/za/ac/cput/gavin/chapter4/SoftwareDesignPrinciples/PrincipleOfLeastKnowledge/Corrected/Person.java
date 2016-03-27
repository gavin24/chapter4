package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.PrincipleOfLeastKnowledge.Corrected;


public class Person implements IPerson
{
    private String name;
    private PreviousHome home;

    Person(String nm, int hmNumber)
    {
        name = nm;
        home = new PreviousHome(hmNumber);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPreviousHomeNumber() {
        return home.getNumber();
    }
}
