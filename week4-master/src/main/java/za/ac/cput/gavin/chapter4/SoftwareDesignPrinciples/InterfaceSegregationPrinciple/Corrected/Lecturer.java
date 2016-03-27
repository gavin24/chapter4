package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Corrected;


public class Lecturer implements ILecturer {
    @Override
    public Boolean teaches() {
        return true;
    }
}
