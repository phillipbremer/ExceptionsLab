package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  pbremer
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private final int MIN_LAST_NAME = 1;
    private final int MIN_FIRST_NAME = 2;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    //cannot be null or empty and greater than or equal to 2 chars
    public final void setFirstName(String firstName) throws IllegalArgumentException{
       if(firstName == null || firstName.isEmpty() || firstName.length() 
               <= MIN_FIRST_NAME){
           throw new IllegalArgumentException("First name cannot be shorter than"
                   + " 2 characters.");
       }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    //cannot be null or empty and must be greater or equal to 1
    public final void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName == null || lastName.isEmpty() || lastName.length() 
                <= MIN_LAST_NAME){
            throw new IllegalArgumentException("Last name cannot be shorter than"
                    + " 1 character.");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
