package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.DependencyInversionPrinciple.Violated;


public class Speak
{
    private Words word = new Words();

    public String getWord()
    {
        return word.getWord();
    }
}
