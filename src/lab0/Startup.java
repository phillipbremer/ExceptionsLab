package lab0;

/**
 *
 * @author pbremer
 */
public class Startup {

    public static void main(String[] args) {

        Employee emp = new Employee("L","R","3333333333",28); //intentionally done
        
        // Think about this code. It wouldn't work if lastName was null
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
    }
}
