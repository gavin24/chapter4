package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.PrincipleOfLeastKnowledge.Violated;


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
    public PreviousHome getPreviousHome() {
        return home;
    }
}
