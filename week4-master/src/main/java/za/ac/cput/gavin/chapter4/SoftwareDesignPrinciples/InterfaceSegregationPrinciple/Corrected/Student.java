package za.ac.cput.gavin.chapter4.SoftwareDesignPrinciples.InterfaceSegregationPrinciple.Corrected;


public class Student implements IStudent {
    @Override
    public Boolean studies() {
        return true;
    }
}
