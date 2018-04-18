package thurs.sis;

/**
 *
 * @author john
 */
public class Person {
    private String name;
    private int age;
    protected static int numberOfPeople = 0;

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
        numberOfPeople++;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
