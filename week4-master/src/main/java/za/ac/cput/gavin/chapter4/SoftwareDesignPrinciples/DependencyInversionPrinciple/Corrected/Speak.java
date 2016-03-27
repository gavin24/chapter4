package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.DependencyInversionPrinciple.Corrected;


public class Speak implements Words
{
    @Override
    public String getWord(String word) {
        return word;
    }
}
