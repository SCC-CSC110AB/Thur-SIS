package thurs.sis;

/**
 *
 * @author john
 */
public class ThursSIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person sally = new Person("Sally", 18);
        
        System.out.println(sally.getName());
        
        System.out.println(Person.getNumberOfPeople());
        
        Person joe = new Student(12, "Joe", 20);
        
        System.out.println(joe.getName());
        System.out.println(Person.getNumberOfPeople());
        
        Student joeAsStudent = (Student)joe;
        
        System.out.println(joeAsStudent.getNumberOfCreditsTaking());
        
        System.out.println(Person.getNumberOfPeople());
        
        Person jerk = new Teacher(3, "Jerk", 99);
        
        // This is dangerous, don't do it!
//        Student jerkAsStudent = (Student)jerk;
//        
//        System.out.println(jerkAsStudent.getNumberOfCreditsTaking());

        System.out.println(joe);
    }
    
}
