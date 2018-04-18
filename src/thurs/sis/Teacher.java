package thurs.sis;

/**
 *
 * @author john
 */
public class Teacher extends Person {
    private int numberOfCreditsTeaching;

    public Teacher(int numberOfCreditsTeaching, String name, int age) {
        super(name, age);
        this.numberOfCreditsTeaching = numberOfCreditsTeaching;
    }

    public int getNumberOfCreditsTeaching() {
        return numberOfCreditsTeaching;
    }

    public void setNumberOfCreditsTeaching(int numberOfCreditsTeaching) {
        this.numberOfCreditsTeaching = numberOfCreditsTeaching;
    }
    
    
}
