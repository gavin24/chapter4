package za.ac.cput.gavin.chapter4.InheritanceAlternative;

/**
 * Created by gavin.ackerman on 2016-03-27.
 */
public class Person {
    private Job job;
    private long amount;
    public Person(long amount){
        this.job=new Job();
        job.setSalary(amount);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
