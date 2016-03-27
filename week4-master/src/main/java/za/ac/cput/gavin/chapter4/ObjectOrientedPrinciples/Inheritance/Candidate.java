package za.ac.cput.gavin.chapter4.ObjectOrientedPrinciples.Inheritance;



public abstract class Candidate
{
    private String name;
    private int yearsOfExperience;

    public Candidate(String nm, int exp)
    {
        name = nm;
        yearsOfExperience = exp;
    }

    public int getYears()
    {
        return yearsOfExperience;
    }
    public abstract Boolean getQualifies();
}
