package za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Inheritance;

public class Experience extends Candidate
{
    private String title;
    private Boolean qualified;

    public Experience(String nm, int exp)
    {
        super(nm, exp);
        title = "under";

        if (super.getYears() > 5)
        {
            qualified = true;
        }
        else
            qualified = false;
    }

    public Boolean getQualifies()
    {
        return qualified;
    }
}
