package thurs.sis;

/**
 *
 * @author john
 */
public class Student extends Person {
    private int numberOfCreditsTaking;

    public Student(int numberOfCreditsTaking, String name, int age) {
        super(name, age);
        this.numberOfCreditsTaking = numberOfCreditsTaking;
    }

    @Override
    public String toString() {
        return super.toString()
               + " and is taking " 
               + this.numberOfCreditsTaking
               + " credits this semester";
    }

    public int getNumberOfCreditsTaking() {
        return numberOfCreditsTaking;
    }

    public void setNumberOfCreditsTaking(int numberOfCreditsTaking) {
        this.numberOfCreditsTaking = numberOfCreditsTaking;
    }
    
    
}
